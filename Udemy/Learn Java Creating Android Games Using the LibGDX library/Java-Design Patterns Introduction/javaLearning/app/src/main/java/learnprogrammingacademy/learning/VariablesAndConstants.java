package learnprogrammingacademy.learning;

public class VariablesAndConstants {

    static int lives = 3; // mutable (changeable)
    static String playerName = "Caroline";
    static boolean gameOver; // false by default

    static final int LEVEL_COUNT = 4; // immutable (not changeable)

    public static void main(String[] args) {
        System.out.println("player " + playerName + " has " + lives + " lives left");

        lives += 2; // lives = lives + 2;
        playerName = playerName + " " + "Silva";
        System.out.println("player " + playerName + " has " + lives + " lives left");
        System.out.println("gameOver= " + gameOver);

        System.out.println("player " + playerName + " needs to complete " + LEVEL_COUNT + " levels");
        gameOver = true;
        System.out.println("gameOver= " + gameOver);
    }

}
