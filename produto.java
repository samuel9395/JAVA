package Tarefa3;

import java.util.Scanner;

public class produto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			System.out.println("Digite o valor do produto");
			int v=sc.nextInt();
			
		System.out.println("Digite o valor da taxa de prestação do produto");
			int t=sc.nextInt();
			
		System.out.println("Digite a quantidade de prestações do produto");
			int q=sc.nextInt();
			
			int p=v+(v*t/100)*q;
		System.out.println("O valor da prestação em atraso é: "+"R$"+p);
		
		sc.close();
	}

}
