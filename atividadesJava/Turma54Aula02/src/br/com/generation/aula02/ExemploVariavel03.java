package br.com.generation.aula02;

import java.util.Scanner;

public class ExemploVariavel03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		galoes = 0;
		
		System.out.println("Digite o número de galões: ");
		galoes = leia.nextDouble();
		
		litros = galoes * 3.7854;
		
		System.out.println(galoes + " Galoões Americanos são: " + litros + " Litros.");
	}

}
