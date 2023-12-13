package com.github.renas;

import java.util.Objects;
import java.util.Scanner;

public class Start {

    private Input input = new Input();
    public Start() {
        System.out.println("Welcome to ZombieLand, rules: DONT DIE.  Options will be in upper case");
        System.out.println("You wake up in a small house, you look outside and there is one zombie walking around" +
                "on the table there is a gun and 7 bullets");

        String input1 = input.getInput("Do you TAKE the gun and the bullets?");

        if (Objects.equals(input1, "TAKE")){
            System.out.println("+1 gun +7 bullets");
        }

        String input2 = input.getInput("you exit the house, do you ATTACK the zombie or SNEAK away from it?");

        switch (input2){
            case "ATTACK":
                System.out.println("attack zombie class here");
                break;
            case "SNEAK":
                System.out.println("sneak class here");
        }

    }
}
