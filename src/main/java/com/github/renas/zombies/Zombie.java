package com.github.renas.zombies;

public class Zombie {
    public int health = 30;

    public Zombie(){

    }
    public boolean damageInfliction(int damageDone){
        health -= damageDone;
        if(health <= 0){
            return true;
        } else {
            return false;
        }
    }




}
