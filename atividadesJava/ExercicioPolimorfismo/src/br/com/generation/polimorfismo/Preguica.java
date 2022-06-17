package br.com.generation.polimorfismo;

public class Preguica extends Animal {
	
	private int subirArvore;
	
	@Override
	public String emitirSom(String som) {
		
		return som;
	}

	public int getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(int subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	

}