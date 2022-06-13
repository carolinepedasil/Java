public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente carol = new Gerente();
		carol.setNome("Caroline");
		carol.setCpf("123456789-10");
		carol.setSalario(1234.00);
		
		System.out.println(carol.getNome());
		System.out.println(carol.getBonificacao());
		
		//carol.salario = 2000.00;
		
	}

}
