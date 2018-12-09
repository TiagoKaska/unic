package com.unic.unic.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CaminhaoCacambaTest {
	private static final String DESCRICAO = "Caminhão Caçamba";
	private static final double FATOR_MULTIPLICADOR_CAMINHAO_CACAMBA = 1.05;
	private static final int ID = 2;

	@Test
	public void id() {
		CaminhaoCacamba cacamba = new CaminhaoCacamba();
		assertEquals(ID, cacamba.id());
	}

	@Test
	public void descricao() {
		CaminhaoCacamba cacamba = new CaminhaoCacamba();
		assertEquals(DESCRICAO, cacamba.descricao());
	}

	@Test
	public void fatorMultiplicador() {
		CaminhaoCacamba cacamba = new CaminhaoCacamba();
		assertTrue(cacamba.fatorMultiplicador() == FATOR_MULTIPLICADOR_CAMINHAO_CACAMBA);
	}
}
