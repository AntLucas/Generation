package LacosDeRepeticao;

	import java.util.Scanner;

public class LacosDeRepeticao3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, cont21=0, cont50=0;
		
		System.out.println("Digita a idade de uma pessoa: ");
		idade = ler.nextInt();
		
		while(idade != -99 && idade < 0) {
			
			System.out.println("Idade incorreta, digite uma idade correta, ou o valor -99 para encerrar: ");
			idade = ler.nextInt();
			
		}
		
		while(idade != -99 ) {
			
			if(idade < 21) {
				cont21 ++;
			}
			else if(idade > 50) {
				cont50 ++;
			}
			
			System.out.println("Digita a idade de uma pessoa: ");
			idade = ler.nextInt();
			
			while(idade != -99 && idade < 0) {
				
				System.out.println("Idade incorreta, digite uma idade correta, ou o valor -99 para encerrar: ");
				idade = ler.nextInt();
				
			}
			
		}
		
		System.out.println(cont21+" pessoas tem menos de 21 anos e "+cont50+" pessoas tem mais de 50 anos");
		
	}
	
}
