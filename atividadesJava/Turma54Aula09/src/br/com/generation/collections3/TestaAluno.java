package br.com.generation.collections3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		
		System.out.printf("Insira a quantidade de alunos que deseja cadastrar: ");
		int quantidadeAlunos = in.nextInt();
		System.out.println("Você escolheu cadastar "+ quantidadeAlunos +" alunos");
		for(int i=0; i < quantidadeAlunos; i++) {
			System.out.println("Idade do Aluno: ");
			int idade = in.nextInt();
			in.nextLine();
			
			System.out.println("Digite o nome do Aluno: ");
			String nome = in.nextLine();
			
			listaAlunos.add(new Aluno(idade, nome));
		}
		
		System.out.println(listaAlunos);
		for(Aluno i: listaAlunos) {
			System.out.println(i);
		}
		in.close();
	}

}