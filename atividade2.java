package Tarefa4;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da caixa:");
		int c=sc.nextInt();
		
		System.out.println("Digite a altura da caixa:");
		int h=sc.nextInt();
		
		System.out.println("Digite a largra da caixa:");
		int l=sc.nextInt();
		
		int Volume=c*h*l;
		
		System.out.println("O volume da caixa retangular é: "+Volume);
		
		sc.close();
		
	}

}
