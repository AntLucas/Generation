package LacosDeRepeticao;

	import java.util.Scanner;

public class LacosDeRepeticao4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, sexo, adjetivo, mulherNerv = 0, homemAgre = 0, outrosCalm = 0, cont = 0, calmo = 0, nerv40 = 0, calmo18 = 0;
		
		while(cont < 5) {
			
			System.out.println("Digite a sua idade");
			idade = ler.nextInt();
			
			while(idade < 0) {
				
				System.out.println("\nIdade incorreta, digite uma idade correta: ");
				idade = ler.nextInt();
				
			}
			
			System.out.println("\nDigite o número referente ao seu sexo - 1-Feminino, 2-Masculino ou 3-Outros: ");
			sexo = ler.nextInt();
			
			while(sexo != 1 && sexo != 2 && sexo != 3) {
				
				System.out.println("\nnúmero incorreto, digite o número referente ao seu sexo - "
						+ "1-Feminino, 2-Masculino ou 3-Outros: ");
				sexo = ler.nextInt();
				
			}
			
			System.out.println("\nDigite 1 se você é uma pessoa calma, 2 se você é uma pessoa nervosa ou 3"
					+ " se você é uma pessoa agressiva: ");
			adjetivo = ler.nextInt();
			
			while(adjetivo != 1 && adjetivo != 2 && adjetivo != 3) {
				
				System.out.println("\nnúmero incorreto, digite 1 se você é uma pessoa calma, 2 se você é uma"
						+ " pessoa nervosa ou 3 se você é uma pessoa agressiva: ");
				adjetivo = ler.nextInt();
				
			}
			
			if(adjetivo == 1) {
				
				calmo++;
				
				if(idade < 18) {
					
					calmo18++;
					
				}
				
				if(sexo == 3) {
					
					outrosCalm++;
					
				}
				
			}
			
			else if(adjetivo == 2) {
				
				if (sexo == 1) {
					
					mulherNerv++;
					
				}
				
				if(idade > 40) {
					
					nerv40++;
					
				}
				
			}
			
			else {
				
				if(sexo == 2) {
					
					homemAgre++;
					
				}
				
			}
			
			System.out.println("\n\n");
			
			cont++;
			
		}
		
		System.out.println("O número total de pessoas calmas é: "+calmo+", \no número de mulheres nervosas é: "
				+mulherNerv+ ", \no número de homens agressivos é: "+homemAgre+", \no número de outros"
						+ " calmos é: "+outrosCalm+", \no número de pessoas nervosas com mais de 40 anos é: "
								+nerv40+ ", \no número de pessoas calmas com menos de 18 anos é: "+calmo18);
		
	}
	
}
