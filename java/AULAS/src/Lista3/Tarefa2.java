package Lista3;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int contadorPar = 0;
		int contadorImpar = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0 && numero > 0) {
				contadorPar++;
			} else if (numero % 2 != 0 && numero > 0) {
				contadorImpar++;
			} else {
				System.out.println("N�mero inv�lido\n");
			}
		}
		
		System.out.printf("%nTotal de n�meros pares: %d%n", contadorPar);
		System.out.printf("Total de n�meros �mpares: %d", contadorImpar);
		
		leia.close();
	}
}
