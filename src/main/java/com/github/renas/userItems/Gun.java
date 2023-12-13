package com.github.renas.userItems;

public class Gun implements Weapon {

    public int bullets;

    public int gunDamage = 10;
    public Gun(){
    }

    public void loadMag(int numberOfBulletsFound){
        bullets+=numberOfBulletsFound;
    }
    public Ammo checkMag(){
        if (bullets<=0){
            return Ammo.OUT_OF_AMMO;
        } else {
            return Ammo.ENOUGH_BULLETS;
        }
    }

    @Override
    public int useWeapon() {
        if (checkMag() == Ammo.OUT_OF_AMMO) return 0;
        else {
            bullets-=1;
            return gunDamage;
        }
    }

    @Override
    public String toString() {
        return "<< +Gun +"+ bullets + " bullets >>";
    }
}
