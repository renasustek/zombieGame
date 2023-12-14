package com.github.renas.userItems;

public class Gun implements Weapon {

    public int bullets;
    public Gun(){
    }

    public void loadMag(int numberOfBulletsFound){
        bullets+=numberOfBulletsFound;
    }

    @Override
    public DamageLevel use() {
        if (bullets<=0){
            return DamageLevel.NO_DAMAGE;
        } else {
            bullets-=1;
            System.out.println("SHOT FIRED - - - ¬");
            System.out.println("<< -1 bullets >>");
            return DamageLevel.MEDIUM_DAMAGE;
        }//todo hit or miss needs to be done
    }

    @Override
    public String toString() {
        return "<< +Gun +"+ bullets + " bullets >>";
    }
}
