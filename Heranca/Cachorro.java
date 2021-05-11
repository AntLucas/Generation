package Heranca;

public class Cachorro extends Animal{
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public void correr() {
		System.out.println("\nO cachorro está correndo");
	}

}
