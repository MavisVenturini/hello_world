package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivos(){
		return " Realizar todas as atividades da semana \n"
				+ "Me comunicar mais com meus colegas de projeto \n"
				+ "Ter mais proatividade";
	}

}
