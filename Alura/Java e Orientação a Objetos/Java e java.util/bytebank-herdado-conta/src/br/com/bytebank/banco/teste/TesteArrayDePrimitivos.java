package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		int[] idades = new int[5]; //inicializa o array com 0
		
//		idades[0] = 19;
//		idades[1] = 29;
//		idades[2] = 39;
//		idades[3] = 49;
//		idades[4] = 59;
//		
//		int idade4 = idades[4];
//		
//		System.out.println(idade4);
//		System.out.println(idades.length);
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}

		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
	}

}
