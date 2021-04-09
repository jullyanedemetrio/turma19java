package entidades;

public class Revista extends Produto {
	
	private String editora;
	
	//Construtores
	public Revista(String descricao, String codigo, double valorUnitario, String editora) {
		super(descricao, codigo, valorUnitario);
		this.editora = editora;
	}

	//Encapsulamento
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
	
} //Aqui é o fim da classe!
