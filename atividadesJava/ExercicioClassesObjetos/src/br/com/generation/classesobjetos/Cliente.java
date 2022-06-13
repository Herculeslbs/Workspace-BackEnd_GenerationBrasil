package br.com.generation.classesobjetos;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Cliente {
	
	String nome;
	int idade;
	String email;
	String endereço;
	
	
	void comprarAvista() {
		System.out.println("Pagando avista tem desconto?");
	}
	
	void comprarParcela() {
		System.out.println("Parcela em quantas vezes?");
	}
}