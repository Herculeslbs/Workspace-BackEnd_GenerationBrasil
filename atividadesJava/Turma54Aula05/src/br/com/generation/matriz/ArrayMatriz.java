package br.com.generation.matriz;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		//Declaração de Matriz
		double[][] notasAlunos = new double[2][4];
		
		System.out.println("      ---> Notas dos Alunos <---");
		
		//adicionando valores na Matriz
		for(int linhas = 0; linhas < notasAlunos.length; linhas++) {				//(colunas+1)
			for(int colunas = 0; colunas < notasAlunos[linhas].length; colunas++) {	//(linhas+1) p/ ñ aparecer indice [0]
				System.out.printf("Digite as notas na posição da Matriz: %d.%d: " , (linhas+1) , (colunas+1));
				notasAlunos[linhas][colunas] = entrada.nextDouble();
			}
			System.out.println();//dentro do laço das linhas p/ quebrar linha
		}
		System.out.println("---> Visualizando Notas dos Alunos <---");
		//Mostrando os valores da Matriz
		for(int linhas = 0; linhas < notasAlunos.length; linhas++) {
			for(int colunas = 0; colunas < notasAlunos[linhas].length; colunas++) {
				System.out.printf(notasAlunos[linhas][colunas] + " | ");
			}
			System.out.println();//dentro do laço das linhas p/ quebrar linha
		}	
	}
	
}	