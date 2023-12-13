package com.github.renas.userItems;

import com.github.renas.userItems.Weapon;
import com.github.renas.userLevels.AttackLevel;
import com.github.renas.userLevels.SneakLevel;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Weapon> weaponInventory = new ArrayList<>();

    private AttackLevel attackLevel;

    private SneakLevel sneakLevel;
    public Player(){

    }

    public Weapon addToInventory(Weapon item){
        weaponInventory.add(item);
        return item;
    }

    public String attack(Weapon weaponUsed){

        return "zombies attacked";
    }

    public String sneak(){
        return "shhhh, you sunk away";
    }

}
