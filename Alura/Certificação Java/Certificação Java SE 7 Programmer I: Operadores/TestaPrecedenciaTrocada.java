public class TestaPrecedenciaTrocada {
    public static void main(String[] args) {
        int a = 15 * 4 + 1;
        System.out.println(a);

        int b = 15 * (4 + 1);
        System.out.println(b);

        System.out.println(15 + 0 + " é cento e cinquenta"); //false
        System.out.println(15 + (0 + " é cento e cinquenta)"); //true

        System.out.println(("caroline" + " silva").length());
    }
}
