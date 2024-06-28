package test.java.com.arena;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.com.arena.Player;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testRollDice() {
        Player player = new Player(50, 5, 10);
        int roll = player.rollDice();
        assertTrue(roll >= 1 && roll <= 6);
    }
}