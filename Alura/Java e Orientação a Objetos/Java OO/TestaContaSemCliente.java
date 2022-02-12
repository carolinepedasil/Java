public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaCarol = new Conta();
		System.out.println(contaDaCarol.getSaldo());

		contaDaCarol.setTitular(new Cliente());
		System.out.println(contaDaCarol.getTitular());

		contaDaCarol.getTitular().setNome("Marcela");
		System.out.println(contaDaCarol.getTitular().getNome());

	}
}