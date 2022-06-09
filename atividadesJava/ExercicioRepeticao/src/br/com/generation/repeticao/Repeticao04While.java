package br.com.generation.repeticao;

import java.util.Scanner;

public class Repeticao04While {

	
		public static void main(String[] args) {
		 /*
			 * Uma empresa desenvolveu uma pesquisa para saber as características
				psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
				era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
				(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
				agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
				pessoas, calcule e mostre: (WHILE)
	 			número de pessoas calmas;
	 			número de mulheres nervosas;
	 			número de homens agressivos;
	 			número de outros calmos;
	 			número de pessoas nervosas com mais de 40 anos;
	 			número de pessoas calmas com menos de 18 anos.
			 */
			
			int idade, sexo, personalidade, i=0, masculino=0, feminino=0, outros=0, calmo=0, nervoso=0, agressivo=0, mulherNervosa=0;
			int homemAgressivo=0, outrosCalmos=0, maisQuarentaN=0, menosDezoitoC=0, numeroPessoas;
			Scanner in = new Scanner(System.in);
			System.out.println("Informe o número de pessoas que serão pesquisadas:");
			numeroPessoas = in.nextInt();
			
			
			while(i < numeroPessoas) {
				
				
				System.out.println("Informe sua idade: ");
				idade = in.nextInt();
				System.out.println("Informe seu genero.\n1 - Masculino | 2 - Feminino | 3 - Outros ");
				sexo = in.nextInt();
				switch(sexo) {
					case 1:
						masculino++;
						break;
					case 2:
						feminino++;
						break;
					case 3:
						outros++;
						break;		
				}
				//saber personalidade
				System.out.println("Qual seu tipo de personalidade\n1 - Calmo | 2 - Nervoso | 3 - Agressivo");
				personalidade = in.nextInt();
				if(personalidade == 1) {
					calmo++;
				}
				if(personalidade == 2) {
					nervoso++;
				}
				if(personalidade == 3) {
					agressivo++;
				}
				
				//estatiscas condicionais
				if(sexo == 2 && personalidade == 2) {
					mulherNervosa++;
				}
				if(sexo == 1 && personalidade == 3) {
					homemAgressivo++;
				}
				if(sexo == 3 && personalidade == 1) {
					outrosCalmos++;
				}
				if(idade > 40 && personalidade == 2) {
					maisQuarentaN++;
				}
				if(idade < 18 && personalidade == 3 ) {
					menosDezoitoC++;
				}
				
				i++;
			}


			System.out.println("Número de pessoas calmas: "+calmo+ "\r\n"
					+ "Número de mulheres nervosas: "+mulherNervosa+ "\r\n"
					+ "Número de homens agressivos: "+homemAgressivo+"\r\n"
					+ "Número de outros calmos: "+outrosCalmos+ "\r\n"
					+ "Número de pessoas nervosas com mais de 40 anos: "+maisQuarentaN+"\r\n"
					+ "Número de pessoas calmas com menos de 18 anos: "+menosDezoitoC);
	}

	}