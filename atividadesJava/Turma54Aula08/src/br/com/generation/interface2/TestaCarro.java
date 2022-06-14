package br.com.generation.interface2;

public class TestaCarro {

	public static void main(String[] args) {
		Carro c = new Ferrari();
		c.acelerar();
		
		c = new Fusca();
		c.acelerar();
	}

}
