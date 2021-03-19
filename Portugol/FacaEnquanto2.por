// Faça um programa que pegue um número do teclado e calcule a soma de todos os
// números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
// 1+2+3+4+5+6+7=28.

programa 
{

	funcao inicio()
	{

		//variáveis 
		inteiro numero
		inteiro soma = 0
		inteiro contador = 0

		//entrada
		escreva("Digite um número inteiro: ")
		leia(numero)
		limpa()
		
		//processamento
		faca
		{
			soma = soma + contador
			contador++
			
		} enquanto (contador <= numero)

		//saída		
		escreva("O resultado da soma de todos os números de 1 até " + numero + " é " + soma)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */