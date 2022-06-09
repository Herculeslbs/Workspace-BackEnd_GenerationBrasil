package br.com.generation.vetorMatriz;

import java.util.Locale;
import java.util.Scanner;

public class Vetor01 {
/*
		 * 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
			 atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		 

		 //encontrar a maior nota e criar um vetor que leia 5 valores de pontuação e apresentar no final

		 real vetor[5], maiorNota=0

		 para(inteiro i = 0; i < 5; i++){
		 	escreva("Informe a ",(i+1),"ª nota do aluno: ")
		 	leia(vetor[i])
		 	se(vetor[i] > maiorNota){
		 		maiorNota = vetor[i]
		 	}
		 }
		 escreva("As notas foram: ")
		 para(inteiro i=0; i<5; i++){
		 	escreva(vetor[i], " | ")
		 }
		 escreva("\nA maior nota foi: ", maiorNota)*/
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));
		
		double[] notas = new double[5];
		double maiorNota=0;
		
		System.out.println("---> Notas dos Alunos <---");
		for(int i = 0; i < 5 ; i++) {
			System.out.printf("Informe a " + (i+1) + "ª nota do aluno: ");
			notas[i] = entrada.nextDouble();
			if(notas[i] > maiorNota) {
				maiorNota = notas[i];
			}
			
		}
		System.out.println();
		System.out.printf("As notas foram: ");	
		for(int i = 0; i < 5; i++) {
			System.out.print(notas[i] + " | ");
		}
		System.out.println("\nA maior nota foi: " + maiorNota);
	}

}
