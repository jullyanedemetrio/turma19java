package entidades;

public class Roupa extends Produto {

	// Atributos
	private String marca;

	// Construtor
	public Roupa(String descricao, String codigo, double valorUnitario, int qtdeEstoque, String marca) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.marca = marca;
	}

	// Encapsulamento
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
