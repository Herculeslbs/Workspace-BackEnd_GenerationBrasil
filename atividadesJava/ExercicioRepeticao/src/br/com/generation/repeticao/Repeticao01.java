package br.com.generation.repeticao;

public class Repeticao01 {
	//1- Informar todos os números de 1000 a 1999 que quando divididos por 11
		//obtemos resto = 5. (FOR)
	public static void main(String[] args) {
		
		
		
		for(int r , n = 1000; n <= 1999; n++) {
			r = n % 11;
			if( r == 5) 
			System.out.println(n);	
		
	   }
	}
}
