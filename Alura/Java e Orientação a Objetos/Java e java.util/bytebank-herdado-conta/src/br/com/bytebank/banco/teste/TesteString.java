package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String vazio = " Alura ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Alura"));
		System.out.println(vazio);
		System.out.println(outroVazio);
		//System.out.println(vazio.isEmpty());
		
		String nome = "Alura"; // Object literal
		//String outra = new String("Alura"); // mesma coisa
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int posicao = nome.indexOf("ur");
//		System.out.println(posicao);
		
//		char b = nome.charAt(0);
//		System.out.println(b);
		
//		char c = 'A';
//		char d = 'a';
//		outra = nome.replace(c, d);
		
//		outra = nome.replace("A", "a");
//		outra = nome.toLowerCase(); // mesma coisa
//		outra = nome.toUpperCase();
		
//		System.out.println(nome);
//		System.out.println(outra);
		
	}

}
