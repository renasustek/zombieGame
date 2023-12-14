package com.github.renas.userItems;

import com.github.renas.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player = new Player();

    @Test
    void whenGivenValidWeaponShouldAddToListAndReturnString(){
        Gun testGun = new Gun();

        assertEquals(testGun, player.addToInventory(testGun));

    }



}