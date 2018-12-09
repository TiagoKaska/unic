package com.unic.unic.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CarretaTest {
	private static final String DESCRICAO = "Carreta";
	private static final double FATOR_MULTIPLICADOR_CARRETA = 1.12;
	private static final int ID = 3;

	@Test
	public void id() {
		Carreta carreta = new Carreta();
		assertEquals(ID, carreta.id());
	}

	@Test
	public void descricao() {
		Carreta carreta = new Carreta();
		assertEquals(DESCRICAO, carreta.descricao());
	}

	@Test
	public void fatorMultiplicador() {
		Carreta carreta = new Carreta();
		assertTrue(carreta.fatorMultiplicador() == FATOR_MULTIPLICADOR_CARRETA);
	}
}
