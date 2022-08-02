package com.bbf.client;

import java.util.Random;

public class Attack
{
    //CLASS FIELDS--------------------------------------------------------------
    private double fightMultiplier = .1;

    //CONSTRUCTORS--------------------------------------------------------------
    public Attack(Attacker attacker)
    {
        this.fightMultiplier = attacker.getFightMultiplier() + attacker.getWeaponMultiplier();//METHODS-------------------------------------------------------------------
    }

    //GETTERS & SETTERS---------------------------------------------------------
    public double getFightMultiplier()
    {
        return this.fightMultiplier;
    }

    public double getDamage()
    {

        // TODO: 7/28/22 print out damage
        Random random = new Random();
        return getFightMultiplier() * random.nextDouble() * 100;

    }

    //TO STRING-----------------------------------------------------------------


    //EQUALS--------------------------------------------------------------------


    //INNER CLASSES-------------------------------------------------------------
}