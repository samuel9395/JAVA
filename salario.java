package Tarefa3;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite o salário atual do funcionário:");
				int a=sc.nextInt();
		
			System.out.println("Digite o percentual de reajuste:");
				int p=sc.nextInt();
				
				int r=(p*a)/100+a;
			
			System.out.println("O reajuste do salário do funcionário é: "+"R$"+r+" reais");
			
		sc.close();
		
	}

}
