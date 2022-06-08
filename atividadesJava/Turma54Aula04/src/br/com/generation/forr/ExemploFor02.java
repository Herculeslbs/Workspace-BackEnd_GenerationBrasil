package br.com.generation.forr;

import java.util.Scanner;

public class ExemploFor02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		
		int n = in.nextInt();
		int i, soma;
		
		for(i = 0, soma = 0; i <= n; i++) {
			System.out.printf("Soma : " + soma + " + " + i);
			soma += i;
			System.out.println(" = " + soma);
		}

	}

}
