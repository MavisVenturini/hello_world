package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-bsm")
public class ListaBSMController {

	@GetMapping
	public String listaBSM(){
		return "Trabalho em equipe\n"
				+ "Atenção aos Detalhes\n"
				+ "Proatividade\n"
				+ "Comunicação\n"
				+ "Orientação ao Futuro\n"
				+ "Responsabilidade Pessoal\n"
				+ "Persistência\n"
				+ "Mentalidade de Crescimento";
	}
}
