package com.GameObjects;

public class Item {
    private String type;
    private int base_value;

    public Item(){

    }

    public Item(String theName, int theValue){
        setType(theName);
        setBase_value(theValue);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBase_value() {
        return base_value;
    }

    public void setBase_value(int base_value) {
        this.base_value = base_value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + type + '\'' +
                ", value=" + base_value +
                '}';
    }
}
