package com.unic.unic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unic.unic.domain.Distancia;
import com.unic.unic.domain.Transporte;
import com.unic.unic.domain.interfaces.Veiculo;

@Service
public class CustoTransporteService {
	private static final int CARGA_LIMITE = 5000;
	@Autowired
	VeiculoService veiculoService;

	public double calcularCustoTransporte(Transporte transporte, int idVeiculo) {
		transporte.setVeiculo(buscaVeiculo(idVeiculo));
		double rodoviaPavimentada = calcularDistaciaPorRodovia(transporte.getPavimentada());
		double rodoviaNaoPavimentada = calcularDistaciaPorRodovia(transporte.getNaoPavimentada());
		double resultado = (rodoviaNaoPavimentada + rodoviaPavimentada) * transporte.getVeiculo().fatorMultiplicador();
		double carga = transporte.getCarga();
		if (carga > CARGA_LIMITE) {
			double excedente = carga - CARGA_LIMITE;
			double acressimo = excedente / 1000;
			double valor = acressimo * 2;
			resultado += valor;

		}

		return resultado;
	}

	private double calcularDistaciaPorRodovia(Distancia distancia) {
		return distancia.getKilometros() * distancia.getTipoVia().getCustoPorKmRodado();
	}

	private Veiculo buscaVeiculo(int idVeiculo) {
		return veiculoService.buscarVeiculoPorId(idVeiculo);
	}

}
