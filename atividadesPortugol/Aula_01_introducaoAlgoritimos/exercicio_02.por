programa
{
	
	funcao inicio()
	{
		/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
			expressa em anos, meses e dias.*/

			inteiro dias, meses, anos, dia
			escreva("informe quantos dias de idade você tem: ")
			leia(dias)
			anos = dias/365
			meses = (dias%365)/30
			dia = (dias%365)%30
			escreva("Você tem " +anos+" ano(s) "+ meses + " mes(es)" + " e " +dia+ " dia(s) de vida")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 420; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */