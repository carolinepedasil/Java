import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
    Em seguida, calcule e mostre: 
    
    a) a área do triângulo retângulo que tem A por base e C por altura. 
    b) a área do círculo de raio C. (pi = 3.14159) 
    c) a área do trapézio que tem A e B por bases e C por altura. 
    d) a área do quadrado que tem lado B. 
    e) a área do retângulo que tem lados A e B. 

    ENTRADA:
    O arquivo de entrada contém três valores com um dígito após o ponto decimal.

    SAÍDA:
    O arquivo de saída deverá conter 5 linhas de dados. 
    Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. 
    O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
*/
 
public class URI1012 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pi = 3.14159;
        
        double areaTriangulo = (a * c) / 2;
        double areaCirculo = pi * Math. pow(c, 2.0);
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        System.out.println(String.format("TRIANGULO: %.3f", areaTriangulo));
        System.out.println(String.format("CIRCULO: %.3f", areaCirculo));
        System.out.println(String.format("TRAPEZIO: %.3f", areaTrapezio));
        System.out.println(String.format("QUADRADO: %.3f", areaQuadrado));
        System.out.println(String.format("RETANGULO: %.3f", areaRetangulo));
        
        sc.close();
 
    }
 
}