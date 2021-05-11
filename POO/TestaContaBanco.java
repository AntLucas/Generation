package POO;
import java.util.Scanner;
public class TestaContaBanco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valor=0.0;
		String resp;
		
		System.out.println("\tSistema para sacar e depositar valores, exite uma taxa de 0,05% para cada valor"
				+ " em cada opera��o realizada");
		
		System.out.println("Digite o nome do dono da conta: ");
		String nomeDono = ler.nextLine();
		
		System.out.println("Digite o saldo atual da conta: ");
		double saldo = ler.nextDouble();
		
		
		ContaBanco conta1 = new ContaBanco(nomeDono, saldo, 0.0);
		
		do {
			System.out.println("Digite 'sacar' caso voc� queira sacar dinheiro da sua conta,"
					+ " digite 'depositar' caso voc� queira depositar dinheiro ou digite 'sair'"
					+ "para ver o seu saldo e finalizar o programa: "
					+ "n�o");
			resp = ler.next();
			
			
			while(!"sacar".equals(resp) && !"depositar".equals(resp) && !"sair".equals(resp)) {
				System.out.println("Valor digitado incorreto!\nDigite 'sacar' caso voc� queira sacar dinheiro da sua conta,"
						+ " digite 'depositar' caso voc� queira depositar dinheiro ou digite 'sair'"
						+ "para ver o seu saldo e finalizar o programa: "
						+ "n�o");
				resp = ler.next();
			}
			
			
			if("sacar".equals(resp)) {
				System.out.println("Quanto voc� deseja sacar em reais: ");
				valor = ler.nextDouble();
				while(valor <= 0) {
					System.out.println("Valor incorreto!\nQuanto voc� deseja sacar em reais: ");
					valor = ler.nextDouble();
				}
				
				conta1.Sacar(valor);
			}
			else if("depositar".equals(resp)) {
				System.out.println("Quanto voc� deseja depositar em reais: ");
				valor = ler.nextDouble();
				while(valor <= 0) {
					System.out.println("Valor incorreto!\nQuanto voc� deseja depositar em reais: ");
					valor = ler.nextDouble();
				}
				
				conta1.Depositar(valor);
			}
			
		}while(!"sair".equals(resp));
		
		System.out.printf("O nome do dono da conta � "+conta1.getDono()+" e o saldo da conta � %.2f",conta1.Saldo());
		
	}
	
}
