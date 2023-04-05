package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{

	public void validar(Funcionario func, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = func.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		long mesesUtimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		if (mesesUtimoReajuste < 6) {
			throw new ValidacaoException("Intervalo entre reajustes devem ser de no mínimo 6 meses!");
		}
	}
}
