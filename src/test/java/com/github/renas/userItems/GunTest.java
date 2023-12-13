package com.github.renas.userItems;

import com.github.renas.zombies.Zombie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GunTest {


    @Test
    void whenFoundBulletsShouldChangeBulletNum(){
        Gun gun = new Gun();
        gun.loadMag(7);
        assertEquals(7, gun.bullets);
    }
    @Test
    void whenUseBulletsIsCalledWhenBulletsIsFInishedShouldReturnOutOFAmmo(){
        Gun gun = new Gun();
        assertEquals(Ammo.OUT_OF_AMMO, gun.checkMags(7));
    }
    @Test
    void whenUseBulletsIsCalledWhenEnoughBulletsPresentShouldReturnEnoughBullets(){
        Gun gun = new Gun();
        gun.loadMag(10);
        assertEquals(Ammo.ENOUGH_BULLETS, gun.checkMags(7));
    }

    @Test
    void WhenUseWeaponIsCalledOneBulletIsUsed(){
        Gun gun = new Gun();
        gun.loadMag(2);
        gun.useWeapon();
        assertEquals(1,gun.bullets);
    }

    @Test
    void WhenUseWeaponIsCalled10DamageSHouldBeDoneToTheZombie(){
        Zombie zombiesToAttack = new Zombie();
        int beforeDamagedHealth = zombiesToAttack.health;
        Gun gun = new Gun();
        zombiesToAttack.damageInfliction(gun.useWeapon());
        assertEquals(beforeDamagedHealth - gun.gunDamage, zombiesToAttack.health);
    }
}