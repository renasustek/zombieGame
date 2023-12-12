package com.github.renas;

import java.util.Scanner;

public class Start {
    public Start() {
        System.out.println("Welcome to ZombieLand, rules: DONT DIE.  Options will be in upper case");
        System.out.println("You wake up in a small house, you look outside and there is one zombie walking around" +
                "on the table there is a gun and 7 bullets");
        System.out.println("Do you TAKE the gun and the bullets?");
//        System.out.println("Do you EXIT the small house");

        String input1;
        do {
            Scanner scanner = new Scanner(System.in);
            input1 = scanner.nextLine();
        } while (input1 != "TAKE");

        if (input1 =="TAKE"){
            System.out.println("add gun and bullets to inventory");
        }

        System.out.println("you exit the house, do you ATTACK the zombie or SNEAK away from it?");
        Scanner scanner = new Scanner(System.in);
        String input2 = scanner.nextLine();

        switch (input2){
            case "ATTACK":
                System.out.println("attack zombie class here");
                break;
            case "SNEAK":
                System.out.println("sneak class here");
        }
    }
}
