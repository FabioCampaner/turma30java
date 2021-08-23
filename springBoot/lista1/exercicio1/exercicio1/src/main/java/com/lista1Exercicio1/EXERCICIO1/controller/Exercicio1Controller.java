package com.lista1Exercicio1.EXERCICIO1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio1Controller {

	@RequestMapping("/exercicio1")
	public String resposta() {
		return "A mentalidade utilizada para a realização dessa atividade foi a persistência;<br>A habilidade utilizada foi a atenção aos detalhes, por se tratar de um novo conteúdo.";
	}
}
