import java.util.Scanner;

/*
    Fazer um programa para ler dois números inteiros positivos M e N, depois ler uma matriz de M linhas e N colunas contendo números inteiros. 
    Em seguida, mostrar na tela a matriz lida conforme exemplo.

    Entrada:
    2   3
    6   3   10 
    8   12  5

    Saída:
    6   3   10 
    8   12  5
*/

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); 
        int N = sc.nextInt();

        int[][] mat = new int[M][N];

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextInt(); 
            }
        }
        
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(mat[i][j] + " "); 
            }
            System.out.println(); 
        }
        
        sc.close();

    }

}
