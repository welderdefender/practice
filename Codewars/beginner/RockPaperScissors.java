package beginner;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java
 */

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1 == p2) {
            return "Draw!";
        } else if (p1 == "rock" && p2 == "scissors") {
            return "Player 1 won!";
        } else if (p1 == "scissors" && p2 == "paper") {
            return "Player 1 won!";
        } else if (p1 == "paper" && p2 == "rock") {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }
}