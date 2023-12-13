package com.github.renas.userItems;

import com.github.renas.Input;
import com.github.renas.userLevels.AttackLevel;
import com.github.renas.userLevels.SneakLevel;
import com.github.renas.zombies.Zombie;

import java.util.ArrayList;
import java.util.List;

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
        weaponInventory.add(item);
        return item;
    }

    public void attack(Zombie zombiesToAttack) {

        Weapon weaponUsed = chooseWeapon();

        System.out.println("the zombie health is: " + zombiesToAttack.health);

        while (!zombiesToAttack.isZombieDead()) {
            Bullets bulletHittingZombie = weaponUsed.useWeapon();
            if (bulletHittingZombie == Bullets.OUT_OF_AMMO) {
                playerDied("you ran out of ammo and the zombies overran you");
                break;
            } else {
                System.out.println("zombie health is: " + zombiesToAttack.damageInfliction(bulletHittingZombie.getValue()));
            }
        }
    }

    private Weapon chooseWeapon() {
        String chooseWeaponInput = input.getInput("Do you want to use a GUN or a KNIFE?");
        switch (chooseWeaponInput) {
            case "GUN":
                for (Weapon weapon : weaponInventory) {
                    if (weapon instanceof Gun) {
                        return weapon;
                    }
                }
                break;
            case "KNIFE":
                for (Weapon weapon : weaponInventory) {
                    if (weapon instanceof Knife) {
                        return weapon;
                    }
                }

        }
        return null;
    }

        public String sneak () {
            return "shhhh, you snuck away";
        }

    }
