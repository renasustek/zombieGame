package com.github.renas.userItems;

import com.github.renas.userLevels.AttackLevel;
import com.github.renas.userLevels.SneakLevel;
import com.github.renas.zombies.Zombie;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Weapon> weaponInventory = new ArrayList<>();

    private AttackLevel attackLevel;

    private SneakLevel sneakLevel;
    public Player(){

    }

    public Weapon addToInventory(Weapon item){
        weaponInventory.add(item);
        return item;
    }

    public void attack(Weapon weaponUsed, Zombie zombiesToAttack){
        System.out.println("the zombie health is: " + zombiesToAttack.health);

        while (!zombiesToAttack.isZombieDead()){
            Bullets bulletHittingZombie = weaponUsed.useWeapon();
            if (bulletHittingZombie == Bullets.OUT_OF_AMMO){
                System.out.println("OUT OF AMMO YOU DIED");
                break;
            }else {
                System.out.println("zombie health is: " + zombiesToAttack.damageInfliction(bulletHittingZombie.getValue()));
            }//todo need to update inventory inside of player to reflect change in bullets
        }

    }

    public String sneak(){
        return "shhhh, you sunk away";
    }

}
