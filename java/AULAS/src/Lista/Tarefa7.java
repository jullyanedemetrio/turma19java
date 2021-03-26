package Lista;

import java.util.Scanner;

public class Tarefa7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		double a, b, c, d, e, f, x, y;
		
		//Entrada
		System.out.println("Digite o valor do coeficiente A: ");
		a = leia.nextDouble();
		System.out.println("Digite o valor do coeficiente B: ");
		b = leia.nextDouble();
		System.out.println("Digite o valor do coeficiente C: ");
		c = leia.nextDouble();
		System.out.println("Digite o valor do coeficiente D: ");
		d = leia.nextDouble();
		System.out.println("Digite o valor do coeficiente E: ");
		e = leia.nextDouble();
		System.out.println("Digite o valor do coeficiente F: ");
		f = leia.nextDouble();
		
		//Processamento
		x = (((c * e) - (b * f)) / ((a * e) - (b * d)));
		y = (((a * f) - (c * d)) / ((a * e) - (b * d)));
		
		//Saída
		System.out.println("O valor de x: " + x);
		System.out.println("O valor de y: " + y);
		
		
	}

}
