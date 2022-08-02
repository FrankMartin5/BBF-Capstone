//package com.bbf.client;
//
//public class CombatNPC extends Attacker
//{//CLASS FIELDS--------------------------------------------------------------
//    private double fightMultiplier;
//    private double reward = 100.0;
//
//    //CONSTRUCTORS--------------------------------------------------------------
//    public CombatNPC()
//    {
//        setName("an anonymous character");
//        setHealthPoints(healthPoints);
//        printStartingStatement();
//    }
//
//    public CombatNPC(String enemyName, short healthPoints)
//    {
//        setName(enemyName);
//        setHealthPoints(healthPoints);
//        printStartingStatement();
//    }
//    public CombatNPC(String enemyName, short healthPoints, double reward)
//    {
//        this(enemyName, healthPoints);
//        setReward(reward);
//        printReward();
//
//    }
//
//    //METHODS-------------------------------------------------------------------
//
//
//    public void printStartingStatement()
//    {
//        System.out.printf("Starting war with %s.. they have %d healthpoints", this.name, this.healthPoints);
//    }
//    public void printReward(){
//        System.out.printf("You'll earn %d if you win this fight!", this.reward);
//    }
//
//
//    //GETTERS & SETTERS---------------------------------------------------------
//    public double getReward()
//    {
//        return reward;
//    }
//
//    public void setReward(double reward)
//    {
//        this.reward = reward;
//    }
//
//    public void setFightMultiplier(double fightMultiplier)
//    {
//        this.fightMultiplier = fightMultiplier;
//    }
//
//    //TO STRING-----------------------------------------------------------------
//
//
//    //EQUALS--------------------------------------------------------------------
//
//
//    //INNER CLASSES-------------------------------------------------------------
//
//
//}