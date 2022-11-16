import java.util.function.Predicate;

public class Lambda {

    class Person {
        private String name;
        private int age;
        //...
    }

    interface Matcher<T>{
        boolean test(T t);
    }

    class PersonFilter{

        public List<Person> filter(List<Person> input, 
                                Matcher<Person> matcher){
            List<Person> output = new ArrayList<>();
            for (Person person : input) {
                if(matcher.test(person)){
                    output.add(person);
                }
            }    
            return output;
        }
    }

    class AgeOfMajority implements Matcher<Person>{
        @Override
        public boolean test(Person p) {
            return p.getAge() >= 18;
        }
    }

    PersonFilter pf = new PersonFilter();
    List<Person> adults = pf.filter(persons, new AgeOfMajority());

    List<Person> adults = pf.filter(persons, new Matcher<Person>() {
        @Override
        public boolean test(Person p) {
            return p.getAge() >= 18;
        }
    });

    @FunctionalInterface 
    interface Matcher<T>{
        boolean test(T t);
    }

    class PersonFilter{

        public List<Person> filter(List<Person> input,
                                Predicate<Person> matcher){
            List<Person> output = new ArrayList<>();
            for (Person person : input) {
                if(matcher.test(person)){
                    output.add(person);
                }
            }    
            return output;
        }
    }

    Predicate<Person> matcher = new Predicate<Person>() {
        @Override
        public boolean test(Person p) {
            return p.getAge() >= 18;
        }
    };
    List<Person> adults = pf.filter(persons, matcher);

    Predicate<Person> matcher = (Person p) -> {return p.getAge() >= 18;};

    Predicate<Person> matcher = (p) -> {return p.getAge() >= 18;};

    Predicate<Person> matcher = p -> {return p.getAge() >= 18;};

    Predicate<Person> matcher = p -> p.getAge() >= 18;
    List<Person> adults = pf.filter(persons, matcher);

    List<Person> adults = pf.filter(persons, p -> p.getAge() >= 18);

    List<Person> namesStartingWithA = pf.filter(persons, p -> p.getName().startsWith("A"));

    Runnable r = () -> System.out.println("a runnable object!");
    
    Runnable r = () ->  { 
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    public class LambdaScopeTest {

        public int instanceVar = 1;
        public final int instanceVarFinal = 2;

        public static void main(String[] args) {
            new LambdaScopeTest().test();
        }

        private void test() {
            instanceVar++; // ok
            new Thread(() -> {
                System.out.println(instanceVar); // ok
                instanceVar++; // ok

                System.out.println(instanceVarFinal); // ok
                instanceVarFinal++; // compile error
            }).start();
        }

    }

    private void test() {
        int unchangedLocalVar = 3;   // effectively final
        final int localVarFinal = 4; // final
        int simpleLocalVar = 0;
        simpleLocalVar = 9; // updated the value

        new Thread(() -> {
            System.out.println(unchangedLocalVar);   // can read 
            System.out.println(localVarFinal);       // can read
            System.out.println(simpleLocalVar); // compile error
        }).start();
    }

    private void test(String param) {
        String methodVar = "method"; //not final

        Predicate<String> a = 
            param -> param.length() > 0; //compile error
        Predicate<String> b = 
            methodVar -> methodVar.length() > 0; //compile error
        Predicate<String> c = 
            newVar -> newVar.length() > 0; // ok
    }

}