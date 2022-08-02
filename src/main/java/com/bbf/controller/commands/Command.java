package com.bbf.controller.commands;

import com.GameObjects.Item;
import com.GameObjects.Room;
import com.bbf.controller.Game;

import java.util.List;

public interface Command
{
    public void execute(Game myGame, List<Room> rooms, List<Item> items, String command);
}