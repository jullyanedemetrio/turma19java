package Exemplo;

import java.util.Scanner;

public class CadastroBaseEscola {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome1;
		String nome2;
		int ano1;
		int ano2;
		char opcao;
		String genero1;
		String genero2;
		
		System.out.println("Digite o seu nome: ");
		nome1 = leia.nextLine();
		System.out.println("Digite o ano de nascimento: ");
		ano1 = leia.nextInt();
		System.out.println("Digite o gênero: 1 - Feminino 2 - Masculino 3 - Outros");
		opcao = leia.next().charAt(0);
		
		if (opcao == '1') {
			genero1 = "Feminino";
		} else if (opcao == '2') {
			genero1 = "Masculino";
		}
		
		
	}
}
