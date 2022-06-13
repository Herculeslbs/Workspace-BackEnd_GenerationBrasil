package br.com.generation.construtor;

public class Pessoa {

	String nome;
	int idade;
	
	Pessoa(String n, int i){
		System.out.println("Inicializando o construtor da classe Pessoa...");
		nome = n;
		idade = i;
	}
}
