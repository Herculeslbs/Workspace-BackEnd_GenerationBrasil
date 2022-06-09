package br.com.generation.vetor;

public class ArrayVetor02 {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[31];
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 29.9;
		temperaturas[2] = 35.6;
		
		System.out.println("O valor da temperatura no dia 03: " + temperaturas[2]);
		
		System.out.println("O tamanho do vetor de temperaturas: " + temperaturas.length);
		
		System.out.println("Valores do meu Vetor de Temperatura: ");
		
		for(int i = 0; i < temperaturas.length; i++) {	//(i+1) p/ ñ aparecer indice [0]
			System.out.println("O valor da temperatura do dia: " + (i+1) + "º é: " + temperaturas[i]);
		}

	}

}
