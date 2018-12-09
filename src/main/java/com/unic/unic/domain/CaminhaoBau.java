package com.unic.unic.domain;

import com.unic.unic.domain.interfaces.Veiculo;

public class CaminhaoBau implements Veiculo {

	private static final String DESCRICAO = "Caminhão Baú";
	private static final double FATOR_MULTIPLICADOR = 1.00;
	private static final int ID = 1;

	@Override
	public double fatorMultiplicador() {
		return FATOR_MULTIPLICADOR;
	}

	@Override
	public String descricao() {
		return DESCRICAO;
	}

	@Override
	public int id() {
		return ID;
	}

}
