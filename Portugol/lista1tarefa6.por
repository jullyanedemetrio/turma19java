programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real x1, x2, y1, y2, p1, p2, d1, d2, dFinal
		escreva("Digite o valor x1: ")
		leia(x1)
		escreva("Digite o valor x2: ")
		leia(x2)
		escreva("Digite o valor y1: ")
		leia(y1)
		escreva("Digite o valor y2: ")
		leia(y2)

	     p1 = Matematica.potencia((x2 - x1), 2)
	     p2 = Matematica.potencia((y2 - y1), 2)
	     d1 = Matematica.raiz(p1, 2) 
	     d2 = + Matematica.raiz(p2, 2)
	     dFinal = d1 + d2 

		escreva(p1)
		escreva(d1)
	     escreva("O valor do calculo é: " + dFinal)
		

		
		
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