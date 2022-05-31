programa
{
	
	funcao inicio()
	{
		/*
		 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
			  	 número é par ou ímpar, e se é positivo ou negativo.
		 */

		 inteiro numero

		 escreva("Informe um numero inteiro: ")
		 leia(numero)

		 se(numero > 0){
		 	escreva("Esse número é positivo\n")
		 }senao {
		 	escreva("Esse número é negativo\n")
		 }

		 se(numero%2 == 0){
		 	escreva("Esse número é par")
		 }senao{
		 	escreva("Esse número é impar")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */