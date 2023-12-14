package com.github.renas;

public class GoldCoins {
    public int amountOfCoins;

    public GoldCoins(){

    }

    public int collect(int coinsCollected){
         return amountOfCoins+=coinsCollected;
    }

    public int deduct(int coinsDeducted){
        if (checkSuffcientFunds()){
            return 0;
        }
         return amountOfCoins-= coinsDeducted;
    }

    private boolean checkSuffcientFunds(){
        return amountOfCoins <= 0;
    }

}
