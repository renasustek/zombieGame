package com.github.renas.zombies;

public class Zombie {
    public int health;
    public ZombieHordeSize zombieDifficulty;

    public Zombie(ZombieHordeSize zombieHordeSize){
        this.health = zombieHordeSize.getNumOfZombies() * 30;
        this.zombieDifficulty = zombieHordeSize;
    }
    public int damageInfliction(int damageDone){
        health -= damageDone;
        return health;
    }

    public boolean isZombieDead(){
        return health <= 0;
    }

}
