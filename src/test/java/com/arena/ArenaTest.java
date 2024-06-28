package test.java.com.arena;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.com.arena.Arena;
import main.java.com.arena.Player;

public class ArenaTest {

    @Test
    public void testStartMatch() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena arena = new Arena();
        arena.startMatch(playerA, playerB);

        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
    }
}