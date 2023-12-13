package com.github.renas.userItems;

import com.github.renas.userItems.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Weapon> weaponInventory = new ArrayList<>();

    private Integer attackLevel;//TODO make into enum

    private Integer sneakLevel;//TODO make into enum
    public Player(){

    }

    public String addToInventory(Weapon item){
        weaponInventory.add(item);
        return item.toString();
    }

    public String attack(){
        return "zombies attacked";
    }

    public String sneak(){
        return "shhhh, you sunk away";
    }

}
