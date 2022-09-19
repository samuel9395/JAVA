package Tarefa4;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Digite o valor da variável A");
			int A=sc.nextInt();
			System.out.println("Digite o valor da variável B");
			int B=sc.nextInt();
			System.out.println("Digite o valor da variável C");
			int C=sc.nextInt();
			System.out.println("Digite o valor da variável D");
			int D=sc.nextInt();
			
			int SA1=A+B;
			int SA2=A+C;
			int SA3=A+D;
			
			int SB1=B+C;
			int SB2=B+D;
			
			int SC=C+D;
			
			int MA1=A*B;
			int MA2=A*C;
			int MA3=A*D;
			
			int MB1=B*C;
			int MB2=B*D;
			
			int MC=C*D;
			
			System.out.println("Soma da variáveis;");
			
			System.out.println("O valor da soma das variáveis A+B é: "+SA1);
			System.out.println("O valor da soma das variáveis A+C é: "+SA2);
			System.out.println("O valor da soma das variáveis A+D é: "+SA3);
			System.out.println("O valor da soma das variáveis B+C é: "+SB1);
			System.out.println("O valor da soma das variáveis B+D é: "+SB2);
			System.out.println("O valor da soma das variáveis C+D é: "+SC);
			
			System.out.println("Multiplicação das variáveis;");
			
			System.out.println("O valor da multiplicação das variáveis A*B é: "+MA1);
			System.out.println("O valor da multiplicação das variáveis A*C é: "+MA2);
			System.out.println("O valor da multiplicação das variáveis A*D é: "+MA3);
			System.out.println("O valor da multiplicação das variáveis B*C é: "+MB1);
			System.out.println("O valor da multiplicação das variáveis B*D é: "+MB2);
			System.out.println("O valor da multiplicação das variáveis C*D é: "+MC);
		sc.close();
	}

}
