package POO;
import java.util.Scanner;
public class TestaCliente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valorGasto=0.0;
		int resp;
		
		System.out.println("Digite o nome do cliente: ");
		String nomeCli = ler.nextLine();
		
		System.out.println(nomeCli);
		
		System.out.println("Quantas compras esse cliente já fez nessa loja? ");
		int numCompras = ler.nextInt();
		
		while(numCompras < 0) {
			System.out.println("Valor incorreto!\nQuantas compras esse cliente já fez nessa loja? ");
			numCompras = ler.nextInt();
		}
		
		if(numCompras != 0) {
			System.out.println("Qual o valor total gasto nessas compras?");
			valorGasto = ler.nextDouble();
			
			while(valorGasto <= 0) {
				System.out.println("Valor incorreto!\nQual o valor total gasto nessas compras?");
				valorGasto = ler.nextDouble();
			}
		}
		
		
		Cliente cliente1 = new Cliente(nomeCli, numCompras, valorGasto);
		
		do {
			System.out.println("O cliente deseja fazer alguma compra? Digite 1 para sim e 2 para "
					+ "não");
			resp = ler.nextInt();
			
			
			while(resp != 1 && resp != 2) {
				System.out.println("Resposta incorreta!\nO cliente deseja fazer alguma compra? "
						+ "Digite 1 para sim e 2 para não");
				resp = ler.nextInt();
			}
			
			
			if(resp == 1) {
				cliente1.comprou();
				
				System.out.println("\nQual o valor dessa compra?");
				valorGasto = ler.nextDouble();
				
				while(valorGasto <= 0) {
					System.out.println("Valor incorreto!\nQual o valor total gasto nessas compras?");
					valorGasto = ler.nextDouble();
				}
				
				cliente1.valorCompra(valorGasto);
			}
			
		}while(resp != 2);
		
		System.out.println("\n\nO cliente "+cliente1.getNome()+" realizou "+cliente1.getNumCompras()+
				" compras e gastou R$"+cliente1.getValorGasto()+" no total.");
		
	}
	
}
