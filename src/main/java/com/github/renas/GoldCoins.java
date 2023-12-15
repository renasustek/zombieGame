package com.github.renas;

public class GoldCoins {
    public int amountOfCoins;

    public GoldCoins(){

    }

    public int collect(int coinsCollected){
         return amountOfCoins+=coinsCollected;
    }

    public boolean deduct(int coinsDeducted){
        if (amountOfCoins-coinsDeducted<0){
            return false;
        }else {
            amountOfCoins -= coinsDeducted;
            return true;
        }
    }



}
