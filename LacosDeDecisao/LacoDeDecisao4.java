package Modulo1;

import java.util.Scanner;

public class LacoDeDecisao4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double num, result;
		
		System.out.println("Digite um n�mero: ");
		num = ler.nextFloat();
		
		if(num%2 == 0) {
			
			if(num<0) {
				
				System.out.println("N�o � poss�vel tirar a ra�z quadrada de um n�mero negativo, "
						+ "vamos considerar esse n�mero como se ele fosse positivo");
				
				num = num*-1;

			}
			
			result = Math.sqrt(num);
			
			System.out.printf("O n�mero %2.2f � par, sua raiz quadrada �: %2.2f",num,result);
			
		}
		else {
			
			result = Math.pow(num, 2);
			
			System.out.printf("O n�mero %2.2f � �mpar, seu valor elevado ao quadrado �: %2.2f",num,result);
			
		}
		
	}
	
}
