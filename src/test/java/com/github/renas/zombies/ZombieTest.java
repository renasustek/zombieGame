package com.github.renas.zombies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZombieTest {
    @Test
    void WhenDamageDoneIsTheSameAsHealthSHouldReturnTrue(){
        Zombie zombie = new Zombie();
        assertEquals(true, zombie.damageInfliction(30));
    }

    @Test
    void WhenDamageDoneIsGreaterThanHealthShouldReturnTrue(){
        Zombie zombie = new Zombie();
        assertEquals(true, zombie.damageInfliction(50));
    }

    @Test
    void WhenDamageDoneIsLessThanHealthShouldReturnFalse(){
        Zombie zombie = new Zombie();
        assertEquals(false, zombie.damageInfliction(20));
    }
}