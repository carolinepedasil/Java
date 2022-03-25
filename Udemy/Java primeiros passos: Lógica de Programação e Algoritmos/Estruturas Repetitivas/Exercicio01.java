import java.util.Scanner;

/*
    Fazer um programa que lê números inteiros até que um zero seja lido. 
    Ao final mostra a soma dos números lidos.
*/

public class Exercicio01 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        int soma = 0;

        while (numero != 0) {
            soma = soma + numero;
            numero = sc.nextInt(); 
        }

        System.out.println(soma);

        sc.close();

    }
    
}