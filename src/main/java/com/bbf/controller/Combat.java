package com.bbf.controller;

import com.GameObjects.Enemy;
import com.bbf.client.Player;

public class Combat
{
    public static void fight(Player player, Enemy attacker)
    {

        while (player.isAlive() && attacker.isAlive())
        {
            player.getsAttacked(attacker.attack());
            // TODO: 7/28/22 LET USER KNOW what is going on above
            attacker.getsAttacked(player.attack());
            // TODO: 7/28/22 LET USER KNOW what is going on above
        }

        whoDied(player, attacker);
    }

    private static void whoDied(Player player, Enemy attacker)
    {
        if (player.isAlive())
        {
            System.out.println("You win!");

            player.getPurse().setMoney(player.getPurse().getMoney()+ attacker.getGold());
        } else
        {
            System.out.println("You lose! Game over!");
            System.exit(0);
            // TODO: 7/28/22  System.out.println("Loading last saved point...");
        }
    }


}