package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aula1 = "Bloco I - Java";
		String aula2 = "Bloco II - Springboot";
		String aula3 = "Bloco III - FrontEnd";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		/*System.out.println(aulas);
		aulas.remove(0);
		System.out.println(aulas);*/
		
		for(String i: aulas) {
			System.out.println("Aulas: "+ i);
		}
		
		String terceiraAula = aulas.get(1);
		System.out.println(terceiraAula);
		System.out.println(aulas.get(2));
		aulas.set(0, "Aula do Jeff e da Jacque");
		System.out.println(aulas.get(0));
		
		for(int i=0 ; i < aulas.size(); i++){
			System.out.println("Tamanho da collection "+ i + aulas.get(i));
		}
		
		System.out.println("O tamanho da lista é de "+ aulas.size() + " posições");
		
		Collections.sort(aulas);
		System.out.println(aulas);
		Collections.shuffle(aulas);
		System.out.println(aulas);
	}

}