import java.util.Scanner;

public class atividadesucessor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor:");
		int num = sc.nextInt();
		int sucessor=num+1;
		System.out.println("O sucessor do número digitado é " +sucessor);
		
		System.out.println("Digite um valor:");
		int num1 = sc.nextInt();
		int antecessor=num1-1;
		System.out.println("O sucessor do número digitado é " +antecessor);
		
		sc.close();
	}

}
