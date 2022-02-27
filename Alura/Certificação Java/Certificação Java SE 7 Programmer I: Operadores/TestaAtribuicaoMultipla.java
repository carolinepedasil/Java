public class TestaAtribuicaoMultipla {
    public static void main(String[] args) {

        int a = 15, b = 20, c = 30; // b = 30, portanto a = 30
        a = (b = c) + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int j = 0;
        int i = (j++ * j + j++);
        System.out.println(i);
        System.out.println(j);

        i = (0 * j + j++); // j vale 1
        i = (0 * 1 + j++); // j vale 1
        i = (0 * 1 + 1); // j vale 2
        i = 1; // j vale 2
    }  
}