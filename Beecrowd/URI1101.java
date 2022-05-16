import java.io.IOException;
import java.util.Scanner;

/*
    Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). 
    Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

    ENTRADA:
    O arquivo de entrada contém um número não determinado de valores M e N. 
    A última linha de entrada vai conter um número nulo ou negativo.

    SAÍDA:
    Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.
*/

public class URI1101 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        while (true) {
    
            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;
            
            if (x <= 0 || y <= 0) {
                break;
            }
            
            if (x > y) {
                int auxiliar = x;
                x = y;
                y = auxiliar;
            }
            
            for (int i = x; i <= y; i++) {
                soma += i;
                System.out.print(i + " ");
            }
            
            System.out.println("Sum=" + soma);
            
        }
        
    }
 
}