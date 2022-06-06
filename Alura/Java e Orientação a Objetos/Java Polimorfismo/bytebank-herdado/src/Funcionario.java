// Não pode instanciar essa classe porque ela é abstrata
public abstract class Funcionario { // abstract = herança
	
	// Atributos normalmente são privados
	private String nome;
	private String cpf;
	private double salario; 
	// OBS: protected está entre private e public - é publico para os filhos, e para o resto é privado
	
	// Construtor: não retorna nada (não retorna class/double/etc)
	public Funcionario() {
		
	}
	
	// Método sem corpo, não há implementação
	public abstract double getBonificacao();
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
