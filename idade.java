package Tarefa3;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite a sua idade:");
				int i=sc.nextInt();
				int d=i*365;
				int m=d/30;
				
			System.out.println(+i+" Anos...");
			System.out.println(+m+" Meses...");
			System.out.println(+d+" Dias...");
			
		sc.close();
		
		
	}

}
