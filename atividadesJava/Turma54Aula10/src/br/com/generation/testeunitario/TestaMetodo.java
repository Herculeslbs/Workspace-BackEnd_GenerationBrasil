package br.com.generation.testeunitario;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		int resultadoEsperado = 4;
		
		double resultado = calc.soma(4, 2.0);
		
		if(resultado == resultadoEsperado) {
			System.out.println("Teste OK!");
		}
		else {
			System.out.println("Teste Falhou");
		}
	}

}
