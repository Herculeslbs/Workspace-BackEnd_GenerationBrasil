package br.com.generation.interfacee;

public class TestInterfaceAnimal {

	public static void main(String[] args) {
		
		Cachorro meuCachorro = new Cachorro();
		meuCachorro.somAnimal();
		meuCachorro.dormir();
		
		Gato meuGato = new Gato();
		meuGato.somAnimal();
		meuGato.dormir();

	}

}
