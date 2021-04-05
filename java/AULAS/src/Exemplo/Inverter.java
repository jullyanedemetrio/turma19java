package Exemplo;

import java.util.Scanner;

public class Inverter {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
	int valor1, valor2, aux;
	
	System.out.println("Valor A:");
	valor1 = leia.nextInt();
	System.out.println("Valor B:");
	valor2 = leia.nextInt();
	
	aux = valor1;
	valor1 = valor2;
	valor2 = aux;
	
	//valor1 = valor1 + valor2  10 = 10 + 20
	//valor2 = valor1 - valor2  20 = 30 - 20
	//valor1 = valor1 - valor2  30 = 30 - 10 
	
	System.out.println("Valor A: " + valor1);
	System.out.println("Valor B: " + valor2);
	
	leia.close();
	}
}

