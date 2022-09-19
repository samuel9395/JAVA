package Tarefa4;

import java.util.Scanner;

public class atividade8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite o valor de A:");
			int A=sc.nextInt();
			
			System.out.println("Digite o valor de B:");
			int B=sc.nextInt();
			
			System.out.println("Digite o valor de C:");
			int C=sc.nextInt();
			
			System.out.println("Digite o valor de D:");
			int D=sc.nextInt();
			
			int P=A+C;
			int S=B+D;
			
			System.out.println("O resultado do produto é: "+P);
			System.out.println("O resultado da soma é: "+S);
			
		sc.close();
		
		
		
	}

}
