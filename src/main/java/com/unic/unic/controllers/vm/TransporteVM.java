package com.unic.unic.controllers.vm;

public class TransporteVM {
	private double distanciaNaoPavimentada;
	private double distanciaPavimentada;
	private int idVeiculo;
	private double carga;

	public double getDistanciaNaoPavimentada() {
		return distanciaNaoPavimentada;
	}

	public void setDistanciaNaoPavimentada(double distanciaNaoPavimentada) {
		this.distanciaNaoPavimentada = distanciaNaoPavimentada;
	}

	public double getDistanciaPavimentada() {
		return distanciaPavimentada;
	}

	public void setDistanciaPavimentada(double distanciaPaviamentada) {
		this.distanciaPavimentada = distanciaPaviamentada;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

}
