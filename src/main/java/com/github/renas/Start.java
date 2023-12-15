package com.github.renas;

import com.github.renas.userItems.Gun;
import com.github.renas.userItems.Knife;
import com.github.renas.zombies.Zombie;
import com.github.renas.zombies.ZombieHordeSize;

import java.util.Objects;

public class Start {

    private Input input = new Input();
    private Player player = new Player();

    public Start() {
        System.out.println("----------------THE BEST ZOMBIE GAME EVER CREATED----------------");
        System.out.println("You wake up in a hospital, flickering lights and blood everywhere. Youu look outside of a broken window" +
                "to see a ZOOOOMMMBIEEEE, you panic and into the corridor, on the ground lays a dead police officer" +
                "on his holster a gun. ");
        String input1 = input.getInput("Do you TAKE the gun and the bullets?");
        Gun gun1 = new Gun();
        if (Objects.equals(input1, "TAKE")){
            gun1.loadMag(7);
           player.addToWeaponInventory(gun1);
            System.out.println(gun1.toString());
        }

        System.out.println("You hear a zombie approaching, it still hasn't seen you. ");
        String input2 = input.getInput("do you ATTACK or SNEAK away");
        switch (input2){
            case "ATTACK":
                player.attack(new Zombie(ZombieHordeSize.SINGLE_ZOMBIE));
                System.out.println("You have no idea what this cold coin is," +
                        "you keep it anyways. It looks nice");
                break;
            case "SNEAK":
                System.out.println(player.sneak());
                break;
        }

        String input6 = input.getInput("You come across another dead police officer, no gun. But bullets. Do you TAKE them?");
        if (Objects.equals(input6, "TAKE")){
            gun1.loadMag(10);
            System.out.println(gun1.toString());
        }


        System.out.println("You run and run and run, panting and out of breath. You are now tired and thirsty" +
                " thankfully you see a corner shop. What do you do.");
        String input3 = input.getInput("do you GO inside of the corner shop, or do you RUN away a " +
                "coward");
        switch (input3){
            case "GO":
                System.out.println("you see two zombies inside, right behind them WATTTERRRRR. " +
                        "you want it");
                String input4 = input.getInput("do you KILL the zombies, or do you RUN away");
                switch (input4){
                    case "KILL":
                        player.attack(new Zombie(ZombieHordeSize.TWO_ZOMBIES));
                        System.out.println("Pushing the zombies dead bodies away, you " +
                                "quickly grab the water and drink. More gold coins?????" +
                                "'what is this??, hmmm looks expensive ill keep it!'");
                        break;
                    case "RUN":
                        player.sneak();
                        System.out.println("'IM SOOOO THIRSTY'");
                }
                break;
            case "RUN":
                System.out.println("you run away");
                break;

        }

        String input5 = input.getInput("you see a cat surrounded by 3 zombies do you SAVE the dog, or SNEAK away?");
        switch (input5){
            case "SAVE":
                player.attack(new Zombie(ZombieHordeSize.THREE_ZOMBIES));
                System.out.println("The cat looks at you for a brief second, and runs away");
                break;
            case "SNEAK":
                player.sneak();
                System.out.println("How could you leave a cat to die. Tut tut tut.");
                break;
        }
        System.out.println("You see your mum running away from some zombies, she runs into an old house" +
                " you run into the house to rescue her");
        String input7 = input.getInput("you enter the house theres stairs to go UP(where the screaming" +
                "is coming from, or do you go DOWN to the basement");
        switch (input7){
            case "UP":
                System.out.println("you see your mother surrounded by 10 zombies.");
                String input8 = input.getInput("do you ATTACK the zombies, or do you RUN away");
                switch (input8){
                    case "ATTACK":
                        player.attack(new Zombie(ZombieHordeSize.TEN_ZOMBIES));
                        System.out.println("you saved your mother, you run away to America where there are no" +
                                "zombies, you live happily ever after");
                        System.exit(0);
                        break;
                    case "RUN":
                        player.sneak();
                        System.out.println("You left your own mother to die.");
                        System.out.println("A swarm of 100 zombies come your way, surrounded you have no choice to attak");
                        player.attack(new Zombie(ZombieHordeSize.ONE_HUNDRED_ZOMBIES));
                        break;
                }
                break;
            case "DOWN":
                System.out.println("You see a door, on the door it says 'put 5 coins inside of me'");
                String input9 = input.getInput("do you INSERT your coins or do you go UP to save your mother");
                switch (input9){
                    case "INSERT":
                        if (player.spendCoins(5)){
                            System.out.println("the door opens, revealing a knife, you take the knife immediately and run upstairs to save your mum");
                            player.addToWeaponInventory(new Knife());
                        } else{
                            System.out.println("not enough coins, it returned your coins, but your mum is screaming more. So you run upstairs" +
                                    " to save her");
                        }
                        break;
                    case "UP":
                        System.out.println("you leave the basement");
                        break;
                }
                System.out.println("you enter the room and see your mother");
                System.out.println("you see your mother surrounded by 10 zombies.");
                System.out.println("You attack without thinking");
                player.attack(new Zombie(ZombieHordeSize.TEN_ZOMBIES));
                System.out.println("you saved your mother, you run away to America where there are no" +
                        "zombies, you live happily ever after");
                System.exit(0);
        }

    }
}
