package Lista2;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Categoria Infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Categoria Juvenil");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Categoria Adulto");
		} else {
			System.out.println("Não há categoria para essa idade");
		}
		
		leia.close();
	}
}
