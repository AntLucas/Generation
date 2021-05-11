package POO;
import java.util.Scanner;
public class TestaAviao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double horasVoadas=0.0;
		int resp;
		
		System.out.println("Digite o nome do modelo do avião: ");
		String nomeAvi = ler.next();
		
		System.out.println("Digite o nome da cor do avião: ");
		String cor = ler.next();
		
		System.out.println("Digite o nome da empresa dona desse avião: ");
		String empresa = ler.next();
	
		System.out.println("Quantos voos esse avião já fez?");
		int numVoos = ler.nextInt();
		
		while(numVoos < 0) {
			System.out.println("Valor incorreto!\nQuantos voos esse avião já fez? ");
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
			System.out.println("Esse avião realizou outro voo? Digite 1 para sim e 2 para "
					+ "não");
			resp = ler.nextInt();
			
			
			while(resp != 1 && resp != 2) {
				System.out.println("Resposta incorreta!\nEsse avião realizou outro voo? "
						+ "Digite 1 para sim e 2 para não");
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
		
		System.out.println("\n\nO avião de modelo "+aviao1.getEmpresa()+" com a cor "+aviao1.getCor()+""
				+ " da empresa "+aviao1.getEmpresa()+" realizou "+aviao1.getVoos()+
				" voos em um total de "+aviao1.getHoras()+" horas.");
		
	}
	
}
