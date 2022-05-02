import java.io.IOException;
import java.util.Scanner;

/*
    Leia um valor inteiro N. 
    Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
    Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

    ENTRADA:
    A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
    Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

    SAÍDA:
    Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
*/

public class URI1072 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int in = 0;
        int out = 0;
        
        for (int i = 0; i < N; i++){
            int X = sc.nextInt();
            if (X >= 10 && X <= 20) {
                in++;
    		} else {
    		    out++;
    		}
        }
        
        System.out.println(in + " in");
    	System.out.println(out + " out");
        
    }
 
}