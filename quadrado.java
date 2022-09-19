import java.util.Scanner;

public class quadrado {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Quadrado");
			
			System.out.println("Digite a dimensão lateral do quadrado:");
				int L1=sc.nextInt();
				
			System.out.println("Digite a dimensão da base do quadrado:");
				int L2=sc.nextInt();
				
				int area= L1*L2;
			
			System.out.println("A área do quadrado é: "+area+"m2");
		}
			

	}

}
