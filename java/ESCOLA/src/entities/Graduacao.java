package entities;

public class Graduacao extends Estudante {

	//Atributos
	private double bonus;

	//Construtores
	public Graduacao(int matricula, String cpf) {
		super(matricula, cpf);
	}

	//Encapsulamento
	public double getBonus() {
		return bonus;
	}

	/*
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	*/
	
	//Método
	public void usarBonus(double bonus) {
			super.incluirPonto(bonus);	
	}
}
