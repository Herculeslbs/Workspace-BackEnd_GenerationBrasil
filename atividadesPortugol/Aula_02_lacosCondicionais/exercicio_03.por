programa
{
	
	funcao inicio()
	{
		/*
		 * 3) Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */

		 inteiro n1, n2, n3, n4, contador
		 escreva("Informe o primeiro numero: ")
		 leia(n1)
		 escreva("Informe o segundo numero: ")
		 leia(n2)
		 escreva("Informe o terceiro numero: ")
		 leia(n3)
		 escreva("Informe o quarto numero: ")
		 leia(n4)
		 n1 = n1*n1
		 n2 = n2*n2
		 n3 = n3*n3
		 n4 = n4*n4
		 se (n3 >=1000){
		 	escreva(n3)
		 }senao {
		 	escreva(n1+"\n"+n2+"\n"+n3+"\n"+n4)
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 715; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */