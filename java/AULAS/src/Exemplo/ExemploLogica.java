package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class ExemploLogica {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();	
		
		parImpar(numero);
		
		System.out.println("Fim de programa");
		escreveLinha();
		leia.close();
	}

	public static void parImpar(int numero) {
		
		if (numero % 2 == 0 && numero >= 0) {
			System.out.println("Número par");
			escreveLinha();
		} else if (numero % 2 == 1 && numero > 0){
			System.out.println("Número impar");
			escreveLinha();
		}
	}
	
	public static void escreveLinha() {
		System.out.println("--------------------------------------------------");
	}
}
