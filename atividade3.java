package Tarefa4;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int A=sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		int B=sc.nextInt();
		
		int q=A-B;
		int d=q*q;
		
		System.out.println("A diferença entre o quadrado de A para B é: "+d);
		
		sc.close();
		
	}

}
