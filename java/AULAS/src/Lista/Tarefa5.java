package Lista;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, mediaFinal; 
		
		System.out.println("Digite o valor da primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite o valor da segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite o valor da terceira nota: ");
		nota3 = leia.nextDouble();
	
		mediaFinal = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10);
		
		System.out.printf("Média Final: %.1f",mediaFinal);
		
	}
}
