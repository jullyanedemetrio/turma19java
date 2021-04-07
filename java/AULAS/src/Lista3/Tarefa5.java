package Lista3;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double numero; 
		double soma = 0;
		
		do {
			
			System.out.print("Digite um número: ");
			numero = leia.nextDouble();
			soma += numero;
			
		} while (numero != 0);
		
		System.out.printf("Valor da soma: %.2f", soma);
		
		leia.close();
	}
}
