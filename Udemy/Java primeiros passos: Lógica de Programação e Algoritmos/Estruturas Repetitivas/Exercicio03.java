import java.util.Scanner;

/*
    Fazer um programa que lê um valor inteiro N e depois N números inteiros. Ao final, mostra a soma dos N números lidos
*/

public class Exercicio03 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        int soma = 0;

        for (int i = 0; i < numero; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        sc.close();

    }
    
}