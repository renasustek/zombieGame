package com.github.renas;

import com.github.renas.userItems.DamageLevel;
import com.github.renas.userItems.Weapon;
import com.github.renas.zombies.Zombie;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Player {

    private List<Weapon> weaponInventory = new ArrayList<>();

    private GoldCoins goldCoins = new GoldCoins();
    Input input = new Input();


    public Player() {

    }

    public boolean spendCoins(int spentAmount){
        return goldCoins.deduct(spentAmount);
    }

    public void playerDied(String reasonOfDeath) {
        System.out.println("you died" + reasonOfDeath + "sorry :(");
        System.exit(0);
    }

    public Weapon addToWeaponInventory(Weapon item) {
        weaponInventory.add(item);
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

        int numOfZombies = zombiesToAttack.zombieDifficulty.getNumOfZombies();

        System.out.println("You killed " + numOfZombies + " zombies and you collected " + goldCoins.collect(numOfZombies)+" gold coins");

    }

    private Weapon chooseWeapon() {

        System.out.println("Weapons in inventory:");
        ArrayList<Integer> indexOfWeapon = new ArrayList<Integer>();
        for (int x = 0 ; x < weaponInventory.size();x++){
            System.out.println("Choose "+x + " For "+ weaponInventory.get(x).toString());
            indexOfWeapon.add(x);
        }
        String chooseWeaponInput = input.getInput("which weapon do you want to use");
        return weaponInventory.get(parseInt(chooseWeaponInput));//todo add validator here
    }

        public String sneak () {
            return "shhhh, you snuck away";
        }

    }
