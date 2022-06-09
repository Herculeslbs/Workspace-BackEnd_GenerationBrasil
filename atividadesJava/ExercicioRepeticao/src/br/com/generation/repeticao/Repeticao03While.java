package br.com.generation.repeticao;

import java.util.Scanner;

public class Repeticao03While {
	/*3- Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. (WHILE)*/
	
	public static void main(String[] args) {
		
int idade=0, menosVinteUm=0, maisDeCinquenta=0;
		
		Scanner in = new Scanner(System.in);//solicita��o de input
		System.out.println("** Para fechar o sistema digite -99 **");
		//condi��o de repeticao
		while(idade != -99) {
			System.out.println("Informe sua idade: ");
			idade = in.nextInt();	// recebe idade do usu�rio
			//contar pessoas com menos de vinte e um anos
			if(idade < 21 && idade > 0) {
				menosVinteUm++;
			}
			//contar pessoas com mais de ciquenta anos
			if(idade > 50) {
				maisDeCinquenta++;
			}
		}
		System.out.println("O total de pessoas com menos de 21 anos �: "+ menosVinteUm);
		System.out.println("O total de pessoas com mais de cinquenta anos �: "+ maisDeCinquenta);
	}

}