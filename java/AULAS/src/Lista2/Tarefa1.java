package Lista2;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Digite o primeiro n�mero: ");
		a = leia.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		b = leia.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		c = leia.nextInt();
		
		if (a > b && a > c ) {
			System.out.println("O n�mero " + a + " � o maior.");
		} else if (b > c) {
			System.out.println("O n�mero " + b + " � o maior.");
		} else {
			System.out.println("O n�mero " + c + " � o maior.");
		}
		
		leia.close();
	}
}
