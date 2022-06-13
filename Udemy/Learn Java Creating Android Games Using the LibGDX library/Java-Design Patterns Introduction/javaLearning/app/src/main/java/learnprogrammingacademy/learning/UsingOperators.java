package learnprogrammingacademy.learning;

public class UsingOperators {

    static int lives = 3; // mutable (changeable)
    static int score; // 0 by default
    static int coinCount = 90;

    static int itemCount = 24;
    static int itemsPerPage = 5;

    public static void main(String[] args) {
        System.out.println("score= " + score);

        score += 10; // score = score + 10;
        System.out.println("score= " + score + " lives= " + lives);

        lives--; // lives = lives - 1; // lives -= 1;
        System.out.println("score= " + score + " lives= " + lives);

        score *= 2; // score = score * 2;
        System.out.println("score= " + score + " lives= " + lives);

        score /= 2; // score = score / 2;
        System.out.println("score= " + score + " lives= " + lives);

        coinCount += 40; // coinCount = coinCount + 40; // 90 + 40 = 130
        System.out.println("coinCount= " + coinCount);

        coinCount = coinCount % 100; // 130 / 100 = 1 -> 130 - 1 * 100 = 130 - 100 = 30
        System.out.println("coinCount= " + coinCount);

        //calculating remaining Items
        int remainingItems = itemCount % itemsPerPage;
        System.out.println("remainingItems= " + remainingItems);
    }
}
