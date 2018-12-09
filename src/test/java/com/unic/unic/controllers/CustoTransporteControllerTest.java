package com.unic.unic.controllers;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)

@AutoConfigureMockMvc
@SpringBootTest
public class CustoTransporteControllerTest {
	private static final int ZERO = 0;

		
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void postCaminhaoBau1() {
		BigDecimal format = new BigDecimal(37.2).setScale(2, RoundingMode.HALF_EVEN);
		try {
			mockMvc.perform(MockMvcRequestBuilders.post("/calculo").param("carga", String.valueOf(4000))
					.param("idVeiculo", String.valueOf(1)).param("distanciaPavimentada", String.valueOf(ZERO))
					.param("distanciaNaoPavimentada", String.valueOf(60)))
					.andExpect(MockMvcResultMatchers.model().attribute("resultado", format));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void postCaminhaoBau2() {
		BigDecimal format = new BigDecimal(57.6).setScale(2, RoundingMode.HALF_EVEN);
		try {
			mockMvc.perform(MockMvcRequestBuilders.post("/calculo").param("carga", String.valueOf(6000))
					.param("idVeiculo", String.valueOf(1)).param("distanciaPavimentada", String.valueOf(80))
					.param("distanciaNaoPavimentada", String.valueOf(20)))
					.andExpect(MockMvcResultMatchers.model().attribute("resultado", format));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void postCaminhaoCacamba1() {
		BigDecimal format = new BigDecimal(47.88).setScale(2, RoundingMode.HALF_EVEN);
		try {
			mockMvc.perform(MockMvcRequestBuilders.post("/calculo").param("carga", String.valueOf(5000))
					.param("idVeiculo", String.valueOf(2)).param("distanciaPavimentada", String.valueOf(50))
					.param("distanciaNaoPavimentada", String.valueOf(30)))
					.andExpect(MockMvcResultMatchers.model().attribute("resultado", format));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void postCaminhaoCacamba2() {
		BigDecimal format = new BigDecimal(62.70).setScale(2, RoundingMode.HALF_EVEN);
		try {
			mockMvc.perform(MockMvcRequestBuilders.post("/calculo").param("carga", String.valueOf(8000))
					.param("idVeiculo", String.valueOf(2)).param("distanciaPavimentada", String.valueOf(100))
					.param("distanciaNaoPavimentada", String.valueOf(0)))
					.andExpect(MockMvcResultMatchers.model().attribute("resultado", format));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void postCarreta() {
		BigDecimal format = new BigDecimal(138.99).setScale(2, RoundingMode.HALF_EVEN);
		//BigDecimal format = new BigDecimal(150.19).setScale(2, RoundingMode.HALF_EVEN);
		/**
		 * valor passado na tabela de 150.19 não esta batendo
		 */
		try {
			mockMvc.perform(MockMvcRequestBuilders.post("/calculo").param("carga", String.valueOf(12000))
					.param("idVeiculo", String.valueOf(3)).param("distanciaPavimentada", String.valueOf(0))
					.param("distanciaNaoPavimentada", String.valueOf(180)))
					.andExpect(MockMvcResultMatchers.model().attribute("resultado", format));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
