programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		cadeia nome
		real tempCelsius, tempFahrenheit 

		escreva("Digite seu nome: ")
		leia(nome)
		limpa()
		escreva("Digite a temperatura em Fahrenheit: ")
		leia(tempFahrenheit)
		limpa()

		tempCelsius = Mat.arredondar((tempFahrenheit - 32) * 5/9, 2)
		escreva("Oi, " + nome + ". A temperatura em Celsius é " + tempCelsius + " °C")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */