package com.generation.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivosController {
	
	@GetMapping
	public String objetivos() {
		return "1° Aprimorar meus conhecimentos em banco de dados relacionais e na ferramenta MySQL.\n"
			 + "2° Aprimorar meus conhecimentos em Spring Boot e APIs e microserviços.\n"
			 + "3° Aprimorar meus conhecimentos em Java. ";
				
	}

}
