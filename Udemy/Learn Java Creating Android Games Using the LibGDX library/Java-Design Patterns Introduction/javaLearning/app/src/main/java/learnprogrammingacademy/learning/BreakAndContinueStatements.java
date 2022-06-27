package learnprogrammingacademy.learning;

public class BreakAndContinueStatements {

    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        for(String animal : animals) {
            if(animal.equals("Lizard")) {
                break;
            }
            System.out.println(animal);
        }
        // break jumps here

        System.out.println("continue");

        for(String animal : animals) {
            if(animal.equals("Lizard")) {
                continue;
            }
            System.out.println(animal);
        }
    }

}
