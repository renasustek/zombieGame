package com.github.renas;

import com.github.renas.userItems.Gun;
import com.github.renas.userItems.Player;

import java.util.Objects;

public class Start {

    private Input input = new Input();
    private Player player = new Player();


    public Start() {
        System.out.println("Welcome to ZombieLand, rules: DONT DIE.  Options will be in upper case");
        System.out.println("You wake up in a small house, you look outside and there is one zombie walking around" +
                "on the table there is a gun and 7 bullets");

        String input1 = input.getInput("Do you TAKE the gun and the bullets?");

        if (Objects.equals(input1, "TAKE")){
            Gun gun1 = new Gun();
            gun1.bulletsFound(7);
            System.out.println(player.addToInventory(gun1));

        }

        String input2 = input.getInput("you exit the house, do you ATTACK the zombie or SNEAK away from it?");

        switch (input2){
            case "ATTACK":
                System.out.println(player.attack());
                break;
            case "SNEAK":
                System.out.println(player.sneak());
        }

    }
}
