package br.com.generation.collections;
/*
 * Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	programa deverá atender as seguintes funcionalidades:
	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.
 */
public class Estoque {
	private String nome;
	private double preco;
	private int quantidade;
	private double peso;
	
	public Estoque(String nome, double preco, int quantidade, double peso) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.nome = nome;
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " | Preco: " + preco + " | Quantidade: " + quantidade + " | Peso: " + peso + " |";
	}
	
	
	
	
}