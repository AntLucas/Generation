package POO;

public class Aviao {

	private String modelo;
	private String cor;
	private String empresa;
	private int voos;
	private double horas;
	
	public Aviao (String modelo, String cor, String empresa, int voos, double horas) {
		this.modelo = modelo;
		this.cor = cor;
		this.empresa = empresa;
		this.voos = voos;
		this.horas = horas;
	}
	
	public void voou() {
		this.voos = this.voos + 1;
	}
	
	public void horasAdicionadas(double horas) {
		this.horas = this.horas + horas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getVoos() {
		return voos;
	}

	public void setVoos(int voos) {
		this.voos = voos;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	
	
}
