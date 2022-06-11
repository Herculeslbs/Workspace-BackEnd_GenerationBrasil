package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMetodos {
	
	static int numero3, numero4, multiplicacao;//--> variaveis globais

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor da variavel numero03: ");
		numero3 = entrada.nextInt();
		System.out.println("Digite o valor da variavel numero03: ");
		numero4 = entrada.nextInt();
		
		System.out.println("Ol� Sou o m�todo principal, sou o start da sua aplica��o!");
		metodo01();
		metodo03();
		metodo04();
		
		TestaMetodoFora.metodo05();
		
		metodo06(90, 20);
			
	}
	
	public static void metodo01() {
		System.out.println("Ol� Sou o m�todo01!");
		metodo02();
	}
//No metodo as variaveis declaradas funcionam apenas dentro dele.	
	public static void metodo02() {
	
		double numero1 = 10, numero2 = 30, soma;//--> variaveis locais.
		soma = numero1 + numero2;
		System.out.println("Soma realizada no m�todo02: " + soma);
		
	}
	
	public static void metodo03() {
		multiplicacao = numero3 * numero4;
	}
	
	public static void metodo04() {
		System.out.println("Metodo 04 est� mostrando o calculo que foi feito no metodo03: " + multiplicacao);
	}
	
	public static void metodo06(int num5, int num6) {
		int subtracao = num5 - num6;
		System.out.println("A subtr��o no m�todo 06: " + subtracao);
	}
	
}
