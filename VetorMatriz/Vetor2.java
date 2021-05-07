/*
  Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.
 */

package VetorMatriz;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int []nums = new int[6];
		int somaPar = 0, contImpar = 0;
		
		for(int i = 0; i < 6; i++) {
			
			System.out.println("Digite um n�mero inteiro: ");
			nums[i] = ler.nextInt();
			
			if(nums[i]%2 == 0) {
				
				somaPar = somaPar + nums[i];
				
			}
			else {
				
				contImpar++;
				
			}
			
		}
		
		System.out.println("\nSoma dos n�meros pares digitados: "+somaPar+"\nN�meros pares digitados: \n");
		for(int i = 0; i < 6; i++) {
			
			if(nums[i]%2 == 0) {
				
				System.out.print("["+nums[i]+"] ");
				
			}
			
		}

		System.out.println("\n\nQuantidade de n�meros �mpares digitados: "+contImpar+"\nN�meros �mpares digitados: \n");
		for(int i = 0; i < 6; i++) {
			
			if(nums[i]%2 != 0) {
				
				System.out.print("["+nums[i]+"] ");
				
			}
			
		}
		
	}
	
}
