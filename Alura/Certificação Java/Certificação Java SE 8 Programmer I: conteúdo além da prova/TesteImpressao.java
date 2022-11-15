public class TesteImpressao {

    System.out.print(false); // a boolean
    System.out.print(10.3);  // a double value
    System.out.print("Some text"); // some text


    class Test {

        public String toString(){
            return "My test object...";
        }

        public static void main(String[] args){
            System.out.print(new Test()); // My test object...
        }
    }

    char[] c = {'a','b','c'};
    int[] i = {1,2,3};
    System.out.print(c); // abc
    System.out.print(i); // [I@9d8643e (ou similar)]

    System.out.print("foo");
    System.out.println(); // line break
    System.out.print("bar");

    System.out.printf("Hello %s, have a nice day!", "Mario");

    System.out.printf("%s %n", "foo"); //foo
    System.out.printf("%b %n", false); //false
    System.out.printf("%d %n", 42);    //42
    System.out.printf("%d %n", 1024L); //1024
    System.out.printf("%f %n", 23.9f); //23.900000
    System.out.printf("%f %n", 44.0);  //44.000000

    System.out.printf("%s, it's %b, the result is %d", "yes", true, 100);

    System.out.printf("%2$s %1$s", "World","Hello"); // Hello World

    System.out.printf("[%5d]%n", 22);       //[   22]
    System.out.printf("[%5s]%n", "foo");    //[  foo]
    System.out.printf("[%5s]%n", "foofoo"); //[foofoo]

    System.out.printf("[%05d]%n", 22);    //[00022]
    System.out.printf("[%-5s]%n", "foo"); //[foo  ]
    System.out.printf("[%05s]%n", "foo");

    System.out.printf("%+d %n", 22);       //+22 
    System.out.printf("%,f %n", 1234.56);  //1,234.560000
    System.out.printf("%(f %n", -1234.56); //(1234.560000)

    Locale br = new Locale("pt","BR");
    System.out.printf(br,"%,f %n", 123456.789); // 123.456,789000

    System.out.printf("[%.2f]%n", 22.5); //[22.50]

}