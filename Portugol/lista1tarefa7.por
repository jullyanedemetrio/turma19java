programa
{
	
	funcao inicio()
	{
		real a, b, c, d, ee, f, x, y

		escreva("Digite o coeficiente a: ")
		leia(a)
		escreva("Digite o coeficiente b: ")
		leia(b)
		escreva("Digite o coeficiente c: ")
		leia(c)
		escreva("Digite o coeficiente d: ")
		leia(d)
		escreva("Digite o coeficiente e: ")
		leia(ee)
		escreva("Digite o coeficiente f: ")
		leia(f)

		x = ((c*ee - b*f) / (a*ee - b*d))
		y = ((a*f - c*a) / (a*ee - b*d))

		escreva("O valor de x é " + x)
		escreva("O valor de y é " + y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */