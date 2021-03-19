//Faça um programa que mostre uma contagem na tela de 233 a 456, só que
//contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.

programa
{
	
	funcao inicio()
	{
		inteiro i = 233

		faca
		{
			se( i >= 300 e i <= 400) 
			{
				i= i + 3
				
			}
			senao 
			{
				i= i + 5
			
			}
			
			escreva(i + "\n")
			
		} enquanto (i <= 456)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */