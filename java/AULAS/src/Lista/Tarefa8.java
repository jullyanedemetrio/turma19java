package Lista;

import java.util.Scanner;

public class Tarefa8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Vari�veis
		double custoConsumidor, custoFabrica, custoDistribuidor, impostos;
		
		//Entrada
		System.out.println("Digite o custo de f�brica do carro: ");
		custoFabrica = leia.nextDouble();
		
		//Processamento
		custoDistribuidor = custoFabrica * 0.28;
		impostos = custoFabrica * 0.45;
		custoConsumidor = custoFabrica + custoDistribuidor + impostos; 
		
		//Sa�das
		System.out.println("Custo de f�brica: " + custoFabrica + " reais");
		System.out.println("Porcentagem do distribuidor: " + custoDistribuidor + " reais");
		System.out.println("Impostos: " + impostos + " reais");
		System.out.println("Custo ao consumidor: " + custoConsumidor + " reais");

		leia.close();
	}

}
