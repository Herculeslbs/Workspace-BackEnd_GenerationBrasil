programa
{
	
	funcao inicio()
	{
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
			dias e mostre-a expressa apenas em dias.*/
			inteiro idade, meses, dias
			escreva("expresse sua idade em anos, meses e dias. ex:  40; 3; 15\n")
			escreva("Quantos anos você tem: ")
			leia(idade)
			escreva("Quantos meses você tem: ")
			leia(meses)
			escreva("Quantos dias: ")
			leia(dias)
			
			inteiro idadeEmDias

			idadeEmDias = (idade*365)+(meses*31)+dias

			escreva("Você tem " + idadeEmDias + " dias de vida.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 481; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */