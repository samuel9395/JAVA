package Tarefa3;

import java.util.Scanner;

public class lata {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite a altura da lata de óleo:");
				int h=sc.nextInt();
				
			System.out.println("Digite o raio de circunferência da lata de óleo:");
				int r=sc.nextInt();
				double v=3.14*(r*r)*h;
				
			System.out.println("O volume da lata de óleo é: "+v);
		
		sc.close();
		
	}

}
