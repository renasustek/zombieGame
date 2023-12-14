package com.github.renas;

import com.github.renas.userItems.Gun;
import com.github.renas.zombies.Zombie;
import com.github.renas.zombies.ZombieHordeDifficulty;

import java.util.Objects;

public class Start {

    private Input input = new Input();
    private Player player = new Player();
    Gun gun1 = new Gun();


    public Start() {
        System.out.println("Welcome to ZombieLand, rules: DONT DIE.  Options will be in upper case");
        System.out.println("You wake up in a small house, you look outside and there is one zombie walking around" +
                "on the table there is a gun and 7 bullets");

        String input1 = input.getInput("Do you TAKE the gun and the bullets?");
        if (Objects.equals(input1, "TAKE")){

            gun1.loadMag(7);
           player.addToInventory(gun1);
            System.out.println(gun1.toString());

        }

        String input2 = input.getInput("you exit the house, do you ATTACK the zombie or SNEAK away from it?");

        switch (input2){
            case "ATTACK":
                player.attack(new Zombie(ZombieHordeDifficulty.SINGLE_ZOMBIE));
                break;
            case "SNEAK":
                System.out.println("player.sneak()");
        }

    }
}
