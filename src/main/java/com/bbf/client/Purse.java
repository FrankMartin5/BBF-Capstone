package com.bbf.client;

public class Purse
{
    private double money;

    Purse(){
        setMoney(0);
    }

    public double getMoney()
    {
        return money;
    }

    public void setMoney(double money)
    {
        this.money = money;
    }
}