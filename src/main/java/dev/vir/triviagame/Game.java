package dev.vir.triviagame;

import java.util.*;

public class Game {
    private static final int MAX_PLAYERS = 6;
    private static final int BOARD_SIZE = 12;
    private static final int WINNING_SCORE = 6;

    private final List<String> players = new ArrayList<>();
    private final int[] positions = new int[MAX_PLAYERS];
    private final int[] scores = new int[MAX_PLAYERS];
    private final boolean[] inPenaltyBox = new boolean[MAX_PLAYERS];

    private final Map<String, Queue<String>> questions = new HashMap<>();

    private int currentPlayer = 0;
    private boolean isGettingOutOfPenaltyBox;

    public Game() {
        initializeQuestions();
    }

    private void initializeQuestions() {
        questions.put("Pop", new LinkedList<>());
        questions.put("Science", new LinkedList<>());
        questions.put("Sports", new LinkedList<>());
        questions.put("Rock", new LinkedList<>());

        for (int i = 0; i < 50; i++) {
            questions.get("Pop").add("Pop Question " + i);
            questions.get("Science").add("Science Question " + i);
            questions.get("Sports").add("Sports Question " + i);
            questions.get("Rock").add("Rock Question " + i);
        }
    }

    public boolean addPlayer(String playerName) {
        if (players.size() >= MAX_PLAYERS) {
            return false;
        }
        players.add(playerName);
        System.out.println(playerName + " was added. They are player number " + players.size());
        return true;
    }

    public void roll(int roll) {
        String player = players.get(currentPlayer);
        System.out.println(player + " rolled a " + roll);

        if (inPenaltyBox[currentPlayer]) {
            if (roll % 2 != 0) {
                isGettingOutOfPenaltyBox = true;
                System.out.println(player + " is getting out of the penalty box");
                movePlayer(roll);
            } else {
                isGettingOutOfPenaltyBox = false;
                System.out.println(player + " stays in the penalty box");
            }
        } else {
            movePlayer(roll);
        }
    }

    private void movePlayer(int roll) {
        positions[currentPlayer] = (positions[currentPlayer] + roll) % BOARD_SIZE;
        String player = players.get(currentPlayer);
        System.out.println(player + "'s new location is " + positions[currentPlayer]);
        askQuestion();
    }

    private void askQuestion() {
        String category = getCategory(positions[currentPlayer]);
        System.out.println("The category is " + category);
        System.out.println(questions.get(category).poll());
    }

    private String getCategory(int position) {
        return switch (position % 4) {
            case 0 -> "Pop";
            case 1 -> "Science";
            case 2 -> "Sports";
            default -> "Rock";
        };
    }

    public boolean wasCorrectlyAnswered() {
        String player = players.get(currentPlayer);
        if (inPenaltyBox[currentPlayer] && !isGettingOutOfPenaltyBox) {
            nextPlayer();
            return true;
        }

        System.out.println("Answer was correct!");
        scores[currentPlayer]++;
        System.out.println(player + " now has " + scores[currentPlayer] + " Gold Coins.");

        boolean winner = !didPlayerWin();
        nextPlayer();
        return winner;
    }

    public boolean wrongAnswer() {
        System.out.println("Question was incorrectly answered");
        System.out.println(players.get(currentPlayer) + " was sent to the penalty box");
        inPenaltyBox[currentPlayer] = true;
        nextPlayer();
        return true;
    }

    private void nextPlayer() {
        currentPlayer = (currentPlayer + 1) % players.size();
    }

    private boolean didPlayerWin() {
        return scores[currentPlayer] == WINNING_SCORE;
    }
    public int getCurrentPlayer() {
        return currentPlayer;
    }
}