package Exemplo;

import java.util.Scanner;

public class AuxilioEmergencial {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		char recebeuAuxilio;
		char recebeuBolsaFamilia;
		int numeroFilhos;
		char chefaFamilia;
		
		System.out.println("Recebeu auxílio: ");
		recebeuAuxilio = leia.nextLine().charAt(0);
		System.out.println("Recebeu Bolsa Família: ");
		recebeuBolsaFamilia = leia.nextLine().charAt(0);

		
		if (recebeuAuxilio == 'n' || recebeuBolsaFamilia == 's') {
			System.out.println("Você não pode receber");
		} else if (recebeuAuxilio == 's' && recebeuBolsaFamilia == 'n') {
			System.out.println("Chefa de família?: ");
			chefaFamilia = leia.nextLine().charAt(0);
			System.out.println("Quantos filhos?: ");
			numeroFilhos = leia.nextInt();
			if (chefaFamilia == 's' ) {
				double valorFinal = 600 + (50 * numeroFilhos);
				System.out.println("Valor: " + valorFinal);
			} else {
				double valorFinal = 300 + (50 * numeroFilhos);
				System.out.println("Valor: " + valorFinal);
			}
			
		}
		leia.close();
	}

}
