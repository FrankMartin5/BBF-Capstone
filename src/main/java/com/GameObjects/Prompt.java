package com.GameObjects;

public class Prompt {
    String prompt;

    public  Prompt(){

    }
    public Prompt(String thePrompt){
        setPrompt(thePrompt);
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    @Override
    public String toString() {
        return "Prompt{" +
                "prompt='" + prompt + '\'' +
                '}';
    }
}
