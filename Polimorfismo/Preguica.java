package Heranca;

public class Preguica extends Animal{
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("A pregui�a "+getNome()+" grunhiu");
	}
	
	@Override
	public void acao() {
		System.out.println("A pregui�a "+getNome()+" est� subindo em uma �rvore\n");
	}
	
	@Override
	public void mostraInfo() {
		System.out.println("\nA pregui�a "+getNome()+" tem "+getIdade()+" anos.");
	}
}
