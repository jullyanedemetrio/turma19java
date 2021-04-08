package entity;

public class Conta {

	//Atributos
	private int numero;
	private String cpf;
	private double saldo;
	public boolean ativo;
	
	//Construtores 
	public Conta() {
		
	}
	
	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public Conta(int numero, String cpf, boolean ativo) {
		this.numero = numero;
		this.cpf = cpf;
		this.ativo = ativo;
	}
	
	//Encapsulamento
	
	public String getCpf () {
		return this.cpf;
	}
	
	public int getNumero () {
		return this.numero;
	}
	
	//Método
	public void debito(double valor) {
		saldo = saldo - valor;
	}
	
	public void credito(double valor) {
		saldo = saldo + valor;
	}
		
	
}
