package lista4entities;

public class Produto {

	//Atributos
	
	private String produto;
	private String marca;
	private double preco;
	private int qtdEstoque;
	
	//Construtores 
	
	public Produto() {
		
	}
	
	//Encapsulamento

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	//Métodos
	
	public void addQtdEstoque (int qtd) {
		
		qtdEstoque += qtd;
	}
	
public void removerQtdEstoque (int qtd) {
		
		qtdEstoque -= qtd;
	}
	
	
	
	
}
