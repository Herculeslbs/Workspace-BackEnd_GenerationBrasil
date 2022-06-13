package br.com.generation.heranca;

public class Observatorio {

	public static void main(String[] args) {
		
		System.out.println("*** Observatorio de Animais ***");
		
		Cachorro cachorro1 = new Cachorro();
		System.out.println("Cachorro: ");
		cachorro1.setNome("Rex");
		cachorro1.setIdade(3);

		System.out.println("Nome: " + cachorro1.getNome());
		System.out.println("Idade: " + cachorro1.getIdade());
		
		cachorro1.emitirSom();
		cachorro1.correr();
		
		System.out.println();
		
		Cavalo cavalo1 = new Cavalo();
		System.out.println("Cavalo: ");
		cavalo1.setNome("Trovão");
		cavalo1.setIdade(7);

		System.out.println("Nome: " + cavalo1.getNome());
		System.out.println("Idade: " + cavalo1.getIdade());
		
		cavalo1.emitirSom();
		cavalo1.correr();
		
		System.out.println();
		
		Preguica preguica1 = new Preguica();
		System.out.println("Preguiça: ");
		preguica1.setNome("Dora");
		preguica1.setIdade(8);

		System.out.println("Nome: " + preguica1.getNome());
		System.out.println("Idade: " + preguica1.getIdade());
		
		preguica1.emitirSom();
		preguica1.subir();
		
	}

}
