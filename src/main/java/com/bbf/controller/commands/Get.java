package com.bbf.controller.commands;

import com.bbf.client.Item;
import com.bbf.client.Location;
import com.bbf.controller.BbfController;

class Get implements Command
{
    public void execute(BbfController.Game myGame, Location[] locations, Item[] items, String command)
    {
        myGame.getPlayer().addItem(new Item());
    }
}