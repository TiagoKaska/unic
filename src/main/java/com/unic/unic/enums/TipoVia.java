package com.unic.unic.enums;

public enum TipoVia {
	PAVIMENTADA(0.54), NAO_PAVIMENTADA(0.62);
	
	private double custoPorKmRodado;

	public double getCustoPorKmRodado() {
		return custoPorKmRodado;
	}

	private TipoVia(double value) {
		this.custoPorKmRodado = value;
	}

	
}
