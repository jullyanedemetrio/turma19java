programa
{
	
	funcao inicio()
	{
		inteiro idade 

		escreva("Digite a sua idade: ")
		leia(idade)
		limpa()

		se (idade >= 5 e idade <= 7) {
			escreva("Você tem " + idade + " anos, portanto, sua classificação é Infantil A")
		}
		senao se (idade >= 8 e idade <= 11) {
			escreva("Você tem " + idade + " anos, portanto, sua classificação é Infantil B")
		}
		senao se (idade >= 12 e idade <= 13) {
			escreva("Você tem " + idade + " anos, portanto, sua classificação é Juvenil A")
		}
		senao se (idade >= 14 e idade <= 17) {
			escreva("Você tem " + idade + " anos, portanto, sua classificação é Juvenil B")
		}
		senao se (idade >= 18) {
			escreva("Você tem " + idade + " anos, portanto, sua classificação é Adultos")
		}
		senao {
			escreva("Você não pode ser classificado")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 89; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */