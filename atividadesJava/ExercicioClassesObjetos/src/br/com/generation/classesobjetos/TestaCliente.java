package br.com.generation.classesobjetos;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		
		cliente1.nome = "Jo�o Silva";
		cliente1.idade = 22;
		cliente1.email = "cliente1@.com";
		cliente1.endereco = "Rua 1";
		
		System.out.println("Cliente 01: ");
		System.out.println(cliente1.nome);
		System.out.println(cliente1.idade);
		System.out.println(cliente1.email);
		System.out.println(cliente1.endereco);
		
		System.out.println("\nPergunta: ");
		cliente1.comprarAvista();
		
		
		cliente2.nome = "Pedro Silva";
		cliente2.idade = 22;
		cliente2.email = "cliente2@.com";
		cliente2.endereco = "Rua 2";
		
		System.out.println("\nCliente 01: ");
		System.out.println(cliente2.nome);
		System.out.println(cliente2.idade);
		System.out.println(cliente2.email);
		System.out.println(cliente2.endereco);
		
		System.out.println("\nPergunta: ");
		cliente2.comprarParcela();
		
	}

}