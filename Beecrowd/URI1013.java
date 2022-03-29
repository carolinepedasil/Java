import java.io.IOException;
import java.util.Scanner;

/*
    Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. 
    Utilize a fórmula:
    
    MaiorAB = (a+b+abs(a-b))/2

    Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
    Um segundo passo, portanto é necessário para chegar no resultado esperado.

    ENTRADA:
    O arquivo de entrada contém três valores inteiros.

    SAÍDA:
    Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/
 
public class URI1013 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        
        if (valor1 > valor2 && valor1 > valor3){
            System.out.println(valor1 + " eh o maior");
        } else if (valor2 > valor3) {
            System.out.println(valor2 + " eh o maior");
        } else {
            System.out.println(valor3 + " eh o maior");
        }

        sc.close();
 
    }
 
}