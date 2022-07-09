package escola.dominio.aluno;

public class Email {
	
	// VALUE OBJECT = são considerados iguais, se todos os seus atributos tiverem valores iguais.
	
	private String endereco;

	public Email(String endereco) {
		if (endereco == null || !endereco.matches("ˆ[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail inválido!");
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

}
