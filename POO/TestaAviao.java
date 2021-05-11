package POO;
import java.util.Scanner;
public class TestaAviao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double horasVoadas=0.0;
		int resp;
		
		System.out.println("Digite o nome do modelo do avi�o: ");
		String nomeAvi = ler.next();
		
		System.out.println("Digite o nome da cor do avi�o: ");
		String cor = ler.next();
		
		System.out.println("Digite o nome da empresa dona desse avi�o: ");
		String empresa = ler.next();
	
		System.out.println("Quantos voos esse avi�o j� fez?");
		int numVoos = ler.nextInt();
		
		while(numVoos < 0) {
			System.out.println("Valor incorreto!\nQuantos voos esse avi�o j� fez? ");
			numVoos = ler.nextInt();
		}
		
		if(numVoos != 0) {
			System.out.println("Qual o valor total das horas voadas?");
			horasVoadas = ler.nextDouble();
			
			while(horasVoadas <= 0) {
				System.out.println("Valor incorreto!\nQual o valor total das horas voadas?");
				horasVoadas = ler.nextDouble();
			}
		}
		
		
		Aviao aviao1 = new Aviao(nomeAvi, cor, empresa, numVoos, horasVoadas);
		
		do {
			System.out.println("Esse avi�o realizou outro voo? Digite 1 para sim e 2 para "
					+ "n�o");
			resp = ler.nextInt();
			
			
			while(resp != 1 && resp != 2) {
				System.out.println("Resposta incorreta!\nEsse avi�o realizou outro voo? "
						+ "Digite 1 para sim e 2 para n�o");
				resp = ler.nextInt();
			}
			
			
			if(resp == 1) {
				aviao1.voou();
				
				System.out.println("\nQual o valor das horas voadas?");
				horasVoadas = ler.nextDouble();
				
				while(horasVoadas <= 0) {
					System.out.println("Valor incorreto!\nQual o valor total das horas voadas?");
					horasVoadas = ler.nextDouble();
				}
				
				aviao1.horasAdicionadas(horasVoadas);
			}
			
		}while(resp != 2);
		
		System.out.println("\n\nO avi�o de modelo "+aviao1.getEmpresa()+" com a cor "+aviao1.getCor()+""
				+ " da empresa "+aviao1.getEmpresa()+" realizou "+aviao1.getVoos()+
				" voos em um total de "+aviao1.getHoras()+" horas.");
		
	}
	
}
