package com.GameObjects;

import com.jsonparsing.Json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoomGenerator {
    List<Enemy> allEnemies;
    List<Item> allItems;
    List<Prompt> allPrompts;
    List<Available_Directions> allDirections;
    Room generatedRoom;

    public RoomGenerator(){
        setAllDirections(Arrays.asList(Available_Directions.East,Available_Directions.West,Available_Directions.North,Available_Directions.South));

        try {
            setAllEnemies((List<Enemy>) Json.parseJsonFile("src/main/resources/com/bbf/Enemies.JSON"));
            setAllItems((List<Item>) Json.parseJsonFile("src/main/resources/com/bbf/Items.JSON"));
            setAllPrompts((List<Prompt>) Json.parseJsonFile("src/main/resources/com/bbf/Room_Prompts.JSON"));
            generateRoom();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//for now generate 1 of each thing per room
    public void generateRoom(){
        Room completedRoom = null;
        int promptMax = getAllPrompts().size();
        int enemyMax = getAllEnemies().size();
        int itemMax = getAllItems().size();
        completedRoom = new Room(getAllDirections(),getAllEnemies(),getAllItems(),getAllPrompts().get((int)(Math.random()*promptMax)));
       setGeneratedRoom(completedRoom);
    }

    public List<Enemy> getAllEnemies() {
        return allEnemies;
    }

    public void setAllEnemies(List<Enemy> allEnemies) {
        this.allEnemies = allEnemies;
    }

    public List<Item> getAllItems() {
        return allItems;
    }

    public void setAllItems(List<Item> allItems) {
        this.allItems = allItems;
    }

    public List<Prompt> getAllPrompts() {
        return allPrompts;
    }

    public void setAllPrompts(List<Prompt> allPrompts) {
        this.allPrompts = allPrompts;
    }

    public List<Available_Directions> getAllDirections() {
        return allDirections;
    }

    public void setAllDirections(List<Available_Directions> allDirections) {
        this.allDirections = allDirections;
    }

    public Room getGeneratedRoom() {
        return generatedRoom;
    }

    public void setGeneratedRoom(Room generatedRoom) {
        this.generatedRoom = generatedRoom;
    }

}
