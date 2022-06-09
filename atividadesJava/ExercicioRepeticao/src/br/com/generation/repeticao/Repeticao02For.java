package br.com.generation.repeticao;

import java.util.Scanner;

public class Repeticao02For {
	// 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
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
			System.out.println("Total de números pares: " + par);
			System.out.println("Total de números impares: " + impar);
   }

}

