package LacosDeRepeticao;

	import java.util.Scanner;

public class LacosDeRepeticao6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma3 = 0, cont = 0;
		double media;
		
		do {
			
			System.out.println("Digite um n�mero inteiro, digite 0 para finalizar: ");
			num = ler.nextInt();
			
			if(num%3 == 0 && num !=0) {
			
				soma3 = soma3 + num;
				
				cont++;
			
			}
			
			
		} while(num!=0);
		
		media = 1.0*soma3/cont;
		
		System.out.printf("\nA m�dia dos n�meros m�ltiplos de 3 �: %.2f",media);
		
	}
	
}
