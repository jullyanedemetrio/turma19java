//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
//apresente no final o total do somatório, a média e o total de valores lidos. O programa
//deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
//positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
//negativo.
programa
{
	
	funcao inicio()
	{

		//variáveis
		real valor = 0.00
		real totalSomatorio = 0.00
		real media = 0.00
		real totalValorLido = 0.00

		//processamento
		escreva("Este programa faz a leitura dos valores enquanto positivos. O zero é um número neutro, portanto, não é contabilizado. \n")

		enquanto(valor >= 0)
		{
			escreva("Digite um valor: ")
			leia(valor)
			limpa()
			se (valor > 0) {
			totalValorLido = totalValorLido + 1 
			totalSomatorio = totalSomatorio + valor
			media = totalSomatorio / totalValorLido
			
			}	

			
		}

		//saida
		escreva("Soma dos valores lidos: " + totalSomatorio  + "\n")
		escreva("Média dos valores lidos: " + media + "\n")
		escreva("Total de valores lidos: " + totalValorLido + "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 331; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */