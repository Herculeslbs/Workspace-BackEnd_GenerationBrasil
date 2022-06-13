package br.com.generation.construtor;

import java.util.Scanner;

public class TestaConstrutor {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa(entrada.next(), entrada.nextInt());
		
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
	}

}
