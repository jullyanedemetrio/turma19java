package lista5entities;

public class Cachorro extends Animal {
		
	//Construtores 
	public Cachorro(String nome, int idade, String som) {
		super(nome, idade, som);
	}
	
	//M�todos 
	public void correr() {
		System.out.println("correndo");
	}
}
