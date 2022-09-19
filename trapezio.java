import java.util.Scanner;

public class trapezio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Trapézio;");
			
			System.out.println("Digite o valor da base Maior do trapézio:");
				int B=sc.nextInt();
				
			System.out.println("Digite o valor da base menor do trapézio:");
				int b=sc.nextInt();
				
			System.out.println("Digite o valor da altura do trapézio:");
				int h=sc.nextInt();
				
				int a=(B+b)*h/2;
				
			System.out.println("A área do trapézio é: "+a+"m");
		sc.close();

			
	}

}
