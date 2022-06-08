package br.com.generation.dowhilee;

public class ExemploDowhile {

	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		
		do {
			System.out.println(i);
			i++;
			Thread.sleep(500);
		}while(i <= 7); 
				
	}	
		
}



