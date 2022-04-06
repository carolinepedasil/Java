import java.io.IOException;
import java.util.Scanner;

/*
    Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

    OBS.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
    Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
    Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

    ENTRADA:
    O arquivo de entrada contém um valor inteiro.

    SAÍDA:
    Imprima a saída conforme exemplo fornecido.
*/

public class URI1020 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int idadeInserida = sc.nextInt();
        int atual = idadeInserida;
        
        int ano = atual / 365;
        atual -= ano * 365;
        
        int mes = atual / 30;
        atual -= mes * 30;
        
        int dia = atual;
        
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        sc.close();
 
    }
 
}