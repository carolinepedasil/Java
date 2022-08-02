package learnprogrammingacademy.learning;

public class UsingStrings {

    public static void main(String[] args) {

        String dog = "Dog";
        String dog2 = new String(new char[]{'D', 'o', 'g'});

        System.out.println("dog == dog2 => " + (dog == dog2));
        System.out.println("dog.equals(dog2) => " + dog.equals(dog2));

        String cat = "Cat";
        String cat2 = new String("Cat");
        String cat3 = cat2;

        System.out.println("reference equality => " + (cat == cat2)); //false
        System.out.println("reference equality => " + (cat == cat3)); //false
        System.out.println("reference equality => " + (cat2 == cat3)); //true

        String lizard = "Lizard";
        System.out.println("lizard first letter = " + lizard.charAt(0));
        System.out.println("lizard contains iz = " + lizard.contains("iz"));

        // immutability
        lizard.toUpperCase(); // this does not change string it creates new string

        System.out.println("lizard = " + lizard);

        lizard = lizard.toUpperCase(); // assigns new value to variable

        System.out.println("lizard = " + lizard);
    }

}
