/*
  Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.
 */

package VetorMatriz;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int []nums = new int[6];
		int somaPar = 0, contImpar = 0;
		
		for(int i = 0; i < 6; i++) {
			
			System.out.println("Digite um número inteiro: ");
			nums[i] = ler.nextInt();
			
			if(nums[i]%2 == 0) {
				
				somaPar = somaPar + nums[i];
				
			}
			else {
				
				contImpar++;
				
			}
			
		}
		
		System.out.println("\nSoma dos números pares digitados: "+somaPar+"\nNúmeros pares digitados: \n");
		for(int i = 0; i < 6; i++) {
			
			if(nums[i]%2 == 0) {
				
				System.out.print("["+nums[i]+"] ");
				
			}
			
		}

		System.out.println("\n\nQuantidade de números ímpares digitados: "+contImpar+"\nNúmeros ímpares digitados: \n");
		for(int i = 0; i < 6; i++) {
			
			if(nums[i]%2 != 0) {
				
				System.out.print("["+nums[i]+"] ");
				
			}
			
		}
		
	}
	
}
