programa
{
	
	funcao inicio()
	{
	
		/*
		 * 	Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
			horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
			por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
			armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
			trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
			excedente.
		 */
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
 * @POSICAO-CURSOR = 503; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */