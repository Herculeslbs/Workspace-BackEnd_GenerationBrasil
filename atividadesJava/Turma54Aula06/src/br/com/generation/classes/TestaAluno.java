package br.com.generation.classes;

public class TestaAluno {

	public static void main(String[] args) {
		
		//Estanciando um objeto... --> Criar um objeto
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		
		aluno1.nome = "Felipe Camilo";
		aluno1.idade = 22;
		aluno1.curso = "Java Bloco I";
		
		
		System.out.println(aluno1.nome);
		System.out.println(aluno1.idade);
		System.out.println(aluno1.curso);
		
		aluno1.assistirAula();
		aluno1.estudar();
		
		aluno2.nome = "Leo";
		aluno2.idade = 23;
		aluno2.curso = "SpringBoot Bloco II";
		
		System.out.println(aluno2.nome);
		System.out.println(aluno2.idade);
		System.out.println(aluno2.curso);
		
		aluno2.assistirAula();
		aluno2.estudar();
		

	}

}
