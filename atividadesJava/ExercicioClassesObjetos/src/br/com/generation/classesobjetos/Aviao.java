package br.com.generation.classesobjetos;

/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class Aviao {
	
	String modelo;
	int ano;
	String empresa;
		
		void aviaoDecolando(Aviao aviao1) {
		System.out.println("O avi�o modelo: " + aviao1.modelo + " Ano: " + aviao1.ano + " Empresa: " + aviao1.empresa + " Est� decolando.");
	}
	
		void aviaoPousando(Aviao aviao2) {
		System.out.println("O avi�o modelo: " + aviao2.modelo + " Ano: " + aviao2.ano + " Empresa: " + aviao2.empresa + " Est� pousando.");
	}

}