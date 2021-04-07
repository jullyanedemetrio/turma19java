package Lista3;

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int contador = 0;
		int total = 0;
		double media;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0) {
				total += numero;
				contador++;
			}
			
		} while (numero != 0);
		
		media = (double) total / (contador - 1);
		
		System.out.printf("Média dos números múltiplos de 3: %.2f", media);
		
		leia.close();
	}
}
