package br.com.generation.repeticao;

import java.util.Scanner;

public class Repeticao05DoWhile {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um
			n�mero igual a zero. No final, mostre a soma dos n�meros
			digitados.(DO...WHILE)
		 */
		int numero, soma=0;
		Scanner in = new Scanner(System.in);
		System.out.println("** Informe o n�mero 0 para sair do sistema **");
		
		do {
			System.out.println("Informe um n�mero :");
			numero = in.nextInt();
			soma += numero;
		}while(numero != 0);
		
		System.out.println("A soma dos n�meros digitados: " + soma);
		
	}

}
