package br.com.generation.forr;

public class ExemploFor01 {

	public static void main(String[] args) throws InterruptedException {
		//for(declara��o; condi��o; incremento ou decremento)
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(500);
		}

	}

}
