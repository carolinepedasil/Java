public class TestaIncrementos {
    public static void main(String[] args) {

        int a = 10;
        a += ++a + a + ++a;

        // a += ++a + a + ++a;
        // a = 10 + ++a + a + ++a;
        // a = 10 + 11 + a + ++a;
        // a = 10 + 11 + 12 + ++a;
        // a = 10 + 11 + 12 + 13;
        // a = 44;

        System.out.println(a);

        int i = 5;

        System.out.println(i++); // 5 - pós-incremento, i agora vale 6        
        System.out.println(i--); // 6 - pós-decremento, i agora vale 5
        System.out.println(i);   // 5
        System.out.println(++i); // 6 - pré-incremento
        System.out.println(--i); // 5 - pré-decremento
        System.out.println(i);   // 5

        i += 2;
        i -= 2;
        i *= 5;
        i /= 10;
        i %= 3;
        System.out.println(i+=3);

        int a = 10;

        a = a + 2; // para somar 2 em a
        a += 2; //podemos obter o mesmo resultado com:

        //exemplos de operadores:
        int i = 5;

        i += 10; //soma e atribui
        System.out.println(i); // 15

        i -= 10; //subtrai e atribui
        System.out.println(i); // 5

        i *= 3; // multiplica e atribui
        System.out.println(i); // 15

        i /= 3; // divide a atribui
        System.out.println(i); // 5

        i %= 2; // divide por 2, e atribui o resto
        System.out.println(i); // 1

        System.out.println(i+=3); // soma 3 e retorna o resultado: 4

        byte b1 = 3; // compila, dá um desconto
        b1 = b1 + 4; // não compila, conta com int devolve int

        byte b2 = 3; // compila, dá um desconto
        b2 += 4; // compila também, compilador gente boa!
        
    }
}