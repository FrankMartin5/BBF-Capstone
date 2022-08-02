//package com.bbf.controller.commands;
//
//import com.bbf.client.Item;
//import com.bbf.controller.BbfController;
//
//class Look implements Command
//{
//    public void execute(BbfController.Game myGame, Location[] locations, Item[] items, String command)
//    {
//
//        if(commandHasItem())
//            myGame.lookAt(new Item());
//        else if(commandHasLocation())
//            myGame.lookAt(new Location());
//    }
//
//    private boolean commandHasItem()
//    {
//        return false;
//    }
//
//    private boolean commandHasLocation()
//    {
//        return false;
//    }
//
//
//}