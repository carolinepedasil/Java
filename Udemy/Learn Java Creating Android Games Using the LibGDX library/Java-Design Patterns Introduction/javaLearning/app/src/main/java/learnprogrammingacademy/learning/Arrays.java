package learnprogrammingacademy.learning;

public class Arrays {

    // index always starts at 0
    static int[] names = new int[4]; // initialize empty array with 4 elemntes

    static String[] pets = {"parrot", "cat", "dog"}; // annonymous array

    static int[][] table = new int[3][3];

    // asymmetrical
    static String[][] myArray = {
            new String[]{"One", "Two"}, // 1st row has 2 elements
            new String[]{"Three", "Four", "Five"} // 2nd row has 3 elemnts
    };

    public static void main (String[] args) {

        System.out.println("pets-size= " + pets.length);
        // pets.lenght = 10;

        System.out.println("pets[0]= " + pets[0]);
        System.out.println("pets[1]= " + pets[1]);
        System.out.println("pets[2]= " + pets[2]);
        // System.out.println("pets[3]= " + pets[3]); // throws array index out of bounds

        table[0][0] = 10;
        table[1][1] = 20;

        System.out.println("table[0][0]= " + table[0][0]);
        System.out.println("table[1][1]= " + table[1][1]);
        System.out.println("table[2][2]= " + table[2][2]);
        // System.out.println("table[3][2]= " + table[3][2]); // throws array index out of bounds
    }
}
