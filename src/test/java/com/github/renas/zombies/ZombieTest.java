package com.github.renas.zombies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZombieTest {
    @Test
    void WhenDamageDoneIsTheSameAsHealthSHouldReturnTrue(){
        Zombie zombie = new Zombie(ZombieHordeDifficulty.SINGLE_ZOMBIE);
        zombie.damageInfliction(30);
        assertEquals(true, zombie.isZombieDead());
    }

    @Test
    void WhenDamageDoneIsGreaterThanHealthShouldReturnTrue(){
        Zombie zombie = new Zombie(ZombieHordeDifficulty.SINGLE_ZOMBIE);
        zombie.damageInfliction(50);
        assertEquals(true, zombie.isZombieDead());
    }

    @Test
    void WhenDamageDoneIsLessThanHealthShouldReturnFalse(){
        Zombie zombie = new Zombie(ZombieHordeDifficulty.SINGLE_ZOMBIE);
        zombie.damageInfliction(20);
        assertEquals(false, zombie.isZombieDead());
    }
}