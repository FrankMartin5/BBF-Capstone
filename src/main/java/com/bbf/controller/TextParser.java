
package com.bbf.controller;

import com.bbf.client.Location;
import com.bbf.controller.BbfController;
import com.bbf.error.InvalidCommandException;
import com.bbf.error.InvalidGetException;
import com.bbf.error.InvalidLocationException;
import com.bbf.error.InvalidLookException;
import com.bbf.client.Item;

import java.util.Scanner;
//import java.io.StreamTokenizer;

public class TextParser
{
    //CLASS FIELDS--------------------------------------------------------------
    private final String command;

    //CONSTRUCTOR---------------------------------------------------------------
    public TextParser()
    {
        System.out.println("Enter direction here: ");
        Scanner scanner = new Scanner(System.in);
        command = scanner.nextLine().trim();
    }

    //METHODS-------------------------------------------------------------------
    public void execute(BbfController.Game myGame, Location[] locations, Item[] items)
    {
        //THIS METHOD
        //CHECKS FOR ALL COMMANDS
        // TODO: 7/27/22 make checks at runtime instead of hardcoding different options 
        if (isGoCommand())
            if (isValidLocation(locations))
                move(locations, myGame);

            else if (isGetCommand())
                if (isValidItem(items))
                    storeItem(myGame, items);

                else if (isLookCommand())
                    if (isValidItem(items))
                        lookAtItem(myGame, items);
                    else if (isValidLocation(locations))
                        lookAtLocation(myGame, locations);
                    else
                        try
                        {
                            throw new InvalidLookException(command);
                        } finally
                        {
                            return;
                        }
                else
                    try
                    {
                        throw new InvalidCommandException(command);
                    }
                    //To continue execution of game
                    finally
                    {
                        return;
                    }
    }

    private void lookAtLocation(BbfController.Game myGame, Location[] locations)
    {
        // TODO: 7/26/22
    }

    private void lookAtItem(BbfController.Game myGame, Item[] items)
    {
        //TODO:
    }

    private boolean isLookCommand()
    {
        // TODO: 7/26/22
        return false;
    }

    private void storeItem(BbfController.Game myGame, Item[] items)
    {
        myGame.storeItem(getItemFromCommand(command));
    }

    private String getItemFromCommand(String command)
    {
        return null;
    }

    private boolean isValidItem(Item[] items)
    {
        //TODO check if item from given
        if (false)
            return true;
        else
            try
            {
                throw new InvalidGetException();
            } finally
            {
                return false;
            }
    }

    private boolean isGetCommand()
    {
        return false;
    }

    public void move(Location[] locations, BbfController.Game myGame)
    {
        if (isValidLocation(locations))
            //TODO: get the location from the whole command
            myGame.updateGameRoom(getLocationFromCommand(command));

    }

    private boolean isValidLocation(Location[] locations)
    {
        command.trim().toLowerCase();

        for (var validPath : locations)
            //using endswith so that if user types in "go to x" it'll still work
            if (command.endsWith(validPath.toString()))
                return true;

        //else
        System.out.println("Invalid Location!");
        showValidLocations(locations);
        try
        {
            throw new InvalidLocationException(getLocationFromCommand(command), locations);
        } finally
        {
            return false;
        }
    }

    private String getLocationFromCommand(String command)
    {
        String[] words = command.split(" ");

        //Returns the last word in the command
        return words[words.length - 1];
    }

    private void showValidLocations(Location[] locations)
    {
        System.out.println("The possible locations to take are...");
        for (var location : locations)
            System.out.println("\t" + location);
    }

    private boolean isGoCommand()
    {
        //TODO: CHECKS FOR Synonyms
        if (command.trim().toLowerCase().matches("^go{1}")) //TODO: VERIFTY REGEX WITH SENIOR ENG
            return true;
        return false;
    }
}
