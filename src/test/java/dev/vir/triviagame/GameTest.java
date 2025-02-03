package dev.vir.triviagame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void testAddPlayer() {
        assertTrue(game.addPlayer("Alice"));
        assertTrue(game.addPlayer("Bob"));
        assertTrue(game.addPlayer("Charlie"));
        assertTrue(game.addPlayer("Dave"));
        assertTrue(game.addPlayer("Eve"));
        assertTrue(game.addPlayer("Frank"));
        assertFalse(game.addPlayer("Grace"));
    }

    @Test
    void testRoll() {
        game.addPlayer("Alice");
        game.roll(3);
    }

    @Test
    void testWasCorrectlyAnswered() {
        game.addPlayer("Alice");
        assertTrue(game.wasCorrectlyAnswered());
    }

    @Test
    void testWrongAnswer() {
        game.addPlayer("Alice");
        assertTrue(game.wrongAnswer());
    }

    @Test
    void testRoll_InPenaltyBox_OddRoll() {
        game.addPlayer("Alice");
        game.wrongAnswer();
        game.roll(3);
    }

    @Test
    void testRoll_InPenaltyBox_EvenRoll() {
        game.addPlayer("Alice");
        game.wrongAnswer();
        game.roll(4);
    }


    @Test
    void testWasCorrectlyAnswered_InPenaltyBoxAndNotGettingOut() {
        game.addPlayer("Player 1");
        game.addPlayer("Player 2");
        game.roll(3);
        game.wrongAnswer();

        game.roll(2);
        boolean result = game.wasCorrectlyAnswered();
        assertTrue(result, "The player stays in the game after a wrong answer while in the penalty box");
    }

    @Test
    void testGetCategoryUsingReflection() throws Exception {
        game.addPlayer("Alice");
        Method getCategoryMethod = Game.class.getDeclaredMethod("getCategory", int.class);
        getCategoryMethod.setAccessible(true);

        for (int i = 0; i < 12; i++) {
            String category = (String) getCategoryMethod.invoke(game, i);
            assertEquals(i % 4 == 0 ? "Pop" : i % 4 == 1 ? "Science" : i % 4 == 2 ? "Sports" : "Rock", category);
        }
    }

    @Test
    void testWasCorrectlyAnswered_PlayerInPenaltyBoxAndNotGettingOut() {
        game.addPlayer("Player 1");
        game.addPlayer("Player 2");
        game.roll(3);
        game.wrongAnswer();

        int previousPlayer = game.getCurrentPlayer();

        game.roll(2);
        boolean result = game.wasCorrectlyAnswered();

        assertNotEquals(previousPlayer, game.getCurrentPlayer(), "Player need to change for next one");
        assertTrue(result, "Wait fot true");
    }
}