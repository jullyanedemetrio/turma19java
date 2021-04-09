package entidades;

public class Doce extends Produto {
	
	//Atributos
	private String fabricante;

	//Construtores
	public Doce(String descricao, String codigo, double valorUnitario, String fabricante) {
		super(descricao, codigo, valorUnitario);
		this.fabricante = fabricante;
	}

	//Encapsulamento
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
	
	

}
