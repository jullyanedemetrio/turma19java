programa
{
	
	funcao inicio()
	{
		cadeia codigo
		real horasTrabalhadas, salarioParcial, salarioExcedente, salarioTotal

		escreva("Digite o código de identificação: ")
		leia(codigo)
		limpa()
		escreva("Digite o número de horas trabalhadas: ")
		leia(horasTrabalhadas)
		limpa()

		se (horasTrabalhadas > 0 e horasTrabalhadas <=50){
			salarioParcial = (horasTrabalhadas * 10)
			escreva("O operário " + codigo + " receberá um salário total de R$ " + salarioParcial)
		}
		senao se (horasTrabalhadas > 50) {
			salarioExcedente = ((horasTrabalhadas - 50) * 20)
			salarioTotal = (salarioExcedente + 500)
			escreva("O operário " + codigo + " receberá um salário excedente de R$ " + salarioExcedente + "\n")
			escreva("Totalizando um salário de R$ " + salarioTotal)
		}
		senao {
			escreva("O operário " + codigo + " não possui horas trabalhadas")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 856; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */