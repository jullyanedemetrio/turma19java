programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		real n1, n2, n3, n4, quadradoN1, quadradoN2, quadradoN3, quadradoN4

		escreva("Digite o primeiro número: ")
		leia(n1)
		limpa()
		escreva("Digite o segundo número: ")
		leia(n2)
		limpa()
		escreva("Digite o terceiro número: ")
		leia(n3)
		limpa()
		escreva("Digite o quarto número: ")
		leia(n4)
		limpa()

		quadradoN1 = Mat.potencia(n1,2)
		quadradoN2 = Mat.potencia(n2,2)
		quadradoN3 = Mat.potencia(n3,2)
		quadradoN4 = Mat.potencia(n4,2)

		se (quadradoN3 >= 1000) {
			escreva("O resultado do quadrado do terceiro número é " + quadradoN3)
		}
		senao 
		{
			escreva("O valor do primeiro número é " + n1 + " e o resultado do seu quadrado é " + quadradoN1 + "\n")
			escreva("O valor do segundo número é " + n2 + " e o resultado do seu quadrado é " + quadradoN2 + "\n")
			escreva("O valor do terceiro número é " + n3 + " e o resultado do seu quadrado é " + quadradoN3 + "\n")
			escreva("O valor do quarto número é " + n4 + " e o resultado do seu quadrado é " + quadradoN4 + "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 519; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */