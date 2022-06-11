package br.com.generation.encapsulamento;

import java.util.Scanner;

public class TestaVeiculo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Veiculo carro = new Veiculo();
		
		System.out.println("Digite a cor do Veículo: ");
		carro.setCor(entrada.next());
		System.out.println("Digite o ano do Veículo: ");
		carro.setAno(entrada.nextInt());
		System.out.println("Digite a marca do Veículo: ");
		carro.setMarca(entrada.next());
		System.out.println("Digite o modelo do Veículo: ");
		carro.setModelo(entrada.next());
		
		System.out.println(carro.getCor());
		System.out.println(carro.getAno());
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
	}

}
