package br.com.generation.testeunitario;

public class Calculadora {
	
	public int soma(int numero1, int numero2) {
		System.out.println("Valores inteiros");
		return numero1 + numero2;
	}
	
	public double soma(double numero1, double numero2) {
		System.out.println("Ponto flutuante");
		return numero1 + numero2;
	}
}
