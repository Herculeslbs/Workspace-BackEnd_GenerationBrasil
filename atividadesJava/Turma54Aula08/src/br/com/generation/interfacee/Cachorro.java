package br.com.generation.interfacee;

public class Cachorro implements Animal{

	@Override //--> sobrescrita de metodo
	public void somAnimal() {
		System.out.println("O som do Cachorro: au au au...");
		
	}

	@Override
	public void dormir() {
		System.out.println("O Cachorro dormindo...");
		
	}

}
