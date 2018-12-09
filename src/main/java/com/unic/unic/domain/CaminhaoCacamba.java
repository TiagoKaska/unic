package com.unic.unic.domain;

import com.unic.unic.domain.interfaces.Veiculo;

public class CaminhaoCacamba implements Veiculo {
	private static final String DESCRICAO = "Caminhão Caçamba";
	private static final double FATOR_MULTIPLICADOR = 1.05;
	private static final int ID = 2;

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
