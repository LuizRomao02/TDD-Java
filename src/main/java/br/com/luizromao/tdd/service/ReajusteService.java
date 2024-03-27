package br.com.luizromao.tdd.service;

import java.math.BigDecimal;

import br.com.luizromao.tdd.modelo.Desempenho;
import br.com.luizromao.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal reajuste = desempenho.percentualReajuste();
		funcionario.reajustarSalario(reajuste);
	}

}
