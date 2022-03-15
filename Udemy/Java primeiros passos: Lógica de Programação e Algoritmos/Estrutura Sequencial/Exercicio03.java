import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler as medidas da base e altura de um retângulo. 
    Em seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplo.

    Exemplo:
    
    Entrada:
    5.0 
    4.0

    Saída:
    AREA = 20.0000 
    PERIMETRO = 18.0000 
    DIAGONAL = 6.4031
*/

public class Exercicio03 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US); // Para aceitar "." ao invés de "," nos números

        Scanner sc = new Scanner(System.in); 
        
        double base = sc.nextDouble(); 
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = (base + altura) * 2.0;
        double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.println("Saída: "); 
        System.out.printf("AREA = %.4f%n", area); // Trocar "printtln" por "printf" para poder formatar e escolher quantas casas decimais poderá ser utilizada
        System.out.printf("PRECO = %.4f%n", perimetro); 
        System.out.printf("PRECO = %.4f%n", diagonal); 

        sc.close();

    }

}