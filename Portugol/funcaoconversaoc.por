programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		
	real tempF
	//real temperaturaC 
	cadeia nome
	
	

	escreva("digite seu nome ")
	leia (nome)
	escreva("digite a temperatura em Fahrenheint ")
	leia (tempF)

	conversaoC(tempF)
	escreva(" A temperatura em celsius é " + Matematica.arredondar(conversaoC(tempF), 2))

	//escreva("Olá ",nome," a temperatura em Fahrenheit é de ",(temperaturaC))
	
	}

	funcao real conversaoC (real tempF){
		real temperaturaC =  (tempF - 32) * 5/9

		retorne temperaturaC
	}
	

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */