package br.com.generation.polimorfismo;

public class TestaOpercoes {

	public static void calculaOperacao(OperacaoMatematica op, double x, double y) {
		System.out.println(op.calcular(x, y));
		
	}
	
	public static void main(String[] args) {
		
		calculaOperacao(new Soma(), 10, 10);
		calculaOperacao(new Multiplicacao(), 2, 5);
		calculaOperacao(new Divisao(), 10, 2);
		calculaOperacao(new Subtracao(), 10, 10);

	}

}
