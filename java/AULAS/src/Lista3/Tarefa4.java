package Lista3;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		final int LIMITE = 150;
		int idade;
		char sexo;     //1-Feminino 2-Masculino 3-Outros
		char opcoes;  //1-Calma 2-Nervosa 3-Agressiva
		char continua = 'S';
		int contador = 1;
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int pessoasNervosasmais40 = 0;
		int pessoasCalmasMenos18 = 0;
		
		
		while (continua == 'S' && contador <= LIMITE) {
			
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			System.out.print("Digite 1-Feminino 2-Masculino 3-Outros: ");
			sexo = leia.next().charAt(0);
			System.out.print("Digite a opção 1-Pessoa Calma 2-Pessoa Nervosa 3-Pessoa Agressiva: ");
			opcoes = leia.next().charAt(0);
			System.out.println();
			
			if (contador != LIMITE) {
				System.out.print("Você deseja fazer a pesquisa S-Sim ou N-Não? ");
				continua = leia.next().toUpperCase().charAt(0);
			}
			
			if (opcoes == '1' ) {
				pessoasCalmas++;
			}
			
			if (sexo == '1' && opcoes == '2') {
				mulheresNervosas++;
			}
			
			if (sexo == '2' && opcoes == '3') {
				homensAgressivos++;
			}
			
			if (sexo == '3' && opcoes == '1') {
				outrosCalmos++;
			}
			
			if (opcoes == '2' && idade >= 40) {
				pessoasNervosasmais40++;
			}
			
			if (opcoes == '1' && idade < 18) {
				pessoasCalmasMenos18++;
			}
						
			contador++;
			
		}
		
		System.out.println("Total de pessoas calmas: " + pessoasCalmas);
		System.out.println("Total de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Total de homens agressivos: " + homensAgressivos);
		System.out.println("Total de outros calmos: " + outrosCalmos);
		System.out.println("Total de pessoas nervosas com mais de 40 anos: " + pessoasNervosasmais40);
		System.out.println("Total de pessoas calmas com menos de 18 anos: " + pessoasCalmasMenos18);
		System.out.println("\nFim de programa");
		leia.close();
	}
}
