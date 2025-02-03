package dev.vir.tennisgame;

public class TennisGame {

    private int score1 = 0;
    private int score2 = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) {
            score1++;
        } else {
            score2++;
        }
    }

    public String getScore() {
        if (score1 == score2) {
            return getEqualScore();
        } else if (score1 >= 4 || score2 >= 4) {
            return getAdvantageOrWin();
        } else {
            return getRegularScore();
        }
    }

    private String getEqualScore() {
        return switch (score1) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        };
    }

    private String getAdvantageOrWin() {
        int scoreDifference = score1 - score2;
        if (scoreDifference == 1) return "Advantage " + player1Name;
        if (scoreDifference == -1) return "Advantage " + player2Name;
        return scoreDifference >= 2 ? "Win for " + player1Name : "Win for " + player2Name;
    }

    private String getRegularScore() {
        return getScoreString(score1) + "-" + getScoreString(score2);
    }

    private String getScoreString(int score) {
        return switch (score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "";
        };
    }
}