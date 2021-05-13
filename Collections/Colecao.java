package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao {
	public static void main(String[] args) {
		int escolha;
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList <String> estoque = new ArrayList();
		
		do {
			System.out.println("\tDigite de acordo com o que deseja fazer");
			System.out.println("\n0-Finalizar o programa\n1-Adicionar produtos ao estoque"
					+ "\n2-Remover produtos do estoque\n3-Atualizar produtos do estoque"
					+ "\n4-Exibir todos os produtos do estoque");
			escolha = ler.nextInt();
			
			switch(escolha) {
				case 1:
					ler.nextLine();
					System.out.println("\nDigite o produto para adicionar ao estoque");
					String produto = ler.nextLine();
					estoque.add(produto);
					break;
				case 2:
					ler.nextLine();
					System.out.println("\nDigite o produto para remover do estoque");
					String produto1 = ler.nextLine();
					if(estoque.contains(produto1)) {
						estoque.remove(produto1);
					}
					else {
						System.out.println("\nO produto "+produto1+" não existe no estoque!!!");
					}
					break;
				case 3:
					ler.nextLine();
					System.out.println("\nDigite o produto que quer atualizar: ");
					String verifica = ler.nextLine();
					if(estoque.contains(verifica)) {
						System.out.println("\nDigite o nome do produto que entrará no lugar de "+verifica+": ");
						String novo = ler.nextLine();
						
						estoque.remove(verifica);
						estoque.add(novo);
					}
					else {
						System.out.println("O produto "+verifica+" não existe no estoque!!!");
					}
					break;
				case 4:
					System.out.println("\nMostrando os produtos do estoque...");
					System.out.println(estoque);
					break;
				default:
					System.out.println("\nPrograma finalizado");
					
			}
		} while(escolha != 0);
		
	}
}
