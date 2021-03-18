programa
{
	
	funcao inicio()
	{
		cadeia nome
		real salarioBruto
		real salarioLiquido
		real salarioLiquido2
		real imposto1 
		real imposto2 
		cadeia genero 

		escreva("Olá, Digite seu nome: \n")
		leia(nome)
		
		escreva("Como você gostaria de ser tratado? 1 - Senhor, 2 - Senhora ou 3 -Senhore \n")
		leia(genero)
		
		escreva("Digite o seu salário bruto: ")
		leia(salarioBruto)

		se (genero =="1") {
		
			se(salarioBruto <= 1200) 
			{
				escreva("Sr " + nome + " você está isento do imposto de renda, seu salário será " + salarioBruto)
				
			} senao  se (salarioBruto > 1200 e salarioBruto<=2500){
				imposto1 = (salarioBruto * 0.12
				)
				salarioLiquido = (salarioBruto - imposto )
				escreva("Sr. + nome + " você vai pagar 12% de IR R$ + 
				
				
			}
		}
		senao se (genero =="2"){
			
		} 
		senao se (genero =="3") {
			
		}
		senao {
			escreva("Sem genero não vira")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 659; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */