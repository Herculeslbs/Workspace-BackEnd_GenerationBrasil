package com.generation.listaBSM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-BSM")
public class listaBSMController {

	@GetMapping
	public String listabsm() {
		return "PT - BSM-0 - Introdução às Habilidades Comportamentais e Mentalidades\n"
			 + "PT - BSM-GM - Mentalidade de Crescimento\n"
			 + "PT - BSM-P - Persistência\n"
			 + "PT - BSM-P - Persistência\n"
			 + "PT - BSM-PR - Responsabilidade Pessoal\n"
			 + "PT - BSM-FO - Orientação ao Futuro\n"
			 + "PT - BSM-C - Comunicação\n"
			 + "PT - BSM-C - Comunicação\n"
			 + "PT - BSM-C - Comunicação\n"
			 + "PT - BSM-T - Trabalho em Equipe\n"
			 + "PT - BSM-T - Trabalho em Equipe\n"
			 + "PT - C-GG - Dar e Receber\n"
			 + "PT - SA-CS1 - Estudo de Caso 1: Força de Trabalho Distribuída\n"
			 + "PT - SA-CS2 - Estudo de Caso 2: Entregável Urgente\n"
			 + "PT - SA-CS3 - Estudo de Caso 3: Novas Habilidades Necessárias\n"
			 + "PT - SA-CS4 - Estudo de Caso 4: Aprender e Compartilhar\n"
			 + "PT - SSM-TM - Gestão do Tempo\n"
			 + "PT - SSM-IV - Introdução à VIA e a Descoberta das Forças de Caráter VIA\r\n"
			 + "PT - SSM-RLW - Maximizar a Aprendizagem Online e o Trabalho Remoto\n";
				
		}
}
