programa
{
	
	funcao inicio()
{
	/*
 		 * 	João, homem de bem, comprou um microcomputador para controlar o rendimento diário
			de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
			regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
			excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
			verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
			da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo zero 		 
 		 
 		 */
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
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 602; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */