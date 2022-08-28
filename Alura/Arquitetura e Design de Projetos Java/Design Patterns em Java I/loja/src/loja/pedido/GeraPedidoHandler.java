package loja.pedido;

import java.time.LocalDateTime;

import loja.orcamento.Orcamento;

public class GeraPedidoHandler {
	
	// construtor com injeção de dependências: repository, service, etc.
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no Banco de Dados");
		System.out.println("Enviar email dados do novo pedido");
	}

}
