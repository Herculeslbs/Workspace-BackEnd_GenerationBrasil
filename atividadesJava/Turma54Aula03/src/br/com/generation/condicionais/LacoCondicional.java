package br.com.generation.condicionais;

import java.util.Scanner;

public class LacoCondicional {
	//La�os Condicionais
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media, soma;
		
		System.out.println("Digite a 1� nota do Aluno: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a 2� nota do Aluno: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 9.0) {
			System.out.println("Aprovado com  louvores" + "\nM�dia: " + media);
			soma = nota1 + nota2;
			System.out.println(soma);
		}
		else if(media >= 6.0 && media < 9.0) {
			System.out.println("Aprovado" + "\nM�dia: " + media);
		}
		else if(media >= 3.0 && media < 6.0) {
			System.out.println("Recupera��o" + "\nM�dia: " + media);
		}
		else {
			System.out.println("Reprovado" + "\nM�dia: " + media);
		}
	}

}
