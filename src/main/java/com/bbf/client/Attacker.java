package com.bbf.client;

import java.util.WeakHashMap;

public abstract class Attacker
{

    private String name;
    private int healthPoints;
    private double damage;
    private boolean isAlive;
    private Weapon weapon;
    private double fightMultiplier;

    public Attacker(){
        setAlive(true);
        setHealthPoints(5);
        setDamage(1);
        setWeapon(new Fist());
    }

    public Attack attack()
    {
        return new Attack(this);
    }

    public void getsAttacked(Attack attack)
    {
        setDamage(attack.getDamage());
        if(getHealthPoints() <= getDamage())
            setAlive(false);
    }


    public double getWeaponMultiplier(){
        return this.weapon.getWeaponMultiplier();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public double getFightMultiplier() {
        return fightMultiplier;
    }

    public void setFightMultiplier(double fightMultiplier) {
        this.fightMultiplier = fightMultiplier;
    }
}
