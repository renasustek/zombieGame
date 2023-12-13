package com.github.renas.userItems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GunTest {


    @Test
    void whenFoundBulletsShouldChangeBulletNum(){
        Gun gun = new Gun();
        gun.bulletsFound(7);
        assertEquals(7, gun.bullets);
    }
    @Test
    void whenUseBulletsShouldChangeBulletNum(){
        Gun gun = new Gun();
        gun.bulletsUsed(7);
        assertEquals(-7, gun.bullets);
    }
}