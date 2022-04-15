import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
    Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
   
    Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
    Perimetro = XX.X

    Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
    Area = XX.X

    ENTRADA:
    A entrada contém três valores reais.

    SAÍDA:
    O resultado deve ser apresentado com uma casa decimal.
*/

public class URI1043 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
 
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        if (a < b + c && b < a + c && c < a + b) {
            double perimetro = a + b + c;
            System.out.println(String.format("Perimetro = %.1f", perimetro));
        } else {
            double area = ( (a + b) * c) / 2;
            System.out.println(String.format("Area = %.1f", area));
        }
        
        sc.close();
 
    }
 
}