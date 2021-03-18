programa
{
	
	funcao inicio()
	{
		cadeia nome
		cadeia valor 

		escreva("Olá, digite o seu nome: ")
		leia(nome)
		escreva("Se você é chefa da família, digite 1, se não 2")
		leia(valor)

		se (valor == "1") {
			escreva("Auxílio de 1200")
		}
		senao se(valor == "2") {
			escreva("Auxílio de 600")
		}
		senao 
		{
			escreva("Você não digitou 1 ou 2")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */