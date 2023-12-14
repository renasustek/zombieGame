package com.github.renas.userItems;

public enum DamageLevel {
    NO_DAMAGE(0),
    LOW_DAMAGE(5),
    MEDIUM_DAMAGE(10),
    HIGH_DAMAGE(30);

    private final int value;
    DamageLevel(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
