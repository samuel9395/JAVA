package Tarefa4;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da cotação do Dólar:");
		float CDolar=sc.nextFloat();
		
		System.out.println("Digite o seu saldo em Dólares:");
		float SaldoDolar=sc.nextFloat();

		float real=SaldoDolar*CDolar;
		System.out.println("Seu saldo em Rais são: "+"R$"+real+" reais...");


		sc.close();

	}
}