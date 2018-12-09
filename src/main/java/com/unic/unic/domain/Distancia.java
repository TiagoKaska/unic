package com.unic.unic.domain;

import com.unic.unic.enums.TipoVia;

public class Distancia {
	private TipoVia tipoVia;

	private double kilometros;

	public Distancia(TipoVia tipoVia, double kilometros) {
		this.tipoVia = tipoVia;
		this.kilometros = kilometros;
	}

	public TipoVia getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(TipoVia tipoVia) {
		this.tipoVia = tipoVia;
	}

	public double getKilometros() {
		return kilometros;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}
}
