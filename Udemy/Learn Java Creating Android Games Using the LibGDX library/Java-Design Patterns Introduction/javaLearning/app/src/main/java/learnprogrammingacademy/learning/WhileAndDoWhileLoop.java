package learnprogrammingacademy.learning;

public class WhileAndDoWhileLoop {

    static int lives = 3; // mutable/changeable
    static int coinCount = 90;

    public static void main(String[] args) {
        while (lives > 0) {
            System.out.println("lives= " + lives);
            lives--; // lives = lives -1;
        }

        lives = 3;

        do {
            //System.out.println("lives= " + lives);
            coinCount += 20;
            lives--;
            //System.out.println("lives= " + lives);
        } while (lives > 0);

        System.out.println("coins= " + coinCount + " lives= " + lives);

    }
}
