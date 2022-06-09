package br.com.generation.lacodecisao;

import java.util.Scanner;

public class LacoDecisao04 {

	public static void main(String[] args) {
		/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado. */
		
		double numero;
		System.out.println("Digite um valor:");
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextDouble();
		if(numero%2 == 0) {
			System.out.println("O número " + numero + " é par e sua raiz quadrada é " + Math.sqrt(numero));
		}else {
			System.out.println("O número " + numero + " é ímpar e elevado ao quadrado é " + Math.pow(numero, 2));
		}

	}

}
