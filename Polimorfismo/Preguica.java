package Heranca;

public class Preguica extends Animal{
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("A preguiça "+getNome()+" grunhiu");
	}
	
	@Override
	public void acao() {
		System.out.println("A preguiça "+getNome()+" está subindo em uma árvore\n");
	}
	
	@Override
	public void mostraInfo() {
		System.out.println("\nA preguiça "+getNome()+" tem "+getIdade()+" anos.");
	}
}
