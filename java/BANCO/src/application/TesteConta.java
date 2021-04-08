package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Conta contajoao = new Conta(3, "333");
		
		System.out.println("Digite o número da conta: ");
		//contajoao.numero = leia.nextInt();
		System.out.println("Digite o cpf da conta: ");
		//contajoao.cpf = leia.next();
		System.out.println("Digite o valor: ");
		double valor = leia.nextDouble();
		System.out.println("Operação de 1-Crédito ou 2-Débito?");
		char opcao = leia.next().charAt(0);
		
		if (opcao == '1') {
			contajoao.credito(valor);
		} else if (opcao == '2') {
			contajoao.credito(valor);
		}
				
		System.out.printf("CPF: %s %n", contajoao.getCpf());
		System.out.printf("Numero conta: %d %n", contajoao.getNumero());
		//System.out.printf("Saldo: %.2f %n", contajoao.saldo);
		
		leia.close();
	}

}
