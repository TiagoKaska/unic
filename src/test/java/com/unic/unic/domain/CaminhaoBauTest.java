package com.unic.unic.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CaminhaoBauTest {

	private static final double FATOR_MULTIPLICADOR_CAMINAO_BAU = 1.00;
	private static final String DESCRICAO = "Caminhão Baú";
	private static final int ID = 1;

	@Test
	public void id() {
		CaminhaoBau caminhao = new CaminhaoBau();
		assertEquals(ID, caminhao.id());
	}

	@Test
	public void descricao() {
		CaminhaoBau caminhao = new CaminhaoBau();
		assertEquals(DESCRICAO, caminhao.descricao());
	}

	@Test
	public void fatorMultiplicador() {
		CaminhaoBau caminhao = new CaminhaoBau();
		assertTrue(caminhao.fatorMultiplicador() == FATOR_MULTIPLICADOR_CAMINAO_BAU);
	}
}
