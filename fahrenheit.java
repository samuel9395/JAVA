package Tarefa3;

import java.util.Scanner;

public class fahrenheit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Digite a temperatura em grau Celcius:");
				int c = (sc.nextInt()*9/5)+32;
				int f= c;
				
			System.out.println("A temperatura em Fahrenheit é: "+f+"°F");
			
		sc.close();
		
		
	}

}
