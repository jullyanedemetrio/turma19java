programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		cadeia nome
		real tempCelsius, tempFahrenheit 

		escreva("Digite seu nome: ")
		leia(nome)
		limpa()
		escreva("Digite a temperatura em Celsius: ")
		leia(tempCelsius)
		limpa()

		tempFahrenheit = ((tempCelsius * 1.8) + 32)
		escreva("Oi, " + nome + ". A temperatura em Fahrenheit é " + Matematica.arredondar(tempFahrenheit, 2) + " °F")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = 17, 18, 7, 8, 10, 11, 12, 13, 14, 15;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */