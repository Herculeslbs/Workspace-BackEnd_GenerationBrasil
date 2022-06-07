package br.com.generation.lacodecisao;

import javax.swing.JOptionPane;

public class LacoDecisao03 {

				// 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
				//categoria ela se encontra: 10-14 infantil / 15-17 juvenil / 18-25 adulto
	public static void main(String[] args) {
		
			
int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		
		if(idade >= 10 && idade <= 14) {
			JOptionPane.showMessageDialog(null, "Sua idade é compativel com a categoria 'Infantil'.");
		}
		else if(idade <= 9) {
			JOptionPane.showMessageDialog(null, "Sua idade é incompativel a qualquer categoria");
		}
		if(idade >= 15 && idade <= 17) {
			JOptionPane.showMessageDialog(null, "Sua idade é compativel com a categoria 'Juvenil'.");
		}
		if(idade >= 18 && idade <= 25) {
			JOptionPane.showMessageDialog(null, "Sua idade é compativel com a categoria 'Adulto'.");
		}
		else if(idade > 25) {
			JOptionPane.showMessageDialog(null, "Sua idade é incompativel a qualquer categoria");
		}
		

	}

}
