package com.jsonparsing;

import com.GameObjects.Enemy;
import com.GameObjects.Prompt;
import com.GameObjects.Room;
import com.GameObjects.RoomGenerator;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.List;

class jsonTestMain {

    public static void main(String[] args) {
        String jsonSource = "{ \"title\": \"Coder From Scratch\"}";


        try{
            JsonNode node = Json.parseStringToJson(jsonSource);

            System.out.println(node.toString());
           // enemyGobbo.forEach(System.out::println);
            List<Enemy> gobobo = (List<Enemy>) Json.parseJsonFile("src/main/resources/com/bbf/Enemies.JSON");
            System.out.println(gobobo.toString());
            System.out.println(gobobo.get(0).getType());
            RoomGenerator gen =new RoomGenerator();
            Room demo = gen.getGeneratedRoom();
            System.out.println(demo);


        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
