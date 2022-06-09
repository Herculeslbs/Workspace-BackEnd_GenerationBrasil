package br.com.generation.repeticao;

import java.util.Scanner;

public class Repeticao05DoWhile {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um
			número igual a zero. No final, mostre a soma dos números
			digitados.(DO...WHILE)
		 */
		int numero, soma=0;
		Scanner in = new Scanner(System.in);
		System.out.println("** Informe o número 0 para sair do sistema **");
		
		do {
			System.out.println("Informe um número :");
			numero = in.nextInt();
			soma += numero;
		}while(numero != 0);
		
		System.out.println("A soma dos números digitados: " + soma);
		
	}

}
