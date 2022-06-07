package br.com.generation.lacodecisao;

import java.util.Scanner;

public class LacoDecisao02 {

	public static void main(String[] args) {
		// 2- Faça um programa que entre com três números e coloque em ordem crescente.
		
Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o 1° número inteiro: ");
		n1 = (int) entrada.nextDouble();
		
		System.out.println("Digite o 2° número inteiro: ");
		n2 = (int) entrada.nextDouble();
		
		System.out.println("Digite o 3° número inteiro: ");
		n3 = (int) entrada.nextDouble();

		if(n1 < n2 && n1 < n3 && n2 < n3) {
			System.out.println("Ordem crescente: " + n1 + " - " + n2 + " - " + n3);
		}
		if(n1 < n3 && n1 < n2 && n3 < n2) {
			System.out.println("Ordem crescente: " + n1 + " - " + n3 + " - " + n2);
		}
		if(n2 < n1 && n2 < n3 && n1 < n3) {
			System.out.println("Ordem crescente: " + n2 + " - " + n1 + " - " + n3);
		}
		if(n2 < n1 && n2 < n3 && n3 < n1) {
			System.out.println("Ordem crescente: " + n2 + " - " + n3 + " - " + n1);
		}
		if(n3 < n1 && n3 < n2 && n1 < n2) {
			System.out.println("Ordem crescente: " + n3 + " - " + n1 + " - " + n2);
		}
		if(n3 < n1 && n3 < n2 && n2 < n1) {
			System.out.println("Ordem crescente: " + n3 + " - " + n2 + " - " + n1);
		}
	}

}
