import java.io.IOException;
import java.util.Scanner;
 
public class URI1067 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        
        for (int i = 1; i <= valor; i++) {
        	if (i % 2 != 0) System.out.println(i);
        }
    	
    	sc.close();
 
    }
 
}