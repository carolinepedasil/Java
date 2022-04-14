import java.io.IOException;
import java.util.Scanner; 

/*
    Leia 3 valores inteiros e ordene-os em ordem crescente. 
    No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

    ENTRADA:
    A entrada contem três números inteiros.

    SAÍDA:
    Imprima a saída conforme foi especificado.
*/

public class URI1042 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        
        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println(valor1);
            if (valor2 < valor3) {
                System.out.println(valor2);
                System.out.println(valor3);
            } else {
                System.out.println(valor3);
                System.out.println(valor2);
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            System.out.println(valor2);
            if (valor1 < valor3) {
                System.out.println(valor1);
                System.out.println(valor3);
            } else {
                System.out.println(valor3);
                System.out.println(valor1);
            }
        } else {
            System.out.println(valor3);
            if (valor1 < valor2) {
                System.out.println(valor1);
                System.out.println(valor2);
            } else {
                System.out.println(valor2);
                System.out.println(valor1);
            }
        }
        
        System.out.println();
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        
        sc.close();
        
    }
 
}