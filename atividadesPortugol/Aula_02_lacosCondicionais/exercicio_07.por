programa
{
	
	funcao inicio()
	{
		/*
		 * Receber valores de base e altura de um triângulo e verificar se são valores válidos
			(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
		 */

		 real base, altura, area
		 escreva("Informe o valor da base: ")
		 leia(base)
		 escreva("Informe a altura: ")
		 leia(altura)

		  se(base > 0 e altura > 0){
		  	//calcular area
		  	area = (base*altura)/2
		  	escreva("O valor da area é igual: "+area)
		  }senao {
		  	escreva("Os valores são inválidos!")
		  }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 540; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */