package com.github.renas.zombies;

public class Zombie {
    public int health;

    public Zombie(ZombieHordeDifficulty zombieHordeDifficulty){
        this.health = zombieHordeDifficulty.getNumOfZombies() * 30;
    }
    public int damageInfliction(int damageDone){
        health -= damageDone;
        return health;
    }

    public boolean isZombieDead(){
        return health <= 0;
    }

}
