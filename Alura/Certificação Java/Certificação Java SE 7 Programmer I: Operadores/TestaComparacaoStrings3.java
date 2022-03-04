public class TestaComparacaoStrings3 {
    public static void main(String[] args) {  
        String str = "um texto qualquer";
        String txt1 = "texto";
        String txt2 = str.substring(3, 8); //cria uma nova string
        System.out.println(txt1 == txt2); //false
        System.out.println(txt1.equals(str.substring(3, 8))); //true

        String str = "HELLO WORLD";
        String upper = str.toUpperCase();          // já está maiúscula
        String subs = str.substring(0,11);         // string completa
        System.out.println(str == upper);          // true
        System.out.println(str == subs);           // true
        System.out.println(str == str.toString()); // true
    }
}
