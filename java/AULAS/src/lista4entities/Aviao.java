package lista4entities;

public class Aviao {

	//Atributos
	public boolean statusMotor;
	public boolean statusVoando;
	
	//Métodos
	public void ligarMotor() {
		statusMotor = true;
		System.out.println("O motor está ligado!");
	}
	
	public void desligarMotor() {
		statusMotor = false;
		System.out.println("O motor está desligado!");
	}
	
	public void voar() {
		
		if (statusMotor) {
			statusVoando = true;
			System.out.println("Voando!");
		} else {
			System.out.println("Você precisa ligar o motor!");
		}
	}
	
	public void aterrissar () {
		
		if (statusMotor) {
			statusVoando = true;
			System.out.println("Aterrissando!");
		} else {
			System.out.println("Você não está voando!");
		}
	}
	
	
}
