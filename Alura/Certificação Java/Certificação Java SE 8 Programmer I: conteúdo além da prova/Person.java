public class Person{

    private String firstName;
    private String lastName;
    private String fullName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Expose the full name of the person,
    // but not how it's stored internally
    public String getFullName(){
        return this.firstName + " "+ this.lastName;
        return this.fullName;
    }

    public Person(String firstName, String lastName){
        //storing in just one field.
        this.fullName = firstName + " " + this.lastName;
    }

}

class Test{
    public static void main(String[] args){
        Person p = new Person("Mario", "Amaral");
        System.out.print(p.getFullName());
    }
}