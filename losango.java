import java.util.Scanner;

public class losango {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Losango;");
			
				System.out.println("Digite a diagonal(D) maior do losango:");
					int D=sc.nextInt();
				
				System.out.println("Digite a diagonal menor do losango:");
					int d=sc.nextInt();
					
					int area=D*d/2;
					
				System.out.println("A área do losango é: "+area+"m");
		sc.close();

	}

}
