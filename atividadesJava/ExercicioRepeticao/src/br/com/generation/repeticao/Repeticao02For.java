package br.com.generation.repeticao;

import java.util.Scanner;

public class Repeticao02For {
	// 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor a ser computado: ");
		
		int p,par=0, impar=0,n = in.nextInt();
		
		
		for(int i=0; i <= n; i++) {
			p = i % 2;
			if(p == 0) {
				par++;
			}else{			
				impar++;	
			}
			System.out.println(i);
			
	  }
			System.out.println("Total de n�meros pares: " + par);
			System.out.println("Total de n�meros impares: " + impar);
   }

}

