package Tarefa3;

import java.util.Scanner;

public class celcius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite a temperatura em grau Fahrenheit:");
				int f= (sc.nextInt()-32)*5/9;
				int c=f;
			
			System.out.println("A temperatura em Celsius é: "+c+"°C");
			
		sc.close();
		
		
		
	}

}
