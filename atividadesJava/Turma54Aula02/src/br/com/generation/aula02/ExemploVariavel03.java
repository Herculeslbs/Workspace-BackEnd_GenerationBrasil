package br.com.generation.aula02;

import java.util.Scanner;

public class ExemploVariavel03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		galoes = 0;
		
		System.out.println("Digite o n�mero de gal�es: ");
		galoes = leia.nextDouble();
		
		litros = galoes * 3.7854;
		
		System.out.println(galoes + " Galo�es Americanos s�o: " + litros + " Litros.");
	}

}
