programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Olá, digite um número inteiro e positivo ")
		leia(numero)

		se (numero == 0) {
			escreva("Zero é neutro")
		}

		senao se (numero < 0) {
			escreva("Número negativo! Não posso calcular :(")
		}

		senao se ((numero % 2) == 0){
			escreva("Esse número é par")
			
		}
		senao {
			escreva("Esse número é impar")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */