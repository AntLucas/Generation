package Heranca;

public class Cachorro extends Animal{
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro "+getNome()+" latiu");
	}
	
	@Override
	public void acao() {
		System.out.println("O cachorro "+getNome()+" está correndo\n");
	}
	
	@Override 
	public void mostraInfo() {
		System.out.println("\nO cachorro "+getNome()+" tem "+getIdade()+" anos.");
	}

}
