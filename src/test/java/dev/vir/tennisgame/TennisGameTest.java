package dev.vir.tennisgame;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisGameTest {

    @Test
    public void testStartGame() {
        TennisGame game = new TennisGame("player1", "player2");
        assertEquals("Love-All", game.getScore());
    }

    @Test
    public void testPlayer1WinsFirstPoint() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        assertEquals("Fifteen-Love", game.getScore());
    }

    @Test
    public void testPlayer2WinsFirstPoint() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player2");
        assertEquals("Love-Fifteen", game.getScore());
    }

    @Test
    public void testPlayer1WinsFourPoints() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        assertEquals("Win for player1", game.getScore());
    }

    @Test
    public void testPlayer2WinsFourPoints() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        assertEquals("Win for player2", game.getScore());
    }

    @Test
    public void testDeuce() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        assertEquals("Deuce", game.getScore());
    }

    @Test
    public void testAdvantagePlayer1() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player1");
        assertEquals("Advantage player1", game.getScore());
    }

    @Test
    public void testAdvantagePlayer2() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        assertEquals("Advantage player2", game.getScore());
    }

    @Test
    public void testPlayer1WinsAfterAdvantage() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player1");
        game.wonPoint("player1");
        assertEquals("Win for player1", game.getScore());
    }

    @Test
    public void testLoveAll() {
        TennisGame game = new TennisGame("player1", "player2");
        assertEquals("Love-All", game.getScore());
    }

    @Test
    public void testFifteenAll() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        game.wonPoint("player2");
        assertEquals("Fifteen-All", game.getScore());
    }

    @Test
    public void testThirtyAll() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        assertEquals("Thirty-All", game.getScore());
    }

    @Test
    public void testFortyAll() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        assertEquals("Deuce", game.getScore());
    }

    @Test
    public void testLoveFifteen() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player2");
        assertEquals("Love-Fifteen", game.getScore());
    }

    @Test
    public void testFifteenLove() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        assertEquals("Fifteen-Love", game.getScore());
    }

    @Test
    public void testThirtyLove() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        game.wonPoint("player1");
        assertEquals("Thirty-Love", game.getScore());
    }

    @Test
    public void testFortyLove() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        assertEquals("Forty-Love", game.getScore());
    }

    @Test
    public void testLoveThirty() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        assertEquals("Love-Thirty", game.getScore());
    }

    @Test
    public void testLoveForty() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        assertEquals("Love-Forty", game.getScore());
    }

    @Test
    public void testThirtyFifteen() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        assertEquals("Thirty-Fifteen", game.getScore());
    }
}
