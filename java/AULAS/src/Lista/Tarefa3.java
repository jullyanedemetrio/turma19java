package Lista;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		//%f - double %.2f Para formatar as casas
		//%d - int
		//%s - String
		//%c - Caracter
		double eventoSegundos, horas, minutos, segundos; 
		
		//Entrada
		System.out.println("Digite a duração do evento em segundos: ");
		eventoSegundos = leia.nextDouble();
		
		//Processamentos
		horas = (eventoSegundos / 3600);
		minutos = ((eventoSegundos % 3600 ) / 60);
		segundos = ((eventoSegundos % 3600) % 60);
		
		//Saida
		System.out.printf("Horas: %.0f \nMinutos: %.0f \nSegundos: %.0f" ,horas, minutos,segundos);
		
		leia.close();
	}
}
