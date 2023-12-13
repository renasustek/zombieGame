package com.github.renas.zombies;

public enum ZombieHordeDifficulty {
    SINGLE_ZOMBIE(1), EASY(2), MEDIUM(3), HARD(4), VERY_HARD(5);

    private final int numberOfZombies;
    ZombieHordeDifficulty(int numberOfZombies) {
        this.numberOfZombies = numberOfZombies;
    }
    public int getNumOfZombies() {
        return numberOfZombies;
    }
}
