package com.unic.unic.domain;

import com.unic.unic.domain.interfaces.Veiculo;

public class Transporte {
	private Veiculo veiculo;
	private Distancia naoPavimentada;
	private Distancia pavimentada;
	private double carga;

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Distancia getNaoPavimentada() {
		return naoPavimentada;
	}

	public void setNaoPavimentada(Distancia naoPavimentada) {
		this.naoPavimentada = naoPavimentada;
	}

	public Distancia getPavimentada() {
		return pavimentada;
	}

	public void setPavimentada(Distancia pavimentada) {
		this.pavimentada = pavimentada;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

}
