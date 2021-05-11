package POO;

public class ContaBanco {
	
	private String dono;
	private double saldo;
	private double taxaOperacao;
	
	public ContaBanco(String dono, double saldo, double taxaOperacao){
		this.dono = dono;
		this.saldo = saldo;
		this.taxaOperacao = taxaOperacao;
	}
	
	void Sacar(double valor) {
		
		this.taxaOperacao = valor*0.0005;
		
		this.saldo += - valor - (this.taxaOperacao);
	}
	void Depositar(double valor) {
		this.taxaOperacao = valor*0.0005;
		
		this.saldo += valor - (this.taxaOperacao);
	}
	
	double Saldo() {
		return saldo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxaOperacao() {
		return taxaOperacao;
	}

	public void setTaxaOperacao(double taxaOperacao) {
		this.taxaOperacao = taxaOperacao;
	}
	
	
}
