package com.github.renas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldCoinsTest {

    @Test
    void addCoins(){
        GoldCoins goldCoins = new GoldCoins();
        goldCoins.collect(10);
        assertEquals(10, goldCoins.amountOfCoins);
    }

    @Test
    void deductCoinsWhenThereIsSuffcientFunds(){
        GoldCoins goldCoins = new GoldCoins();
        goldCoins.collect(10);
        goldCoins.deduct(5);
        assertEquals(5, goldCoins.amountOfCoins);
    }
    @Test
    void deductCoinsWhenThereIsInsuffcientFunds(){
        GoldCoins goldCoins = new GoldCoins();
        goldCoins.deduct(1);
        assertEquals(0, goldCoins.amountOfCoins);
    }
}