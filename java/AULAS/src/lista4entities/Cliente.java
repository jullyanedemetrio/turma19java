package lista4entities;

public class Cliente {

	    //Atributos
		private String primeiroNome;
		private String ultimoNome;
		private int anoNascimento;
		private String cpf;
		private char formaPagamento;
		
		

		//Construtores 
		public Cliente() {
			
		}
		
		//Encapsulamento
		
		public String getPrimeiroNome() {
			return primeiroNome;
		}

		public void setPrimeiroNome(String primeiroNome) {
			this.primeiroNome = primeiroNome;
		}

		public String getUltimoNome() {
			return ultimoNome;
		}

		public void setUltimoNome(String ultimoNome) {
			this.ultimoNome = ultimoNome;
		}

		public int getAnoNascimento() {
			return anoNascimento;
		}

		public void setAnoNascimento(int anoNascimento) {
			this.anoNascimento = anoNascimento;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		public char getFormaPagamento() {
			return formaPagamento;
		}
		
		public void setformaPagamento(char formaPagamento) {
			this.formaPagamento = formaPagamento;
		}
		
		
		//Métodos
		
		public String nomeCompleto () {
			String nomeCompleto = primeiroNome + " " + ultimoNome; 
			return nomeCompleto;
		}
		
		public int idade () {
			return 2021 - anoNascimento;
		}
		
		public String pagamento (char formaPagamento) {
			String pagaCom ="";
			if (formaPagamento == '1') {
				pagaCom = "Cartão de Crédito";
			} else if (formaPagamento == '2') {
				pagaCom = "Cartão de Débito";
			} else if (formaPagamento == '3') {
				pagaCom = "Dinheiro";
			}
			return pagaCom;
		}
}
