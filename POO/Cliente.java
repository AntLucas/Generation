package POO;

public class Cliente {

	private String nome;
	private int numCompras;
	private double valorGasto;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumCompras() {
		return numCompras;
	}

	public void setNumCompras(int numCompras) {
		this.numCompras = numCompras;
	}

	public double getValorGasto() {
		return valorGasto;
	}

	public void setValorGasto(double valorGasto) {
		this.valorGasto = valorGasto;
	}
	
	
	public Cliente (String nome, int numCompras, double valorGasto) {
		this.nome = nome;
		this.numCompras = numCompras;
		this.valorGasto = valorGasto;
	}
	
	public void comprou() {
		this.numCompras = this.numCompras + 1;
	}
	
	public void valorCompra(double valorGasto) {
		this.valorGasto = this.valorGasto + valorGasto;
	}

	
	
}
