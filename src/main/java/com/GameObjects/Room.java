package com.GameObjects;

import java.util.List;

public class Room {
    List<Available_Directions> available_directions;
    List<Item> items;
    List<Enemy> enemies;
    Prompt room_prompt;

    public Room(List<Available_Directions> theAvailableDirections,List<Enemy> theEnemies, List<Item> theItems, Prompt theRoomPrompt){
        setRoom_prompt(theRoomPrompt);
        setEnemies(theEnemies);
        setItems(theItems);
        setAvailable_directions(theAvailableDirections);
    }

    public List<Available_Directions> getAvailable_directions() {
        return available_directions;
    }

    public void setAvailable_directions(List<Available_Directions> available_directions) {
        this.available_directions = available_directions;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public Prompt getRoom_prompt() {
        return room_prompt;
    }

    public void setRoom_prompt(Prompt room_prompt) {
        this.room_prompt = room_prompt;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Room{" + "available_directions="+"\n");
        for (Available_Directions direction :
                available_directions) {
            str.append(direction.toString());
            str.append("\n");
        }
        str.append(", items="+"\n");
        for (Item i :
                items) {
            str.append(i.toString()+"\n");
        }
        str.append(", enemies="+"\n");
        for (Enemy e :
                enemies) {
            str.append(e.toString()+"\n");
        }
        str.append(", room_prompt= "+room_prompt.getPrompt());

        return str.toString();
    }
}
