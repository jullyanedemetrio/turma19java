package entities;

public class Estudante {

	//Atributos
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	
	//Construtor
	public Estudante(int matricula, String cpf) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}

	
	//Encapsulamento
	public int getMatricula() {
		return matricula;
	}

	/*
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	*/

	public String getCpf() {
		return cpf;
	}

	/*
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	*/

	public double getPontos() {
		return pontos;
	}

	/*
	public void setPontos(double pontos) {
		this.pontos = pontos;
	}
	*/

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//Métodos
	
	public void incluirPonto(double valorPonto) {
		pontos = pontos + valorPonto;
	}
	
	public void tirarPonto(double valorPonto) {
		pontos = pontos - valorPonto;
	}
}
