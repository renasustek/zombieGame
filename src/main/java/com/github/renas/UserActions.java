package com.github.renas;

import java.util.List;
import java.util.Map;

public class UserActions extends User{
    public UserActions(){

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
