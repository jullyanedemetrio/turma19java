package Exemplo;

import java.util.Scanner;

public class ImpostoRenda {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome, pronome, isencao = null;
		Double salarioBruto;
		
		System.out.print("Olá, digite seu nome: ");
		nome = leia.nextLine();
		System.out.print("Qual o seu pronome de tratamento? 1 - Sre. 2 - Sra. 3 - Sr.: ");
		pronome = leia.next();
		
		if (pronome.equals("1")) {
			pronome = "Sre.";
			isencao = "isente";
		} else if (pronome.equals("2")) {
			pronome = "Sra.";
			isencao = "isenta";
		} else if (pronome.equals("3")) {
			pronome = "Sr.";
			isencao = "isento";
		} else {
			System.out.println("Opção inválida");
			pronome = "Sre.";
			isencao = "isente";
		}
		
		System.out.print("Digite o valor do seu salário bruto: ");
		salarioBruto = leia.nextDouble();
		
		if (salarioBruto >= 0.0 && salarioBruto <= 1500) {
			System.out.printf("%s %s, você está %s do imposto de renda.", pronome, nome, isencao);
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			double imposto = (salarioBruto * 0.15);
			double salarioLiquido = salarioBruto - imposto;
			System.out.printf("%s %s, você pagará R$ %.2f de impostos.%nSalário Final: R$ %.2f", pronome, nome, imposto, salarioLiquido);
		} else if (salarioBruto > 2500) {
			double imposto = (salarioBruto * 0.25);
			double salarioLiquido = salarioBruto - imposto;
			System.out.printf("%s %s, você pagará R$ %.2f de impostos.%nSalário Final: R$ %.2f", pronome, nome, imposto, salarioLiquido);
		} else {
			System.out.println("Valor inválido");
		}
		
		
		
		leia.close();
	}
}
