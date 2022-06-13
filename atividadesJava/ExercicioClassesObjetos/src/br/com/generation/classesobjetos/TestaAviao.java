package br.com.generation.classesobjetos;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		
		
		aviao1.modelo = "AirBuss-0101";
		aviao1.ano = 2005;
		aviao1.empresa = "Azul airlines";
		
		aviao2.modelo = "AirBuss-0202";
		aviao2.ano = 2002;
		aviao2.empresa = "Gol airlines";
		
		aviao1.aviaoDecolando(aviao1);
		aviao2.aviaoPousando(aviao2);

	}

}