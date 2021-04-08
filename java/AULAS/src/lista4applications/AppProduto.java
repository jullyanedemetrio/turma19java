package lista4applications;

import java.util.Scanner;

import lista4entities.Produto;

public class AppProduto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Produto produto1 = new Produto();
		
		System.out.print("Digite o nome do produto: ");
		produto1.setProduto(leia.next());
		System.out.print("Digite a marca do produto: ");
		produto1.setMarca(leia.next());
		System.out.print("Digite o preço do produto: R$ ");
		produto1.setPreco(leia.nextDouble());
		System.out.print("Quantidade adicionada ao estoque: ");
		produto1.addQtdEstoque(leia.nextInt());
		System.out.print("Quantidade retirada do estoque: ");
		produto1.removerQtdEstoque(leia.nextInt());
		
		System.out.printf("Produto: %s%nMarca: %s%nPreço do Produto: %.2f%nQtd em Estoque: %d", produto1.getProduto(), produto1.getMarca(), produto1.getPreco(), produto1.getQtdEstoque());
		
		
		
		
		leia.close();
	}
}
