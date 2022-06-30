package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloworld(){
		return "Hello World!!!";
	}
	@GetMapping("/bsm")
	public String bsm(){
		return "Trabalho em equipe\n"
				+ "Atenção aos Detalhes\n"
				+ "Proatividaden"
				+ "Comunicaçãon"
				+ "Orientação ao Futuron"
				+ "Responsabilidade Pessoal\n"
				+ "Persistência\n"
				+ "Mentalidade de Crescimento";
	}
	@GetMapping("/objetivos")
	public String objetivos(){
		return " Realizar todas as atividades da semana\n"
				+ "Me comunicar mais com meus colegas de projeto \n"
				+ "Ter mais proatividade\n";
	}
}
