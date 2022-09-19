import java.util.Scanner;

public class circulo {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
		System.out.println("Circulo;");
		
		System.out.println("Digite o valor do raio do circulo:");
			float r=sc.nextFloat();
		
		System.out.println("Digite o valor da constante do do circulo:");
			float Pi=sc.nextFloat();
			
			float a=Pi*(r*r);
		System.out.println("A área do circulo corresponde á: "+a+" m2");
		
	sc.close();
			
	}

}
