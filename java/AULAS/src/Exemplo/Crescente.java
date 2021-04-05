package Exemplo;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int a, b, c;

		System.out.print("Digite o primeiro número: ");
		a = leia.nextInt();
		System.out.print("Digite o segundo número: ");
		b = leia.nextInt();
		System.out.print("Digite o terceiro número: ");
		c = leia.nextInt();

		if (a <= b && a <= c && b <= c) 
		{
			System.out.printf("%d, %d, %d", a, b, c);
		}
		else if (b <= c && c <= a ) 
		{
			System.out.printf("%d, %d, %d", b, c, a);
		}
		else if (c <= b && b <= a) 
		{
			System.out.printf("%d, %d, %d", c, b, a);
		}
		else if (b <= a && a <= c) 
		{
			System.out.printf("%d, %d, %d", b, a, c);
		}
		else if (c <= a && a <= b) 
		{
			System.out.printf("%d, %d, %d", c, a, b);
		}
		else if (a <= c && c <= b) {
			System.out.printf("%d, %d, %d", a, c, b);
		}
		
		leia.close();
	}
}