package com.github.renas.userItems;

public class Gun implements Weapon {

    public int bullets;

    public int gunDamage = 10;
    public Gun(){
    }

    public void loadMag(int numberOfBulletsFound){
        bullets+=numberOfBulletsFound;
    }

    @Override
    public Bullets useWeapon() {
        if (bullets<=0){
            return Bullets.OUT_OF_AMMO;
        } else {
            bullets-=1;
            System.out.println("SHOT FIRED - - - ¬");
            System.out.println("<< -1 bullets >>");
            return Bullets.HIT;
        }//todo hit or miss needs to be done
    }

    @Override
    public String toString() {
        return "<< +Gun +"+ bullets + " bullets >>";
    }
}
