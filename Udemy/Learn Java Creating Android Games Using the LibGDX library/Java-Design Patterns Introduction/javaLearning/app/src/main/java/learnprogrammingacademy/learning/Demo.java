package learnprogrammingacademy.learning;

public class Demo {

    static int lives = 3; // mutable (changeable)
    static int score; // 0 by default
    static int coinCount = 90;
    static boolean gameOver; // false by dafault

    public static void main(String[] args) {
        score += 10;
        coinCount = 110; // re-initializing
        // lives = 0;

        if(lives == 0) {
            gameOver = true;
        }

        if(coinCount > 100) {
            System.out.println("gold medal");
        } else if (coinCount > 80) {
            System.out.println("silver medal");
        } else if (coinCount > 70) {
            System.out.println("bronze medal");
        } else {
            System.out.println("no medal");
        }

        // if(gameOver == true)
        if(gameOver) {
            System.out.println("score= " + score);
        } else {
            System.out.println("lives= " + lives);
        }

        //if(gameOver == false)
        if(!gameOver) {
            System.out.println("Game is not over");
        }
    }
}
