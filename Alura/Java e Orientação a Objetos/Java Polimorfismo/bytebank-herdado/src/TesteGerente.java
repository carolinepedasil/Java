
public class TesteGerente {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Carol");
		g1.setCpf("12345678910");
		g1.setSalario(1000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(321);
		boolean autenticou = g1.autentica(321);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}
