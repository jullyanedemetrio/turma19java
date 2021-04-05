package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int a;
		
		System.out.print("Digite um n�mero positivo: ");
		a = leia.nextInt();
		
		if (a % 2 == 0 && a > 0) {
			double aux = Math.sqrt(a);
			System.out.printf("O n�mero %d � par%nValor da raiz quadrada de %d: %.2f", a, a, aux);	
		} else if (a % 2 != 0 && a > 0){
			double aux = Math.pow(a, 2);
			System.out.printf("O n�mero %d � �mpar%nValor de %d�: %.2f", a, a, aux);
		} else {
			System.out.println("N�mero inv�lido");
		}
		
		leia.close();
	}
}
