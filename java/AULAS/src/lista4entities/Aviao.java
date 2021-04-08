package lista4entities;

public class Aviao {

	//Atributos
	public boolean statusMotor;
	public boolean statusVoando;
	
	//M�todos
	public void ligarMotor() {
		statusMotor = true;
		System.out.println("O motor est� ligado!");
	}
	
	public void desligarMotor() {
		statusMotor = false;
		System.out.println("O motor est� desligado!");
	}
	
	public void voar() {
		
		if (statusMotor) {
			statusVoando = true;
			System.out.println("Voando!");
		} else {
			System.out.println("Voc� precisa ligar o motor!");
		}
	}
	
	public void aterrissar () {
		
		if (statusMotor) {
			statusVoando = true;
			System.out.println("Aterrissando!");
		} else {
			System.out.println("Voc� n�o est� voando!");
		}
	}
	
	
}
