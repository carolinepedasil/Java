package loja;

import java.math.BigDecimal;
import java.util.Arrays;

import loja.pedido.GeraPedido;
import loja.pedido.GeraPedidoHandler;
import loja.pedido.acao.EnviarEmailPedido;
import loja.pedido.acao.LogDePedido;
import loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {
	
	public static void main(String[] args) {
//		String cliente = args[0]; //pegar o primeiro parametro
		String cliente = "Caroline";
//		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		BigDecimal valorOrcamento = new BigDecimal("300");
//		int quantidadeItens = Integer.parseInt(args[2]);
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(), 
							  new EnviarEmailPedido(),
							  new LogDePedido()));
		handler.execute(gerador);
	}

}
