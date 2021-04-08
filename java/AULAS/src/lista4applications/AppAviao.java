package lista4applications;

import java.util.Scanner;

import lista4entities.Aviao;

public class AppAviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Aviao aviao1 = new Aviao();
		
		System.out.print("Motor do avião: 1-Ligar 2-Desligar ");
		char auxMotor = leia.next().charAt(0);
		
		if (auxMotor == '1') {
			aviao1.ligarMotor();
		} else if (auxMotor == '2') {
			aviao1.desligarMotor();
		}
		
		System.out.print("Iniciar voo? 1-Sim 2-Não ");
		char auxVoo = leia.next().charAt(0);
		
		if (auxVoo == '1') {
			aviao1.voar();
		} else if (auxVoo == '2') {
			System.out.println("Ok!");
		}
		
		
		leia.close();
	}
}
