package com.github.renas;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();

        String input2 = input.getInput("Start game? Y/N");
        if (Objects.equals(input2, "Y")){
            Start start = new Start();
        } else {
            System.exit(0);
        }

    }
}