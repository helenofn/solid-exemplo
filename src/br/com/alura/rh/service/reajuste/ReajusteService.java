package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {

	private List<ValidacaoReajuste> validacoes;
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}
	
	public void reajustarSalarioFuncionario(Funcionario func, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(func, aumento));
		
		BigDecimal salarioReajustado = func.getDadosPessoais().getSalario().add(aumento);
		func.atualizarSalario(salarioReajustado);
	}
}
