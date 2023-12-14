package com.github.renas.userItems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnifeTest {

    @Test
    void whenUseKnifeISCalledShouldReturnDamage(){
        Knife knife = new Knife();
        assertEquals(DamageLevel.HIGH_DAMAGE, knife.use());
    }
}