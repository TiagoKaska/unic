package com.unic.unic.controllers;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.unic.unic.controllers.vm.TransporteVM;
import com.unic.unic.domain.Distancia;
import com.unic.unic.domain.Transporte;
import com.unic.unic.enums.TipoVia;
import com.unic.unic.services.CustoTransporteService;

@Controller
public class CustoTransporteController {
	@Autowired
	private CustoTransporteService service;

	@PostMapping("/calculo")
	public String greetingSubmit(@ModelAttribute TransporteVM transporteVM, Model model) {
		Transporte transporte = new Transporte();
		transporte.setCarga(transporteVM.getCarga());
		transporte.setNaoPavimentada(new Distancia(TipoVia.NAO_PAVIMENTADA, transporteVM.getDistanciaNaoPavimentada()));
		transporte.setPavimentada(new Distancia(TipoVia.PAVIMENTADA, transporteVM.getDistanciaPavimentada()));

		double resultado = service.calcularCustoTransporte(transporte, transporteVM.getIdVeiculo());

		BigDecimal format = BigDecimal.valueOf(resultado).setScale(2, RoundingMode.HALF_EVEN);

		model.addAttribute("resultado", format);

		return "result";

	}

}
