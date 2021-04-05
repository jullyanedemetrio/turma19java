package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class Fala300 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		String nome;
		char situacaoEmergencial;
		System.out.print("Digite seu nome:");
		//leia.nextLine();
		nome = leia.nextLine().toUpperCase();
		System.out.println("Vc recebeu emergencial antes 1 - SIM ou 2 - NÃO:");
		situacaoEmergencial = leia.next().toUpperCase().charAt(0);
		
		if (situacaoEmergencial == 'S') {
			System.out.println("Você recebeu algum auxilio extra como Bolsa familia S-sim ou N-nao ");
			situacaoEmergencial = leia.next().toUpperCase().charAt(0);
			if (situacaoEmergencial == 'S') {
				System.out.println("Infelizmente vc não pode rceber emergencial!!!");
			} else if (situacaoEmergencial == 'N') {
				System.out.println("Vc é chefa de familia: ");
				situacaoEmergencial = leia.next().toUpperCase().charAt(0);
				if (situacaoEmergencial == 'S') {
					System.out.println("Vc vai receber R$ 600,00 de auxilio!!!");
				}
			}
		System.out.println("Você vai receber 300");	
			
		} else if (situacaoEmergencial == 'N') {
			System.out.println("Vc não tem direito ao beneficio!!!");
		} else {
			System.out.printf("%s Vc não escolheu nem S nem N, tchau!!!%n", nome);
		}
		
		System.out.println("fim de programa!!!");
		leia.close();
	}
}
