package br.com.generation.vetor;

public class ArrayVetor {
		// Array --> arranjo
		// Vetor --> um array de uma unica dimensão
		// Matriz -> é um array com varias dimensões
	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10]; //[0]...[9]
		
		arrayVetor[5] = 653;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("indice do vetor: " + i + " --> " + arrayVetor[i]);
		}	
	}

}
