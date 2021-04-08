package lista4applications;

import java.util.Scanner;

import lista4entities.Cliente;

public class AppCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		
		System.out.print("Digite o primeiro nome: ");
		cliente1.setPrimeiroNome(leia.next());
		System.out.print("Digite o último nome: ");
		cliente1.setUltimoNome(leia.next());
		System.out.print("Digite o CPF: ");
		cliente1.setCpf(leia.next());
		System.out.print("Digite o ano de nascimento: ");
		cliente1.setAnoNascimento(leia.nextInt());
		System.out.print("Digite a forma de pagamento: 1-Cartão de Crédito 2-Cartão de Débito 3-Dinheiro: ");
		cliente1.setformaPagamento(leia.next().charAt(0));
		
		System.out.printf("%nNome completo: %s%n", cliente1.nomeCompleto());
		System.out.printf("CPF: %s%n", cliente1.getCpf());
		System.out.printf("Idade: %d%n", cliente1.idade());
		System.out.printf("Forma de pagamento: %s%n ", cliente1.pagamento(cliente1.getFormaPagamento()));
				
		leia.close();
	}
}
