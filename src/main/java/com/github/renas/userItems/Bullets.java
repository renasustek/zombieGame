package com.github.renas.userItems;

public enum Bullets {
    OUT_OF_AMMO(0),
    HIT(10),
    MISSED(0);

    private final int value;
    Bullets(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
