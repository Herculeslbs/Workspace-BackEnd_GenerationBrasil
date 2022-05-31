programa
{
	
inclua biblioteca Matematica --> mat
	funcao inicio()
	{
       /*
        * 6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
        * P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
        */
        real x1, y1, x2, y2, x, y, distancia
	   escreva("valor do x1: ")
	   leia(x1)
	   escreva("valor do y1: ")
	   leia(y1)
	   escreva("valor do x2: ")
	   leia(x2)
	   escreva("valor do y2: ")
	   leia(y2)
	   x = mat.potencia((x1-x2), 2.0)
	   y = mat.potencia((y2-y1), 2.0)
	   distancia = mat.raiz((x+y), 2.0)
	   escreva(distancia)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 645; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */