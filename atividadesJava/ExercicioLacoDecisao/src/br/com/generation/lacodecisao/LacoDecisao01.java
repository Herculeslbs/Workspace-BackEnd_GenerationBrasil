package br.com.generation.lacodecisao;

import java.util.Scanner;

public class LacoDecisao01 {

	public static void main(String[] args) {
		//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o 1� n�mero inteiro: ");
		n1 = (int) entrada.nextDouble();
		
		System.out.println("Digite o 2� n�mero inteiro: ");
		n2 = (int) entrada.nextDouble();
		
		System.out.println("Digite o 3� n�mero inteiro: ");
		n3 = (int) entrada.nextDouble();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("Maior n�mero digtado: " + n1);
		}
		
		if(n2 > n1 && n2 > n3) {
			System.out.println("Maior n�mero digtado: " + n2);
		}
		if(n3 > n1 && n3 > n2) {
			System.out.println("Maior n�mero digtado: " + n3);
		}
		else if(n1 == n2 || n1 == n3 || n2 == n1 || n2 == n3 || n3 == n1 || n3 == n2) {
			System.out.println("N�meros com os mesmos valores");
		}

	}

}
