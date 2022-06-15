package learnprogrammingacademy.learning;

public class ForAndForeachLoop {

    static String[] pets = {"parrot", "cat", "dog"}; // annonymous array

    static int[][] table = {
            {1, 2, 3},
            {4, 5, 6, 11},
            {7, 8, 9}
    };

    public static void main(String[] args) {

        for(int i = 0; i < pets.length; i++) {
            // 1st iteration i = 0
            // 2nd iteration i = 1
            // 3rd iteration i = 2
            // 4th iteration i = 3
            System.out.println("pet[" + i + "]= " + pets[i]);
        }

        for(String pet : pets) {
            System.out.println("pet= " + pet);
        }

        for(int row = 0; row < table.length; row++) {
            for(int column = 0; column < table[row].length; column++) {
                System.out.println("number= " + table[row][column]);
            }
        }
    }
}
