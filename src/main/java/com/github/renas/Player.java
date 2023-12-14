package com.github.renas;

import com.github.renas.userItems.DamageLevel;
import com.github.renas.userItems.Gun;
import com.github.renas.userItems.Knife;
import com.github.renas.userItems.Weapon;
import com.github.renas.userLevels.AttackLevel;
import com.github.renas.userLevels.SneakLevel;
import com.github.renas.zombies.Zombie;

import java.util.*;

public class Player {

    private List<Weapon> weaponInventory = new ArrayList<>();

    private AttackLevel attackLevel;

    private SneakLevel sneakLevel;

    Input input = new Input();

    public Player() {

    }

    public void playerDied(String reasonOfDeath) {
        System.out.println("you died" + reasonOfDeath + "sorry :(");
    }

    public Weapon addToInventory(Weapon item) {
        weaponInventory.add(item);//todo need to find a way of putting weapon type and weapon into map
        return item;
    }

    public void attack(Zombie zombiesToAttack) {

        Weapon weaponUsed = chooseWeapon();

        System.out.println("the zombie health is: " + zombiesToAttack.health);


        while (!zombiesToAttack.isZombieDead()) {
            DamageLevel bulletHittingZombie = weaponUsed.use();
            if (bulletHittingZombie == DamageLevel.NO_DAMAGE) {
                playerDied("you ran out of ammo and the zombies overran you");
                break;
            } else {
                System.out.println("zombie health is: " + zombiesToAttack.damageInfliction(bulletHittingZombie.getValue()));
            }
        }
    }

    private Weapon chooseWeapon() {
        System.out.println("Weapons in inventory:");
        for (Weapon weapon : weaponInventory){
            System.out.println(weapon.toString());
        }
        String chooseWeaponInput = input.getInput("which weapon do you want to use");

        switch (chooseWeaponInput) {
            case "GUN":
                for (Weapon weapon : weaponInventory) {
                    if (weapon instanceof Gun) {
                        return Optional.of(weapon);
                    }
                }
                return Optional.empty();
                break;
            case "KNIFE":
                for (Weapon weapon : weaponInventory) {
                    if (weapon instanceof Knife) {
                        return Optional.of(weapon);
                    }
                }
                Optional.empty();
        }
        return Optional.empty()
    }

        public String sneak () {
            return "shhhh, you snuck away";
        }

    }
