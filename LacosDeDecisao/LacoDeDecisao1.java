package Modulo1;

import java.util.Scanner;

public class LacoDeDecisao1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3, maior;
		
		System.out.println("Entre com o primeiro número inteiro: ");
		num1 = ler.nextInt();
		System.out.println("Entre com o segundo número inteiro: ");
		num2 = ler.nextInt();
		System.out.println("Entre com o terceiro número inteiro: ");
		num3 = ler.nextInt();
		
		maior = num1;
		
		if(maior < num2) {
			maior = num2;
		}
		if(maior < num3) {
			maior = num3;
		}
			
		System.out.println("O maior número é o "+ maior);
		
	}
	
}
