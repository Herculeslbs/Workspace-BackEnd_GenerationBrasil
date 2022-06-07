package br.com.generation.aula02;

import java.util.Scanner;

public class ExemploVariavel04 {

	public static void main(String[] args) {
		
		//escreva --> mostra para o usuario textos junto com variaveis. --> System.out.println
		//leia -----> recebe no console um valor digitado pelo usuario. --> import de uma biblioteca(scanner)
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, soma, sub, div, mult;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		soma = a + b;
		sub = a - b;
		div = a / b;
		mult = a * b;
		
		System.out.println("Resultado da Soma: " + soma);
		System.out.println("Resultado da Subtração: " + sub);
		System.out.println("Resultado da Divisão: " + div);
		System.out.println("Resultado da Multiplicação: " + mult);
	}

}
