package com.unic.unic.domain;

import com.unic.unic.domain.interfaces.Veiculo;

public class Carreta implements Veiculo {
	private static final String DESCRICAO = "Carreta";
	private static final double FATOR_MULTIPLICADOR = 1.12;
	private static final int ID = 3;

	@Override
	public double fatorMultiplicador() {
		return FATOR_MULTIPLICADOR;
	}

	@Override
	public int id() {
		return ID;
	}

	@Override
	public String descricao() {
		return DESCRICAO;
	}

}
