package Exemplo;

import java.util.Scanner;

//4 pessoas - nome - vetor
// 4 nota [inteiro entre 1-10] - vetor
//nome - nota - ate 5 > ainda não/ acima de 5 > muito bem

public class DesafioVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = new String[4];
		int notas[] = new int [4];
		
		for (int i = 0; i < 4; i++) {
			System.out.printf("Digite o nome %d: ", i + 1);
			nomes[i] = leia.next();
			System.out.print("Digite a nota: ");
			notas[i] = leia.nextInt();			
		}
		
		for (int i = 0; i < 4; i++) {
			
			if (notas[i] <= 5) {
				System.out.printf("%nNome: %s | Nota: %d | Ainda não!%n", nomes[i], notas[i]);
			} else if (notas[i] > 5) {
				System.out.printf("%nNome: %s | Nota: %d | Muito bem!%n", nomes[i], notas[i]);
			}
		}
		
		leia.close();
	}
}
