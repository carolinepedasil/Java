import java.io.IOException;
import java.util.Scanner;

/*
    Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
    Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
    Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
    Considere que a senha correta é o valor 2002. 

    ENTRADA:
    A entrada é composta por vários casos de testes contendo valores inteiros.

    SAÍDA:
    Para cada valor lido mostre a mensagem correspondente à descrição do problema.
*/

public class URI1114 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        while (true) {
    
            int senha = sc.nextInt();
            
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        
        }
 
    }
 
}