package br.com.generation.classesobjetos;

/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Aviao {
	
	String modelo;
	int ano;
	String empresa;
		
		void aviaoDecolando(Aviao aviao1) {
		System.out.println("O avião modelo: " + aviao1.modelo + " Ano: " + aviao1.ano + " Empresa: " + aviao1.empresa + " Está decolando.");
	}
	
		void aviaoPousando(Aviao aviao2) {
		System.out.println("O avião modelo: " + aviao2.modelo + " Ano: " + aviao2.ano + " Empresa: " + aviao2.empresa + " Está pousando.");
	}

}