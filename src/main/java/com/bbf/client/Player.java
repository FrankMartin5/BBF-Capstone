package com.bbf.client;

import com.GameObjects.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player extends Attacker {
    //CLASS FIELDS--------------------------------------------------------------
    private List<Item> inventory;
    private String name;
    private Purse purse;
    private int damage;


    //CONSTRUCTORS--------------------------------------------------------------
    public Player(){
    setDamage(0);
    setInventory(new ArrayList<Item>());
    setPurse(new Purse());
    setDamage(0);
    }
    //methods
    public void attackWhenPrompt(String item) {
        System.out.println("Here is your current item or items: " + item);

        System.out.println("Do you want to attack? Just type the word attack: ");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().toLowerCase().trim();

        if (userInput.equals("attack")) {
            System.out.println("You just attacked the " + item);
        } else {
            System.out.println("You have to type attack to continue");
            System.out.println("Try again!");
        }
        //attackWhenPrompt("");
    }

    //METHODS-------------------------------------------------------------------
    public boolean hasHealingItem() {
        boolean inventoryContainsPotion = false;
        for (Item i :
                inventory) {
            if (i.getType().equalsIgnoreCase("Health Potion")) inventoryContainsPotion = true;
        }
        return inventoryContainsPotion;
    }

    public void heal() {
        if (hasHealingItem()){
            for (Item i :
                    inventory) {
                if (i.getType().equalsIgnoreCase("Health Potion")){
                    inventory.remove(i);
                    break;
                }
            }
        }
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Purse getPurse() {
        return purse;
    }

    public void setPurse(Purse purse) {
        this.purse = purse;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Player{" +
                "inventory=" + inventory +
                ", name='" + name + '\'' +
                ", purse=" + purse +
                ", damage=" + damage +
                '}';
    }

    //EQUALS--------------------------------------------------------------------

    //INNER CLASSES-------------------------------------------------------------


}




