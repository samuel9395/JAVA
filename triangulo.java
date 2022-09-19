import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("RETÂNGULO");
		
		System.out.println("Digite a altura do retângulo:");
		int altura = sc.nextInt();
		
		System.out.println("Digite a base do retângulo:");
		int base= sc.nextInt();
		
		int area= base*altura/2;
		System.out.println("A área do retângulo é: " +area+"m2");

		sc.close();
		
	}
		
}
