package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCintoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}

}
