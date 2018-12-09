package com.unic.unic.services;

import org.springframework.stereotype.Service;

import com.unic.unic.domain.CaminhaoBau;
import com.unic.unic.domain.CaminhaoCacamba;
import com.unic.unic.domain.Carreta;
import com.unic.unic.domain.interfaces.Veiculo;

@Service
public class VeiculoService {
	private static final int CAMINHAO_BAU = 1;
	private static final int CAMINHAO_CACAMBA = 2;
	

	public Veiculo buscarVeiculoPorId(int id) {
		return buscarCaminhaoBau(id);
	}

	private Veiculo buscarCaminhaoBau(int id) {
		if (id == CAMINHAO_BAU) {
			return new CaminhaoBau();
		}
		return buscarCaminhaoCacamba(id);
	}

	private Veiculo buscarCaminhaoCacamba(int id) {
		if (id == CAMINHAO_CACAMBA) {
			return new CaminhaoCacamba();
		}
		return buscarCarreta();
	}

	private Veiculo buscarCarreta() {
		return new Carreta();
	}
}
