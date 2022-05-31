programa
{
	
	funcao inicio()
	{
		/*
		 * 7. Um sistema de equações lineares
 			Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
		 */

		 real a, b, c, d, ee, f, x, y, provax, provay

		 escreva("informe o valor de A: ")
		 leia(a)
		 escreva("informe o valor de B: ")
		 leia(b)
		 escreva("informe o valor de C: ")
		 leia(c)
		 escreva("informe o valor de D: ")
		 leia(d)
		 escreva("informe o valor de E: ")
		 leia(ee)
		 escreva("informe o valor de F: ")
		 leia(f)

		 x = ((c*ee)-(b*f)) / ((a*ee)-(b*d))
		 y = ((a*f)-(c*d)) / ((a*ee)-(b*d))

		 escreva("O valor de x é: " + x +"\n")
		 escreva("O valor de y é: " + y)

		 provax = (a*x)+(b*y)
		 provay = (d*x)+(ee*y)
		 escreva("\n"+provax+" "+provay+" "+c+" "+f)
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 783; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */