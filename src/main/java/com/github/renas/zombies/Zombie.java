package com.github.renas.zombies;

public class Zombie {
    public int health;
    public ZombieHordeDifficulty zombieDifficulty;

    public Zombie(ZombieHordeDifficulty zombieHordeDifficulty){
        this.health = zombieHordeDifficulty.getNumOfZombies() * 30;
        this.zombieDifficulty = zombieHordeDifficulty;
    }
    public int damageInfliction(int damageDone){
        health -= damageDone;
        return health;
    }

    public boolean isZombieDead(){
        return health <= 0;
    }

}
