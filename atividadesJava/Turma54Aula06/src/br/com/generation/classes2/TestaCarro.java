package br.com.generation.classes2;

public class TestaCarro {

	public static void main(String[] args) throws InterruptedException {
		//Estanciando um objeto...
		//[Classe --> Objeto --> new Construtor]
		Carro BMW = new Carro();
		
		BMW.modelo = "x1";
		BMW.cor = "Azul";
		BMW.ano = 2022;
		BMW.legalizado = true;
		BMW.velocidade = 0;
		
		System.out.println("Modelo: " + BMW.modelo);
		System.out.println("Cor: " + BMW.cor);
		System.out.println("Ano: " + BMW.ano);
		System.out.println("Leglizado: " + BMW.legalizado);
		System.out.println("Velocidade: " + BMW.velocidade);
		
		BMW.acelerar(100);
		System.out.println("Velocidade: " + BMW.velocidade);
		
		BMW.freiar(0);
		System.out.println("Reduzindo velocidade: " + BMW.velocidade1);
	}

}
