package com.bbf.controller;

import com.GameObjects.Item;
import com.GameObjects.Room;
import com.bbf.client.*;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;

public class BbfController
{
    private Game currentGame;

    public BbfController(){
        execute();
    }

    public void execute(){
        welcomeMessage();
        chooseGameOptions();
        currentGame.play();
    }

    private void welcomeMessage()
    {
        try {
            printSplash();
        }
        catch (Exception e){
            System.out.println("print splash failed");
        }
        System.out.println("BBF: Bigger Badder Faster\n");
        System.out.println("Placeholder for more info on the game\n");
        System.out.println("Go [location] north, south, east, west\n");
        System.out.println("Get [item] get any item available in the room\n");
    }
    private void printSplash() throws FileNotFoundException {
        File splashTxt = new File("src/main/resources/com/bbf/SplashScreen_1.txt");
        Scanner scan = new Scanner(splashTxt);

        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
    }

    private void chooseGameOptions()
    {
        System.out.println("1. start new game\n2. load game");
        Scanner scnr = new Scanner(System.in);

        String userInput = scnr.nextLine();
        if(userInput.equals("1"))
            freshGame();
    }

    public void freshGame()
    {
        currentGame = new Game();
    }

//    public void loadGame()
//    {
//        //TODO: retrieve saved games
//        if(!GameSaver.hasSavedGames() && GameSaver.playSavedGames())
//        {
//            currentGame = null;
//            // TODO: 7/20/22 use GameSaver.selectSavedGame() above
//            return;
//        }
//        freshGame();
//    }

    public void endGame() {
        goodbyeMessage();

    }

    private void goodbyeMessage()
    {
        System.out.println("You are exiting");
    }



}