package br.com.generation.heranca;

import java.util.Scanner;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Professor prof1 = new Professor();//Construtor de classse; ele abre um espaço em memoria para poder manipular este objeto
		
		System.out.println("Digite o nome do Professor: " );
		prof1.setNome(entrada.next());
		prof1.setIdade(25);
		prof1.setEndereco("Rua das Nações, 255 - SP");
		prof1.setSalario(10000.00);
		prof1.setDisciplina("Geografia");
		
		System.out.println(prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getEndereco());
		System.out.println(prof1.getSalario());
		System.out.println(prof1.getDisciplina());
		System.out.println();
		
	
		Aluno aluno1 = new Aluno();
		
		System.out.println("Digite o nome do Aluno: " );
		aluno1.setNome(entrada.next());
		aluno1.setIdade(22);
		aluno1.setEndereco("Rua Dos Alunos, 900");
		aluno1.setSemestre("6° Semestre");
		aluno1.setCurso("Analise de Sistema");
				
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getIdade());
		System.out.println(aluno1.getEndereco());
		System.out.println(aluno1.getSemestre());
		System.out.println(aluno1.getCurso());
		System.out.println();
		
				
		FuncAdm func1 = new FuncAdm();
		
		System.out.println("Digite o nome do Funcionario: " );
		func1.setNome(entrada.next());
		func1.setIdade(30);
		func1.setEndereco("Rua Dos Trabalhadores, 500");
		func1.setSetor("Contabilidade");
		func1.setFuncao("Contador");
		func1.setSalario(11000.00);
				
		System.out.println(func1.getNome());
		System.out.println(func1.getIdade());
		System.out.println(func1.getEndereco());
		System.out.println(func1.getSetor());
		System.out.println(func1.getFuncao());
		System.out.println(func1.getSalario());
	}

}
