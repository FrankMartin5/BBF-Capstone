package com.GameObjects;

import com.bbf.client.Attacker;

public class Enemy extends Attacker {
    private String type;
    private int health;
    private int attack;
    private int xp_value;
    private int gold;
    private int armor;

    public Enemy(){
    }

    public Enemy(String theName, int theHealth, int theAttack, int theXP, int theGold, int theArmor){
        setHealth(theHealth);
        setAttack(theAttack);
        setXp_value(theXP);
        setArmor(theArmor);
        setGold(theGold);
        setType(theName);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getXp_value() {
        return xp_value;
    }

    public void setXp_value(int xp_value) {
        this.xp_value = xp_value;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "type='" + type + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", xp_value=" + xp_value +
                ", gold=" + gold +
                ", armor=" + armor +
                '}';
    }
}
