public class TestaComparacaoStrings {
    public static void main(String[] args) {
        String nome1 = new String("Caroline");
        String nome2 = new String("Caroline");
        System.out.println(nome1 == nome2); //false

        String nome3 = "Caroline";
        String nome4 = "Caroline";
        System.out.println(nome3 == nome4); //true, mesma referencia

        String nome5 = "Caroline";
        String nome6 = new String("Caroline");
        System.out.println(nome5 == nome6); //false, referências diferentes
        System.out.println(nome5.equals(nome6)); //true, mesmo conteúdo
    }
}
