package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {
	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		ArrayList<Estoque> estoqueProdutos = new ArrayList<>();
		System.out.println("=================================================");
		System.out.println("=              GESTAO DE ESTOQUE                =");
		System.out.println("=================================================");
		int option = 1;
		do {
		System.out.println("=              ESCOLHA UMA OPÇÃO                =");
		System.out.println("1 - ADICIONAR | 2 - REMOVER | 3 - ATUALIZAR | 4 - ESTOQUE");
		int opcao = in.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("=================================================");
				System.out.println("=              ADCIONAR PRODUTO                 =");
				System.out.println("=================================================");
				int i = 1;
				do {
					System.out.printf("\nNOME DO PRODUTO: ");
					in.nextLine();
					String nome = in.nextLine();
					System.out.printf("PREÇO DO PRODUTO: ");
					double preco = in.nextDouble();
					System.out.printf("QUANTIDADE DO PRODUTO: ");
					int quantidade = in.nextInt();
					System.out.printf("PESO DO PRODUTO: ");
					double peso = in.nextDouble();
					System.out.println("=================================================");
					System.out.println("CONTINUAR ADICIONANDO PRODUTOS? \n1 - SIM | 2 - NÃO");
					System.out.println("=================================================");
					estoqueProdutos.add(new Estoque(nome, preco, quantidade, peso));
					i = in.nextInt();
					
				}while(i == 1);
				break;
			case 2:
				System.out.println("=================================================");
				System.out.println("=              REMOVER PRODUTO                  =");
				System.out.println("=================================================");
				System.out.println("DIGITE:\n1 - REMOVER TODOS PRODUTOS\n2 - LISTA DE PRODUTOS");
				i = in.nextInt();
				if( i == 1) {
					for(int c =0; c <= estoqueProdutos.size(); c++) {
						System.out.println("=================================================");
						System.out.println(estoqueProdutos.get(c));
						System.out.println("REMOVIDO COM SUCESSO");
						System.out.println("=================================================");
						estoqueProdutos.remove(c);
						Thread.sleep(500);
					}
				}else if ( i == 2) {
					System.out.println("=================================================");
					System.out.println("LISTA DE PRODUTOS");
					for(int c=0; c < estoqueProdutos.size(); c++) {
						System.out.println(estoqueProdutos.get(c).getNome() + " | ID: " + c);
					}
					System.out.println("=================================================");
					System.out.println("INSIRA O ID DO PRODUTO QUE DESEJA DELETAR:");
					int del = in.nextInt();
					estoqueProdutos.remove(del);
					Thread.sleep(500);
					System.out.println("=================================================");
					System.out.println("PRODUTO REMOVIDO COM SUCESSO!");
					System.out.println("=================================================");
				}else {
					System.out.println("OPÇÃO INVÁLIDA");
				}
					break;
			case 3:
				System.out.println("=================================================");
				System.out.println("=              ATUALIZAR PRODUTO                =");
				System.out.println("=================================================");
				System.out.println("=              LISTA DE PRODUTOS                =");
				System.out.println("=================================================");
		
					for(int c=0; c < estoqueProdutos.size(); c++) {
						System.out.println(estoqueProdutos.get(c).getNome() + " | ID: " + c);
					}
					System.out.println("=================================================");
					System.out.println("INSIRA O ID DO PRODUTO QUE DESEJA ATUALIZAR:");
					int id = in.nextInt();
					System.out.println("=================================================");
					System.out.printf("NOVO NOME DO PRODUTO: ");
					in.nextLine();
					String nome = in.nextLine();
					System.out.printf("NOVO PREÇO DO PRODUTO: ");
					double preco = in.nextDouble();
					in.nextLine();
					System.out.printf("NOVA QUANTIDADE DO PRODUTO: ");
					int quantidade = in.nextInt();
					in.nextLine();
					System.out.printf("NOVO PESO DO PRODUTO: ");
					double peso = in.nextDouble();
					in.nextLine();
					System.out.println("=================================================");
					estoqueProdutos.set(id, new Estoque(nome, preco, quantidade, peso));
					Thread.sleep(500);
					System.out.println("\nPRODUTO ALTERADO COM SUCESSO!");
					break;
			case 4:
				System.out.println("=================================================");
				System.out.println("=                 VER ESTOQUE                   =");
				System.out.println("=================================================");
				for(Estoque j: estoqueProdutos) {
					System.out.println(j);
					Thread.sleep(600);
				}
				System.out.println("=================================================");
				break;
		}
		System.out.println("=================================================");
		System.out.println("\nDIGITE: 0 - PARA SAIR | 1 - PARA INICIO");
		option = in.nextInt();
		in.nextLine();
		
		}while(option != 0);
		
		in.close();

	}	

}