public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaCaroline = new Conta();
		contaDaCaroline.deposita(100);
		contaDaCaroline.deposita(50);
		System.out.println(contaDaCaroline.getSaldo());

		boolean conseguiuRetirar = contaDaCaroline.saca(20);
		System.out.println(contaDaCaroline.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaCarol = new Conta();
		contaDaCarol.deposita(1000);

		boolean sucessoTransferencia = contaDaCarol.transfere(300, contaDaCaroline);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaCarol.getSaldo());
		System.out.println(contaDaCaroline.getSaldo());
	}

}