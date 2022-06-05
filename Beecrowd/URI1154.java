import java.io.IOException;
import java.util.Scanner;

/*
    Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. 
    O último dado, que não entrará nos cálculos, contém o valor de idade negativa. 
    Calcular e imprimir a idade média deste grupo de indivíduos.

    ENTRADA:
    A entrada contém um número indeterminado de inteiros. 
    A entrada será encerrada quando um valor negativo for lido.

    SAÍDA:
    A saída contém um valor correspondente à média de idade dos indivíduos.
    A média deve ser impressa com dois dígitos após o ponto decimal.

    Exemplo de Entrada:	
    34
    56
    44
    23
    -2

    Exemplo de Saída:
    39.25
*/

public class URI1154 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int idade = 0;
        int contador = 0;
        double soma = 0;
        
        while (idade >= 0) {
            
            idade = sc.nextInt();
            
            if (idade >= 0) {
            	contador++;
            	soma += idade;
            }
            
        }
        
        double media = soma / contador;
        System.out.println(String.format("%.2f", media));
 
    }
 
}