package br.com.generation.interface3;

public class ImprimeAnimal {

	public static void main(String[] args) {
		TestaAnimal t = new TestaAnimal();
		
		t.fazerAnimalComer(new Tigre("Tigr�o"));
		t.fazerAnimalComer(new Cavalo());
	}

}
