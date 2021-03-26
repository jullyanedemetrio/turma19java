package Lista;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade; 
		int anos, meses, dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		idade = leia.nextInt();
		
		anos = (idade / 365);
		meses = ((idade % 365) / 30);
		dias =((idade % 365) % 30);
		
		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias. ");
		
	}

}
