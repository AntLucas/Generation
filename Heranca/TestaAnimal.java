package Heranca;
import java.util.Scanner;
public class TestaAnimal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do cachorro: ");
		String nomeDog = ler.next();
		
		System.out.println("Digite a idade do cachorro: ");
		int idadeDog = ler.nextInt();
		
		System.out.println("Digite o nome do cavalo: ");
		String nomeHorse = ler.next();
		
		System.out.println("Digite a idade do cavalo: ");
		int idadeHorse = ler.nextInt();
		
		System.out.println("Digite o nome da preguiça: ");
		String nomeSloth = ler.next();
		
		System.out.println("Digite a idade da preguiça: ");
		int idadeSloth = ler.nextInt();
		
		Cachorro cachorro1 = new Cachorro(nomeDog, idadeDog);
		Cavalo cavalo1 = new Cavalo(nomeHorse, idadeHorse);
		Preguica preguica1 = new Preguica(nomeSloth, idadeSloth);
		
		System.out.println("O cachorro "+cachorro1.getNome()+" tem "+cachorro1.getIdade()+" anos.\nO cavalo "
				+cavalo1.getNome()+" tem "+cavalo1.getIdade()+" anos.\nA preguiça "+preguica1.getNome()+" tem "
						+preguica1.getIdade()+" anos.\n");
		
		cachorro1.emitirSom(cachorro1.getNome());
		cavalo1.emitirSom(cavalo1.getNome());
		preguica1.emitirSom(preguica1.getNome());
		cachorro1.correr();
		cavalo1.correr();
		preguica1.subirArvore();
		
	}
}
