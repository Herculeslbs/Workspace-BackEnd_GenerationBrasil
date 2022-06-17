package br.com.generation.polimorfismo;

public class Cachorro extends Animal {
	
	private int velocidade;
	
	@Override
	public String emitirSom(String som) {
		
		return som;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	
}