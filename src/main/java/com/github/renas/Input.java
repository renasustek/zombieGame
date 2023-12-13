package com.github.renas;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);// instantiates scanner class
    public String getInput(String inputLine){// pass in input title and input line
        System.out.println(inputLine);
        return scanner.nextLine();// returns the next line the user types in

    }


}