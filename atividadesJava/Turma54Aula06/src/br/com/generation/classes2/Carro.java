package br.com.generation.classes2;

public class Carro {
	


	//Atributos
	String cor;
	String modelo;
	int ano;
	boolean legalizado;
	int velocidade;
	int velocidade1 = velocidade;
	//Métodos
	void acelerar(int aceleracao) throws InterruptedException { 
			
	System.out.println("Carro acelarando...");
	for (int i = velocidade; i <= aceleracao; i += 10) {
				System.out.println(i);
				velocidade = i;
				Thread.sleep(500);
	
			
		}	
	
	
}	
	void freiar(int reduzir) throws InterruptedException {
	System.out.println("Carro freiando...");	
	for (int i = velocidade; i >= reduzir; i -= 10) {
			System.out.println(i);
			velocidade1 = i;
			Thread.sleep(500);
		}
	
	}
}