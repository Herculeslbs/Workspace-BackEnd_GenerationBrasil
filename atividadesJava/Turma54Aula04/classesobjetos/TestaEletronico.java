package br.com.generation.classesobjetos;

import java.util.Scanner;

import br.com.generation.classesobjetos.Eletronico;

public class TestaEletronico {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Eletronico eletronico1 = new Eletronico();
		Eletronico eletronico2 = new Eletronico();
		
		System.out.println("Digite o Tipo de Eletronico 01: ");
		eletronico1.setTipo(entrada.next());
		System.out.println("Digite o ano do Eletronico 01: ");
		eletronico1.setAno(entrada.nextInt());
		System.out.println("Digite a marca do Eletronico 01: ");
		eletronico1.setMarca(entrada.next());
		
		System.out.println();
		
		System.out.println("Digite o Tipo de Eletronico 02: ");
		eletronico2.setTipo(entrada.next());
		System.out.println("Digite o ano do Eletronico 02: ");
		eletronico2.setAno(entrada.nextInt());
		System.out.println("Digite a marca do Eletronico 02: ");
		eletronico2.setMarca(entrada.next());
		
		System.out.println();
		
		System.out.println("Informações do Eletronico 01");
		System.out.println(eletronico1.getTipo());
		System.out.println(eletronico1.getAno());
		System.out.println(eletronico1.getMarca());
		
		System.out.println();
		
		System.out.println("Informações do Eletronico 02");
		System.out.println(eletronico2.getTipo());
		System.out.println(eletronico2.getAno());
		System.out.println(eletronico2.getMarca());
	
	}

}
