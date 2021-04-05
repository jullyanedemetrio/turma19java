package Lista2;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Digite o primeiro número: ");
		a = leia.nextInt();
		System.out.print("Digite o segundo número: ");
		b = leia.nextInt();
		System.out.print("Digite o terceiro número: ");
		c = leia.nextInt();
		
		if (a > b && a > c ) {
			System.out.println("O número " + a + " é o maior.");
		} else if (b > c) {
			System.out.println("O número " + b + " é o maior.");
		} else {
			System.out.println("O número " + c + " é o maior.");
		}
		
		leia.close();
	}
}
