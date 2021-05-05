package Modulo1;

import java.util.Scanner;

public class LacoDeDecisao4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double num, result;
		
		System.out.println("Digite um número: ");
		num = ler.nextFloat();
		
		if(num%2 == 0) {
			
			if(num<0) {
				
				System.out.println("Não é possível tirar a raíz quadrada de um número negativo, "
						+ "vamos considerar esse número como se ele fosse positivo");
				
				num = num*-1;

			}
			
			result = Math.sqrt(num);
			
			System.out.printf("O número %2.2f é par, sua raiz quadrada é: %2.2f",num,result);
			
		}
		else {
			
			result = Math.pow(num, 2);
			
			System.out.printf("O número %2.2f é ímpar, seu valor elevado ao quadrado é: %2.2f",num,result);
			
		}
		
	}
	
}
