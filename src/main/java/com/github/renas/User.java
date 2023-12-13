package com.github.renas;

import java.util.Map;

public class User {//todo could be abstractClass/Interface

    private Map<Integer, String> inventory;//TODO make into enum

    private Integer attackLevel;//TODO make into enum

    private Integer sneakLevel;//TODO make into enum
    public User(){

    }

    public String addToInventory(Map<Integer, String> items){
        String toDisplay = "<< ";
        for (Map.Entry<Integer, String> entry : items.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            toDisplay += "+" + key + " " + value + " ";
        }
        return toDisplay + " >>";
    }

    public String attack(){
        return "zombies attacked";
    }

    public String sneak(){
        return "shhhh, you sunk away";
    }

}
