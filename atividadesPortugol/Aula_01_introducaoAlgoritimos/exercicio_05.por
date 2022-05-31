programa
{
	
	funcao inicio()
	{
		/*
		 * 5 - Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		 */

		 inteiro n1, n2, n3
		 real media

		 escreva("nota 1 do aluno: ")
		 leia(n1)
		 
		 escreva("nota 2 do aluno: ")
		 leia(n2)
		 
		 escreva("nota 3 do aluno: ")
		 leia(n3)

		 media = ((n1*2) + (n2*3) + (n3*5)) / 9

		 escreva("A média do aluno foi: "+ media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 502; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */