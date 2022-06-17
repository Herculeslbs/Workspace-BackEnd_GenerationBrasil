package br.com.generation.polimorfismo;

public class TestarAnimais {
	
	public static void emiteSom(Animal emitirSom, String som) {
		System.out.println(emitirSom.emitirSom(som));
	}


	public static void main(String[] args) {
		
		emiteSom(new Cachorro(),"au au au");
		emiteSom(new Cavalo(),"irrrii relichin");
		emiteSom(new Preguica(),"zzZZZzz..ZZzzz");

	}

}