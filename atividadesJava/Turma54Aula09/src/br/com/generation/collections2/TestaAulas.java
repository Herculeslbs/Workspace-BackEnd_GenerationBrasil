package br.com.generation.collections2;

import java.util.ArrayList;

public class TestaAulas {

	public static void main(String[] args) {
		Aulas a1 = new Aulas("ArrayList", 60); 
		Aulas a2 = new Aulas("Lista Objetos", 90);
		Aulas a3 = new Aulas("Relacionamentos", 120);
		
		ArrayList<Aulas> listaAulas = new ArrayList<>();
		
		listaAulas.add(a1);
		listaAulas.add(a2);
		listaAulas.add(a3);
		
		System.out.println(listaAulas);
	}

}