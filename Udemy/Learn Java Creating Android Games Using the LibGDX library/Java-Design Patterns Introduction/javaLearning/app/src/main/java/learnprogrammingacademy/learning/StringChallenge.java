package learnprogrammingacademy.learning;

public class StringChallenge {

    public static void main(String[] args) {

        // create array of strings that represents names of people
        // print all strings/names that start with capital letter T in uppercase
        // find method in string class that checks if strings starts with another string

        String[] people = {"John", "Tom", "Anthony", "Jimmy", "Timmy"};

        // for each
        for (String person : people) {
            if (person.startsWith("T")) {
                System.out.println("foreach person= " + person.toUpperCase());
            }
        }

        // for
        for (int i = 0; i < people.length; i++) {
            String person = people[i];

            if (person.startsWith("T")) {
                System.out.println("for person= " + person.toUpperCase());
            }
        }

        // while
        int index = 0;
        while (index < people.length) {
            String person = people[index];

            if (person.startsWith("T")) {
                System.out.println("while person= " + person.toUpperCase());
            }

            index++;
        }
    }

}
