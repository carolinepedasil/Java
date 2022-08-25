package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacoes;
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void ReajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		
//		ValidacaoPercentualReajuste validacaoPercentualReajuste = new ValidacaoPercentualReajuste();
//		ValidacaoPeriodicidadeEntreReajustes validacaoPeriodicidadeEntreReajustes = new ValidacaoPeriodicidadeEntreReajustes();
//		
//		validacaoPercentualReajuste.validar(funcionario, aumento);
//		validacaoPeriodicidadeEntreReajustes.validar(funcionario, aumento);
		
		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
		
	}
}
