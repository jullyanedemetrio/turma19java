package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class ExemploPara {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		final int HABITANTES = 3;
		double salario = 0.00;
		double numeroFilhos = 0;
		double mediaSalario = 0.00;
		double totalSalario = 0.00;
		double mediaFilhos = 0.00;
		double totalFilhos = 0.00;
		double maiorSalario = 0.00;
		double percentualPessoasSalarioAte100 = 0.00;
		double contadorPessoasSalario100 = 0;

		for (int x = 1; x <= HABITANTES; x++) {
			System.out.printf("Informe o sal�rio do habitante %d R$ :", x);
			salario = leia.nextDouble();
			System.out.print("Informe a qtde de filhos: ");
			numeroFilhos = leia.nextDouble();
			System.out.println();
			totalSalario += salario; //totalSalario = totalSalario + salario;
			totalFilhos  += numeroFilhos;
			
			if (maiorSalario < salario) {
				maiorSalario = salario;
			}
			
			if (salario <= 100) {
				contadorPessoasSalario100++;
			}
			
		}
		
		mediaSalario = totalSalario / HABITANTES;
		mediaFilhos = totalFilhos / HABITANTES;
		percentualPessoasSalarioAte100 = (contadorPessoasSalario100 / HABITANTES) * 100;
		
		System.out.printf("\nTotal dos sal�rios: R$ %.2f", totalSalario);
		System.out.printf("\nM�dia sal�rios: R$ %.2f", mediaSalario);
		System.out.printf("\nPercentual de pessoas com sal�rio at� R$ 100: %.2f %%", percentualPessoasSalarioAte100);
		System.out.printf("\nValor do maior sal�rio: R$ %.2f", maiorSalario);
		System.out.printf("\nTotal de filhos: %.0f", totalFilhos);
		System.out.printf("\nM�dia de filhos: %.2f", mediaFilhos);

		leia.close();
	}
}
