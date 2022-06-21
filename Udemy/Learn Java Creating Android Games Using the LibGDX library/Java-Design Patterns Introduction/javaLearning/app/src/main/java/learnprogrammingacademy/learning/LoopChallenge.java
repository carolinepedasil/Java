package learnprogrammingacademy.learning;

public class LoopChallenge {
    // use any of the loops that you have seen in previous videos (for, while, do-while)
    // sum all numbers from 1-100
    // print sum to console

    public static void main(String[] args) {

        // while
        int number = 1;
        int sum = 0;

        while (number <= 100) {
            sum += number; // sum = sum + number
            number++;
        }

        System.out.println("while sum= " + sum);

        // do-while
        number = 1;
        sum = 0;

        do {
            sum += number;
            number++;
        } while(number <= 100);

        System.out.println("do-while sum= " + sum);

        // for
        sum = 0;

        //for(int i=1; i <= 100; i++) {
        for(number = 1; number <= 100; number++) {
            sum += number;
        }

        System.out.println("for sum= " + sum);

    }
}
