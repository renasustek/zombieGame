package com.github.renas.userItems;

import com.github.renas.zombies.Zombie;
import com.github.renas.zombies.ZombieHordeDifficulty;
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
    void WhenUseWeaponIsCalledOneBulletIsUsed(){
        Gun gun = new Gun();
        gun.loadMag(2);
        gun.use();
        assertEquals(1,gun.bullets);
    }

    @Test
    void weaponCalledButNoBulletsNoDamageShouldBeDoneToZombie(){
        Zombie zombiesToAttack = new Zombie(ZombieHordeDifficulty.SINGLE_ZOMBIE);
        int beforeDamagedHealth = zombiesToAttack.health;
        Gun gun = new Gun();
        zombiesToAttack.damageInfliction(gun.use().getValue());
        assertEquals(30, zombiesToAttack.health);
    }
    @Test
    void WhenUseWeaponIsCalled10DamageSHouldBeDoneToTheZombie(){
        Zombie zombiesToAttack = new Zombie(ZombieHordeDifficulty.SINGLE_ZOMBIE);
        int beforeDamagedHealth = zombiesToAttack.health;
        Gun gun = new Gun();
        gun.loadMag(1);
        zombiesToAttack.damageInfliction(gun.use().getValue());
        assertEquals(beforeDamagedHealth - gun.gunDamage, zombiesToAttack.health);
    }
}