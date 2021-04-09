package entities;

public class Basico extends Estudante {
	
	//Atributos
	private int diaAniversario;

	//Construtor
	public Basico(int matricula, String cpf, int diaAniversario) {
		super(matricula, cpf);
		this.diaAniversario = diaAniversario;
	}

	//Encapsulamento
	public int getDiaAniversario() {
		return diaAniversario;
	}

	/*
	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	*/
	
	//Método

	public void bonusAniversario(int diaAtual) {
		double auxpontos = 0.00;
		if (diaAniversario == diaAtual) {
			auxpontos = (super.getPontos() * 0.10);
			super.incluirPonto(auxpontos);
			//super.incluirPonto(super.getPontos() * 0.10);
		}
	}
}
