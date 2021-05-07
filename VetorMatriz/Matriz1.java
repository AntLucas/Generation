/*Leia uma matriz 3 x 3, conte e escreva quantos 
  valores maiores que 10 ela possui.
 */

package VetorMatriz;

import java.util.Scanner;

public class Matriz1 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		float [][]matriz = new float[3][3];
		int cont10 = 0;
		
		for(int linha = 0; linha < 3; linha++) {
			
			for(int coluna = 0; coluna < 3; coluna++) {
				
				System.out.println("\nDigite o valor referente a "+(linha+1)+"ª linha e "+(coluna+1)+"ª coluna: ");
				matriz[linha][coluna] = ler.nextFloat();
				
				if(matriz[linha][coluna] > 10) {
					
					cont10++;
					
				}
				
			}
			
		}
		
		System.out.println("\n\nForam digitados "+cont10+" valores maiores do que 10 na matriz");
		
	}
	
}
