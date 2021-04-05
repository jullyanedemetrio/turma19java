package Exemplo;

import java.util.Scanner;

public class TemperaturaF {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double TemperaturaC;
		double TemperaturaF;
		
		System.out.println("Temperatura em Celsius: ");
		TemperaturaC = leia.nextDouble();
		
		TemperaturaF = ((TemperaturaC * 1.8) + 32);
		
		System.out.printf("Temperatura em F:  %.2f", TemperaturaF);
		leia.close();
	}

}
