package LacosDeRepeticao;

	import java.util.Scanner;

public class LacosDeRepeticao2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int []impar = new int[10];
		int []par = new int[10];
		int contPar=0, contImpar=0, num;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite um n�mero inteiro: ");
			num = ler.nextInt();
			
			if(num%2 == 0) {
				
				par[contPar] = num;
				contPar++;
				
			}
			else {
				
				impar[contImpar] = num;
				contImpar++;
				
			}
			
		}
		
		System.out.println("Foram digitados "+contPar+" n�mero pares e "+contImpar+" n�meros �mpares");
		
		System.out.println("\nN�mero Pares: ");
		
		for(int i = 0; i < contPar; i++) {
			
			System.out.print(par[i]+" ");
			
		}
		
		System.out.println("\nN�mero �mpares: ");
		for(int i = 0; i < contImpar; i++) {
			
			System.out.print(impar[i]+" ");
			
		}
		
	}

}
