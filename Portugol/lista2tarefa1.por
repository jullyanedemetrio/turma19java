programa
{
	inclua biblioteca Matematica

	
	funcao inicio()
	{
		real pesoTomate
		real excessoTomate
		real valorMulta

		escreva("Digite o peso dos tomates: ")
		leia(pesoTomate)
		limpa()

		se (pesoTomate > 50) {
			excessoTomate = (pesoTomate - 50)
			valorMulta = (excessoTomate * 4)
			escreva("O peso dos tomates é maior que o estabelecido pelo regulamento \n") 
			escreva("Você deverá pagar uma multa de R$ " + Matematica.arredondar(valorMulta, 2) + "\n")
			escreva("Pois excedeu " + Matematica.arredondar(excessoTomate, 2) + " quilos")
		
		}
		senao 
		{
			escreva("Você não excedeu o peso estabelecido pelo regulamento \n")
			escreva("Valor da multa: R$ 0.00 \n")
			escreva("Excedente: 0.00")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 712; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */