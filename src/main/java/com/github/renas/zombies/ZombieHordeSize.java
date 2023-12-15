package com.github.renas.zombies;

public enum ZombieHordeSize {
    SINGLE_ZOMBIE(1), TWO_ZOMBIES(2), THREE_ZOMBIES(3), FOUR_ZOMBIES(4), FIVE_ZOMBIES(5), TEN_ZOMBIES(10), ONE_HUNDRED_ZOMBIES(100);

    private final int numberOfZombies;
    ZombieHordeSize(int numberOfZombies) {
        this.numberOfZombies = numberOfZombies;
    }
    public int getNumOfZombies() {
        return numberOfZombies;
    }
}
