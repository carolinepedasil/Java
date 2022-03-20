import java.util.Scanner;

/*
    Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três números lidos. 
    Em caso de empate, mostrar apenas uma vez.

    Exemplos:

    Entrada:
    7 3 8

    Saída:
    MENOR = 3

    -

    Entrada:
    5 12 5

    Saída:
    MENOR = 5

    -

    Entrada:
    9 9 9

    Saída:
    MENOR = 9
*/

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero1 = sc.nextInt(); 
        int numero2 = sc.nextInt(); 
        int numero3 = sc.nextInt();

        if (numero1 < numero2 && numero1 < numero3) { 
            System.out.println("MENOR = " + numero1);
        }
        else if (numero2 < numero3) { 
            System.out.println("MENOR = " + numero2);
        }
        else {
            System.out.println("MENOR = " + numero3);
        }

        sc.close(); 
    }
    
}
