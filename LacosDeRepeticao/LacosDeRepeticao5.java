package LacosDeRepeticao;

	import java.util.Scanner;

public class LacosDeRepeticao5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float num, soma = 0;
		
		do {
			
			System.out.println("Digite um número para ser somado, digite 0 para finalizar: ");
			num = ler.nextFloat();
			
			soma = soma + num;
			
		} while(num!=0);
		
		System.out.println("\nA soma total dos números é: "+soma);
		
	}
	
}
