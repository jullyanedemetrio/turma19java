programa
{
	
	funcao inicio()
	{
		inteiro ano, mes, dia, idadeEmDias
		
		escreva("Olá, vamos descobri há quantos dias você está na Terra? Por favor, digite apenas números inteiros!\n") 
		escreva("Quantos anos você tem? ")
		leia(ano)
		escreva("Quantos meses? ")
		leia(mes)
		escreva("Quantos dias? ")
		leia(dia)

		idadeEmDias = ((ano * 365) + (mes * 30) + dia)

		escreva("Você está na terra há " + idadeEmDias + " dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */