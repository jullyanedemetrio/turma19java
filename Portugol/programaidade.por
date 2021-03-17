programa
{
	
	funcao inicio()
	{

		cadeia nome 
		inteiro anoNascimento, anoAtual, idade
		// const inteiro ANOATUAL = 1990
	

		escreva("Qual é o seu nome? ")
		leia (nome)
		limpa()
		escreva("Qual é o seu ano de nascimento? ")
		leia (anoNascimento)
		limpa()
		escreva("Em qual ano estamos?")
		leia (anoAtual)
		limpa()

		idade = (anoAtual - anoNascimento)
		escreva("Oi " + nome + ", sua idade é aproximadamente " + idade + " anos") 
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 129; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */