package com.bbf.controller;

import com.GameObjects.Available_Directions;
import com.GameObjects.Enemy;
import com.GameObjects.Item;

import java.util.List;
import java.util.Scanner;

class TextParser2 {
    private String command;
    private Game currentGame;


    TextParser2(Game currentGame){
        setCurrentGame(currentGame);
        boolean validCommandEntered = false;
        Scanner scanner = new Scanner(System.in);
        while (validCommandEntered == false){
            System.out.println("enter valid command, Example: \"Get\" \"Gold\"");
        validCommandEntered = checkValidCommand(scanner.nextLine().trim());
        }
    }

    private boolean checkValidCommand(String enteredCommand){
       boolean isValid = false;
       String[] splitCommand = enteredCommand.split(" ");
       String firstPart = splitCommand[0].toLowerCase();

       String secondPart = splitCommand[1].toLowerCase();

       switch (firstPart){
           case "get":
               for (Item i :
                      currentGame.getCurrentRoom().getItems() ) {
                   if (i.getType().equalsIgnoreCase(secondPart)){
                       isValid = true;
                       currentGame.getPlayer().getInventory().add(i);
                       System.out.println("added "+i.getType()+" to inventory");
                   }
               }
               break;

           case "go":
               for (Available_Directions directions :
                       currentGame.getCurrentRoom().getAvailable_directions() ) {
                   if (directions.name().equalsIgnoreCase(secondPart)){
                       isValid = true;
                       currentGame.getRoomGenerator().generateRoom();
                       currentGame.setCurrentRoom(currentGame.getRoomGenerator().getGeneratedRoom());
                       System.out.println("Player goes "+secondPart);
                   }
               }
               break;
           case "heal":
               if (currentGame.getPlayer().hasHealingItem()){
                   currentGame.getPlayer().heal();
                   isValid = true;
                   System.out.println("Player used health potion");
               }
               break;
           case "help":
               if (secondPart.equalsIgnoreCase("Me")){
                   isValid = true;
                   displayHelp();
               }

           case "attack":
               for (Enemy e :
                       currentGame.getCurrentRoom().getEnemies()) {
                   if (e.getType().equalsIgnoreCase(secondPart)){
                       isValid = true;
                       //insert combat stuff here
                       System.out.println("valid combat command entered, not fully implemented");
                   }
               }
       }

       return isValid;
    }

    public Game getCurrentGame() {
        return currentGame;
    }

    public void setCurrentGame(Game currentGame) {
        this.currentGame = currentGame;
    }
    public void displayHelp(){
        System.out.println("Available commands are...");
        System.out.println("\t\"Get\" followed by item name that is in the room");
        System.out.println("Example: Get Gold");
        System.out.println("\t\"Go\" followed by an available direction");
        System.out.println("Go East");
        System.out.println("\t\"Heal\" \"Self\"");
        System.out.println("\t\"Attack\" followed by enemy type");
        System.out.println("Example: Attack Goblin");


    }
}
