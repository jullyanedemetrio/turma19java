programa
{
	
	funcao inicio()
	{
		inteiro soma = 0

		para (inteiro x = 1; x <= 500; x++) {
			se (x % 3 == 0 e x % 2 != 0) {
				soma = soma + x
				//escreva(soma + "\n")
				
			}
		}
		escreva("O resultado da soma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500 é " + soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 158; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */