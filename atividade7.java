package Tarefa4;

import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Digite o valor de A:");
			int a=sc.nextInt();
			
			System.out.println("Digite o valor de B:");
			int b=sc.nextInt();
			
			System.out.println("Digite o valor de C:");
			int c=sc.nextInt();
		
			int SomaQuadrado=a+b+c;
			int QuadradoSoma=SomaQuadrado*SomaQuadrado;
			System.out.println("A soma dos quadrados dos valores é: "+QuadradoSoma);
			
		sc.close();
		
	}

}
