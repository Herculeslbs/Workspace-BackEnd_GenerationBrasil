package br.com.generation.polimorfismo;

public class Animal {
	
	private String nome;
	private int idade;
	
	
	public String emitirSom(String som) {		
		return som;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}




}