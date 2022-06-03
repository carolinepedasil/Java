package application;

public class Program {

	public static void main(String[] args) {

		int x = 20;
		
		Object obj = x; // Unboxing
		
		System.out.println(obj);
		
		int y = (int) obj; // fez um casting
		
		System.out.println(y);
		
		// --------------------------------------
		// OBS: wrapper classes aceita valor nulo
		
		int z = 100;
		
		Integer objeto = z; // wrapper classes de Integer é int
		
		int w = objeto * 2;
		
		System.out.println(w);

	}

}
