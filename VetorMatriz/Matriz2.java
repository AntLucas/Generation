/*Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um
menu de op��es:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor
da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na
pr�pria matriz.*/

package VetorMatriz;

import java.util.Scanner;

public class Matriz2 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		float [][]matriz1 = new float[2][2];
		float [][]matriz2 = new float[2][2];		
		float [][]matriz3 = new float[2][2];
		int escolha;
		
		for(int linha = 0; linha < 2; linha++) {
			
			for(int coluna = 0; coluna < 2; coluna++) {
				
				System.out.println("\nDigite o valor referente a "+(linha+1)+"� linha e "+(coluna+1)+"� coluna da matriz 1: ");
				matriz1[linha][coluna] = ler.nextFloat();
				
				System.out.println("\nDigite o valor referente a "+(linha+1)+"� linha e "+(coluna+1)+"� coluna da matriz 2: ");
				matriz2[linha][coluna] = ler.nextFloat();				
				
			}
			
		}
		
		System.out.println("\n\nMenu de op��es\nDigite o n�mero referente ao que voc� quer que seja feito\n"
				+ "1 - Somar cada posi��o das duas matrizes e exibit\n2 - Subtrair cada posi��o da primeira matriz da"
				+ " mesma posi��o da segunda e exibit\n3 - Adicionar uma constante a cada posi��o das duas matrizes e"
				+ " exibir as novas matrizes\n4 - Exibir as duas matrizes\n");
		escolha = ler.nextInt();
		
		switch( escolha ) {
		
		case 1: 
			
			System.out.println("\n\nSoma das duas matrizes: \n");
					
			for(int linha = 0; linha < 2; linha++) {
				
				for(int coluna = 0; coluna < 2; coluna++) {
					
					matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
					
					System.out.print("["+matriz3[linha][coluna]+"] ");
					
				}
				
				System.out.println("");
				
			}
			
			break;
		
		case 2:
			
			System.out.println("\n\nSubtra��o da primeira matriz na segunda: \n");
			
			for(int linha = 0; linha < 2; linha++) {
				
				for(int coluna = 0; coluna < 2; coluna++) {
					
					matriz3[linha][coluna] = matriz2[linha][coluna] - matriz1[linha][coluna];
					
					System.out.print("["+matriz3[linha][coluna]+"] ");
					
				}
				
				System.out.println("");
				
			}
			
			break;
			
		case 3:
			
			System.out.println("\nDigite o valor da constante: ");
			int constante = ler.nextInt();
			
			System.out.println("\nMatriz 1 com a constante adicionada: ");
			
			for(int linha = 0; linha < 2; linha++) {
				
				for(int coluna = 0; coluna < 2; coluna++) {
					
					matriz1[linha][coluna] += constante;
					
					System.out.print("["+matriz1[linha][coluna]+"] ");
					
				}
				
				System.out.println("");
				
			}
			
			System.out.println("\nMatriz 2 com a constante adicionada: ");
			
			for(int linha = 0; linha < 2; linha++) {
				
				for(int coluna = 0; coluna < 2; coluna++) {
					
					matriz2[linha][coluna] += constante;
					
					System.out.print("["+matriz2[linha][coluna]+"] ");
					
				}
				
				System.out.println("");
				
			}
			
			break;
		
		case 4:
			
			System.out.println("\n Exibi��o das duas matrizes: ");
			
			System.out.println("\nMatriz 1: ");
			
			for(int linha = 0; linha < 2; linha++) {
				
				for(int coluna = 0; coluna < 2; coluna++) {
					
					System.out.print("["+matriz1[linha][coluna]+"] ");
					
				}
				
				System.out.println("");
				
			}
			
			System.out.println("\nMatriz 2: ");
			
			for(int linha = 0; linha < 2; linha++) {
				
				for(int coluna = 0; coluna < 2; coluna++) {
					
					System.out.print("["+matriz2[linha][coluna]+"] ");
					
				}
				
				System.out.println("");
				
			}	
			
			break;
			
		default:
			
			System.out.println("\nOp��o digitada incorreta.");
	
		}
	
	}

}
