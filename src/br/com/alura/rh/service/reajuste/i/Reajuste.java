package br.com.alura.rh.service.reajuste.i;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {

	BigDecimal valor();
	LocalDate data();
}
