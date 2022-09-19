package Tarefa4;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Digite o valor de A:");
			int a=sc.nextInt();
			
			System.out.println("Digite o valor de B:");
			int b=sc.nextInt();
			
			System.out.println("Digite o valor de C:");
			int c=sc.nextInt();
		
			int SomaQuadrado=(a*a)+(b*b)+(c*c);
			System.out.println("A soma dos quadrados dos valores é: "+SomaQuadrado);
			
		sc.close();
		
	}

}
