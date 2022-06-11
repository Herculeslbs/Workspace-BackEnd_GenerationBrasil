package br.com.generation.sobrecargametodos;

//import java.util.Scanner;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);
		//double numero1 = entrada.nextDouble();
		//double numero2 = entrada.nextDouble();
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		//somando dois inteiros...
		System.out.println(calc.soma(10, 100));
		
		//somar dois valores fracionários...
		System.out.println(calc.soma(10.0, 101.8));
		System.out.println(calc.soma(8.5, 9));

	}

}
