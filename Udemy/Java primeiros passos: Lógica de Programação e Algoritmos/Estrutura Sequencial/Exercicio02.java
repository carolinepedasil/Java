import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, 
    bem como o valor do metro quadrado do terreno com duas casas decimais. 
    Em seguida, o programa deve mostrar o valor da área do terreno, 
    bem como o valor do preço do terreno, ambos com duas casas decimais, conforme exemplo.

    Exemplo:
    
    Entrada:
    10.0 
    30.0 
    200.00

    Saída:
    AREA = 300.00 
    PRECO = 60000.00
*/

public class Exercicio02 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US); // Para aceitar "." ao invés de "," nos números

        Scanner sc = new Scanner(System.in); 
        
        double largura = sc.nextDouble(); 
        double comprimento = sc.nextDouble(); 
        double valor = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * valor;

        System.out.println("Saída: "); 
        System.out.printf("AREA = %.2f%n", area); // Trocar "printtln" por "printf" para poder formatar e escolher quantas casas decimais poderá ser utilizada
        System.out.printf("PRECO = %.2f%n", preco); 

        sc.close();

    }

}
