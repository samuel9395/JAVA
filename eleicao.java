package Tarefa3;

import java.util.Scanner;

public class eleicao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite o número total de eleitores:");
				int t=sc.nextInt();
				
			System.out.println("Digite o número total de votos em branco:");
				float b=sc.nextInt();

			 	
			System.out.println("Digite o número total de votos nulos:");
				float n=sc.nextInt();
		
			System.out.println("Digite o número total de votos válidos:");
			 	float v=sc.nextInt();
		
			 	float pb=b/t*100;
			 	float pn=n/t*100;
			 	float pv=v/t*100;
			 	float nv=(t-(b+n+v))/t*100;
			 
			 	
			System.out.println("O número percentual de votos em branco foram: "+pb+"%");
			System.out.println("O número percentual de votos nulos foram: "+pn+"%");
			System.out.println("O número percentual de votos válidos foram: "+pv+"%");
			System.out.println("O número percentual de pessoas que não votaram são: "+nv+"%");
			
		sc.close();
		
	}

}
