package com.bbf.error;

import com.bbf.controller.commands.Command;
import org.reflections.Reflections;

import java.util.Set;

public class InvalidCommandException extends RuntimeException
{
    public InvalidCommandException(String message)
    {
        // TODO: 7/22/22 use a "Command" interface so that you can call all possible commands at runtime instead of hard coding it

        System.out.println("You have entered an invalid command: " + message + ". Valid Commands are...");
        //TODO GET ALL COMMAND VARIATIONS
        Reflections reflections = new Reflections("com.bbf.controller.commands");
        Set<Class<? extends Command>> commands = reflections.getSubTypesOf(Command.class);
        for (var i : commands)
            System.out.println("\t" + i.getSimpleName());
    }

    public static void main(String[] args)
    {
        try
        {
            throw new InvalidCommandException("Check");
        } catch (Exception e)
        {

        } finally
        {
            return;
        }
    }
}