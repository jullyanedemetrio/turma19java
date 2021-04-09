package entities;

public class Mestrado extends Estudante {

	//Atributos
	private double creditoMestrado; //Limite: 10 pontos

	//Construtores
	public Mestrado(int matricula, String cpf) {
		super(matricula, cpf);
	}

	//Encapsulamento
	public double getCreditoMestrado() {
		return creditoMestrado;
	}

	/*
	public void setCreditoMestrado(double creditoMestrado) {
		this.creditoMestrado = creditoMestrado;
	}
	*/
		
	//Método
	public void usarCreditoMestrado(double creditoMestrado) {
			super.incluirPonto(creditoMestrado);	
	}
}
