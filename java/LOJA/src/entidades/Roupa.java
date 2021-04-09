package entidades;

public class Roupa extends Produto {

	//Atributos
	private String marca;

	//Construtor
	public Roupa(String descricao, String codigo, double valorUnitario, String marca) {
		super(descricao, codigo, valorUnitario);
		this.marca = marca;
	}

	//Encapsulamento
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
}
