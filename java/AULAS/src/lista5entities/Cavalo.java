package lista5entities;

public class Cavalo extends Animal {

	//Construtores 
	public Cavalo(String nome, int idade, String som) {
		super(nome, idade, som);
	}
		
	//M�todos		
	public void correr() {
		System.out.println("correndo");
	}
}
