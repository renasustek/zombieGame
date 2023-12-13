package com.github.renas.userItems;

public class Gun implements Weapon {

    public int bullets;

    public int gunDamage = 10;
    public Gun(){
    }

    public void bulletsFound(int numberOfBulletsFound){
        bullets+=numberOfBulletsFound;
    }
    public void bulletsUsed(int numberOfBulletsUsed){
        bullets-=numberOfBulletsUsed;
    }

    @Override
    public String toString() {
        return "<< +Gun +"+ bullets + " bullets >>";
    }
}
