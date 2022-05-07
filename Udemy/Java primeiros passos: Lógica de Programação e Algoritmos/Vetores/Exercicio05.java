import java.util.Scanner;

/*
    Fazer um programa para ler um valor N e depois o nome de N pessoas. 
    Em seguida, mostrar os nomes lidos.

    Exemplo:

    Entrada:
    3
    Maria 
    Joaquim 
    Ana

    Saída:
    Nomes lidos: 
    Maria 
    Joaquim
    Ana
*/

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] nomes = new String[N];

        for (int i=0; i<N; i++) { 
            nomes[i] = sc.next();
        }

        System.out.println("Nomes lidos:"); 
        for (String s : nomes) { // para cada String s dentro do meu vetor de nomes
            System.out.println(s); 
        }

        /*
            // OUTRA FORMA: 
            
            for(int i=0; i<N; i++) {
                System.out.println(nomes[i]);
            }
        */
                
        sc.close();
    
    }

}