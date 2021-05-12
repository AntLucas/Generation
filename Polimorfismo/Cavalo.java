package Heranca;

public class Cavalo extends Animal{
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cavalo "+getNome()+" relinchou");
	}
	
	@Override
	public void acao() {
		System.out.println("O Cavalo "+getNome()+" está correndo\n");
	}
	
	@Override
	public void mostraInfo() {
		System.out.println("\nO cavalo "+getNome()+" tem "+getIdade()+" anos.");
	}
}
