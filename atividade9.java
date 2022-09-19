package Tarefa4;

import java.util.Scanner;

public class atividade9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite o valor do salário mensal:");
				int SM=sc.nextInt();
				
			System.out.println("Digite o valor de reajuste:");
				int PR=sc.nextInt();
				
				
				int NS=(PR*SM)/100+SM;
			System.out.println("O novo salário é:"+"R$"+NS);
		
		sc.close();
		
	}

}
