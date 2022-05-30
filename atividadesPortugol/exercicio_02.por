programa
{
	
	funcao inicio(){
	
		real pesoLimite, multaValor, P, E, M

		escreva("Exercício 01\n")
		
		pesoLimite = 50.00
		multaValor = 4.00

		escreva("Digite o peso do Tomate: ")
		leia(P)
	
	se (P >= 50.00){
		E = P - pesoLimite 
		M = E * multaValor
		escreva("Peso total: " + P + "KG, Peso excedido: " + E + "KG, Valor da multa: R$" + M + "\n")
	}
	senao se (P <= 50.00){
		escreva("Peso total: " + P + "KG, Peso excedido: 'Zero' Valor da multa: 'Zero'\n")
	}

	real C, N, Ex, pgtFixo, pgtExtra, Hx, resultado, H

		escreva("\nExercício 02\n")

		pgtFixo = 500.00
		pgtExtra = 20.00
		H = 50.00
		
		escreva("Digite o Código '0' - Horas Extras:")
		leia(C)

		escreva("Digite a quantidade de Horas trabalhadas:")
		leia(N)

		se (N > 50.00){
		 	Ex = N - H
		 	Hx = pgtExtra * Ex
		 	resultado = pgtFixo + Hx
		 	escreva("Salário total: R$" + resultado + " Horas Extras: R$" + Hx)
		}
		senao se (N <= 50.00){
			escreva("Salário total: R$" + pgtFixo + " Horas Extras: R$ 'Zero'")
		}
		
   }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 962; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */