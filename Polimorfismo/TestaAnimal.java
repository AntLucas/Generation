package Heranca;
import java.util.Scanner;
public class TestaAnimal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Animal animal1 = null;
		
		//Cachorro
		System.out.println("Digite o nome do cachorro: ");
		String nomeDog = ler.next();
		
		System.out.println("Digite a idade do cachorro: ");
		int idadeDog = ler.nextInt();
		
		Cachorro cachorro1 = new Cachorro(nomeDog, idadeDog);
		
		animal1 = cachorro1;
		
		animal1.mostraInfo();
		animal1.emitirSom();
		animal1.acao();
		
		//Cavalo
		System.out.println("Digite o nome do cavalo: ");
		String nomeHorse = ler.next();
		
		System.out.println("Digite a idade do cavalo: ");
		int idadeHorse = ler.nextInt();
		
		Cavalo cavalo1 = new Cavalo(nomeHorse, idadeHorse);
		
		animal1 = cavalo1;
		animal1.mostraInfo();
		animal1.emitirSom();
		animal1.acao();
		
		//Preguiça
		System.out.println("Digite o nome da preguiça: ");
		String nomeSloth = ler.next();
		
		System.out.println("Digite a idade da preguiça: ");
		int idadeSloth = ler.nextInt();
		
		Preguica preguica1 = new Preguica(nomeSloth, idadeSloth);
		
		animal1 = preguica1;
		
		animal1.mostraInfo();
		animal1.emitirSom();
		animal1.acao();
		
	}
}
