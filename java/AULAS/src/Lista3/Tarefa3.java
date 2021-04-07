package Lista3;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		int contadorMenos21 = 0;
		int contadorMais50 = 0;
		
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		
		while (idade != -99) {
			
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			
			if (idade >= 0 && idade < 21) {
				contadorMenos21++;
			} else if (idade > 50) {
				contadorMais50++;
			}
		}
		
		System.out.printf("Total de pessoas com menos de 21 anos: %d%n", contadorMenos21);
		System.out.printf("Total de pessoas com mais de 50 anos: %d", contadorMais50);
		
		leia.close();
	}
}
