public class TestaComparacaoStrings2 {
    public static void main(String[] args) {
        String ab = "a" + "b";
        System.out.println(ab == "ab"); //true

        String a = "a";
        String ab = a + "b"; //usando uma referência e um literal
        System.out.println(ab == "ab"); //false
    }
}