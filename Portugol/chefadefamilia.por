programa
{
	
	funcao inicio()
	{
		//Programa auxílio emergencial

		cadeia nome 
		cadeia chefaFamilia = "verdadeiro"
		//logico chefaFamilia = verdadeiro
		//inteiro valorAuxilio

		escreva("Olá, qual seu nome? ")
		leia(nome)

		escreva("Você é chefa de família? Digite verdadeiro ou falso")
		leia(chefaFamilia)

		se(chefaFamilia == "verdadeiro"){
			escreva("Você receberá R$ 1200")			
			
			}
		senao se(chefaFamilia == "falso"){
			escreva("Você receberá R$ 600")
		}
		senao
		{
		escreva("Você não digitou verdadeiro ou falso")			
		}

				

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */