import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System. in);
		
		System.out.println("RETÂNGULO");
		
		System.out.println("Digite a altura do retângulo:");
		float altura = sc.nextFloat();
		
		System.out.println("Digite a base do retângulo:");
		float base= sc.nextFloat();
		
		float area= altura*base;
		System.out.println("A área do retângulo é: " +area);

		sc.close();
	
	}

}
