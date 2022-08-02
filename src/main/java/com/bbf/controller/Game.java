package com.bbf.controller;

import com.GameObjects.*;
import com.bbf.client.Player;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game implements Serializable
{
    private RoomGenerator roomGenerator;
    private Room currentRoom;
    private List<Room> allRooms;
    private Player player;


    Game(){
    setRoomGenerator(new RoomGenerator());
    setCurrentRoom(getRoomGenerator().getGeneratedRoom());
    setAllRooms(new ArrayList<Room>());
    allRooms.add(currentRoom);
    setPlayer(new Player());
    }

    public void play()
    {

        while (true)
        {
            showOptions();
            TextParser2 consoleParser = new TextParser2(this);
            //command.execute(this, locations, roomItems);
        }
    }

    private void showOptions()
    {
//            System.out.println("You are in room " + currentRoom);
//            System.out.println("The items in the rooms are...");
//            for (item : roomItems)
//                System.out.println("\t" + item);
//

        //show current room
        System.out.println(currentRoom.getRoom_prompt().getPrompt());
        System.out.println();
        //show items in the room
        System.out.println("Items in the room");
        for (Item i :
                currentRoom.getItems()) {
            System.out.println("\t"+i.getType());
        }
        //show enemies
        System.out.println("Enemies in the room");
        for (Enemy enemy :
                currentRoom.getEnemies()) {
            System.out.println("\t"+enemy.getType());
        }
        System.out.println("Available Directions");
        for (Available_Directions directions :
                currentRoom.getAvailable_directions()) {
            System.out.println("\t"+directions.name());
        }

        System.out.println("\nTo quit the game enter \"q\", otherwise any key to continue");

        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();

        if (input.equals("q"))
            System.exit(0);

    }

    public RoomGenerator getRoomGenerator() {
        return roomGenerator;
    }

    public void setRoomGenerator(RoomGenerator roomGenerator) {
        this.roomGenerator = roomGenerator;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        //allRooms.add(currentRoom);
        this.currentRoom = currentRoom;
    }

    public List<Room> getAllRooms() {
        return allRooms;
    }

    public void setAllRooms(List<Room> allRooms) {
        this.allRooms = allRooms;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}