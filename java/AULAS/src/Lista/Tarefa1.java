package Lista;

import java.util.Scanner;

public class Tarefa1 {
	
	public static void main(String[] args) {
		
		int anos, meses, dias, anosEmDias, mesesEmDias, idadeEmDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade no formato anos, meses e dias");
		System.out.println("Anos: ");
		anos = leia.nextInt(); 
		System.out.println("Meses: ");
		meses = leia.nextInt();
		System.out.println("Dias: ");
		dias = leia.nextInt();
		
		anosEmDias = 365 * anos;
		mesesEmDias = 30 * meses; 
		idadeEmDias = anosEmDias + mesesEmDias + dias;
		
		System.out.println("Você está vivo há " + idadeEmDias + " dias");
		
		leia.close();
	}

}
