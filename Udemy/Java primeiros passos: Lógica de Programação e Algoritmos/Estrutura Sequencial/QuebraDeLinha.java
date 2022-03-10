import java.util.Scanner;

public class QuebraDeLinha {

    public static void main(String[] args) { 

        // Ler um texto ATÉ A QUEBRA DE LINHA

        Scanner sc = new Scanner(System.in); 
        
        String s1, s2, s3;

        s1 = sc.nextLine(); 
        s2 = sc.nextLine(); 
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:"); 
        System.out.println(s1); 
        System.out.println(s2); 
        System.out.println(s3);

        sc.close();

        // Quebra de Linha Pendente

        /*
            int x;

            x = sc.nextInt(); 
            sc.nextInt();
            s1 = sc.nextLine(); 
            s2 = sc.nextLine(); 
            s3 = sc.nextLine();

            System.out.println("DADOS DIGITADOS:"); 
            System.out.println(x); 
            System.out.println(s1); 
            System.out.println(s2); 
            System.out.println(s3);
        */

    }
    
}