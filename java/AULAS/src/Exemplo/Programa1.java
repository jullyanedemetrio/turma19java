package Exemplo;

public class Programa1 {
	
	public static void main (String[] args) {
	
		//variaveis
		// int valor1, valor2
		// int valor1 = 5, valor2 = 3
		int valor1;
		int valor2;
		int soma;
		
		//entradas
		valor1 = 10;
		valor2 = 20; 
		
		//processamento
		soma = valor1 + valor2;
		
		//saida
		System.out.println("o valor 1 é " + valor1);
		System.out.println("o valor 2 é " + valor2);
		System.out.println("A soma é: " + soma);
		
	}
	
	//função para pular linha 
	public static void linha() {
		System.out.println();
	}
}
