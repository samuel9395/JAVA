import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System. in);
		
		System.out.println("VAMOS SOMAR?");
		
		System.out.println("Digite um número:");
		int num1 = sc.nextInt();
		System.out.println("Digite outro número:");
		int num2 = sc.nextInt();
		int resultadoA= num1+num2;
		System.out.println("O resultado da Adição é:" +resultadoA);

		System.out.println("VAMOS SUBTRAIR?");
		System.out.println("Digite um número:");
		int num3 = sc.nextInt();
		System.out.println("Digite outro número:");
		int num4 = sc.nextInt();
		int resultadoS= num3-num4;
		System.out.println("O resultado da Subtração é:" +resultadoS);

		System.out.println("VAMOS MULTIPLICAR?");
		System.out.println("Digite um número:");
		int num5 = sc.nextInt();
		System.out.println("Digite um número:");
		int num6 = sc.nextInt();
		int resultadoM= num5*num6;
		System.out.println("O resultado da Multiplicação é:" +resultadoM);
		
		System.out.println("VAMOS DIVIDIR?");
		System.out.println("Digite um número:");
		double num7 = sc.nextInt();
		System.out.println("Digite um número:");
		double num8 = sc.nextInt();
		double resultadoD= num7/num8;
		System.out.println("O resultado da Multiplicação é:" +resultadoD);
		
		sc.close();
	}

}
