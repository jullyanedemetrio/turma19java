package entities;

public class Pos extends Estudante {

	//Atributos
	private double credito; //Limite: 5 pontos

	//Construtores
	public Pos(int matricula, String cpf) {
		super(matricula, cpf);
	}

	//Encapsulamento
	public double getCredito() {
		return credito;
	}

	/*
	public void setCredito(double credito) {
		this.credito = credito;
	}
	*/
		
	//Método
	public void usarCreditoPos(double credito) {
			super.incluirPonto(credito);	
	}
}
