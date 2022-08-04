package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	// Main é um método auto-exercutável em Java
	public static void main(String[] args) {
		
		// Objeto ainda não existe na memória
		Aluno aluno1;
		
		// Agora temos um objeto real na memória
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Carol";
		aluno2.idade = 24;
		
		System.out.println("Nome do aluno 2 é = " + aluno2.nome);
		System.out.println("Idade é = " + aluno2.idade);
		
		// new Aluno() é uma instância (Criação de Objeto)
		// aluno2 é uma referência para o objeto aluno
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
	}

}
