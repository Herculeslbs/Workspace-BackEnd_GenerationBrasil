package br.com.generation.lacodecisao;

import java.util.Scanner;

public class LacoDecisao04 {

	public static void main(String[] args) {
		/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado. */
		
		double numero;
		System.out.println("Digite um valor:");
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextDouble();
		if(numero%2 == 0) {
			System.out.println("O n�mero " + numero + " � par e sua raiz quadrada � " + Math.sqrt(numero));
		}else {
			System.out.println("O n�mero " + numero + " � �mpar e elevado ao quadrado � " + Math.pow(numero, 2));
		}

	}

}
