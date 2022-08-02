package com.jsonparsing;

import com.GameObjects.Enemy;
import com.GameObjects.Item;
import com.GameObjects.Prompt;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Json {
    private static ObjectMapper objectMapper = new ObjectMapper();

    private static ObjectMapper getDefaultObjectMapper(){
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        //

        return defaultObjectMapper;
    }
    public static JsonNode parseStringToJson(String theString) throws JsonProcessingException {
        return objectMapper.readTree(theString);
    }

    public static  <A> A fromJson(JsonNode node,Class<A> clazz) throws JsonProcessingException {
        return objectMapper.treeToValue(node,clazz);
    }

    public static Object parseJsonFile(String theFilePath) throws  IOException {
        String type = Paths.get(theFilePath).getFileName().toString();

        switch (type){
            case "Enemies.JSON":
                return Arrays.asList(objectMapper.readValue(Paths.get("src/main/resources/com/bbf/Enemies.JSON").toFile(), Enemy[].class));
            case "Items.JSON":
                return Arrays.asList(objectMapper.readValue(Paths.get("src/main/resources/com/bbf/Items.JSON").toFile(), Item[].class));
            case "Room_Prompts.JSON":
                return Arrays.asList(objectMapper.readValue(Paths.get("src/main/resources/com/bbf/Room_Prompts.JSON").toFile(), Prompt[].class));
            default:
                System.out.println("something went wrong in general parser");
        }
        return null;
    }
}
