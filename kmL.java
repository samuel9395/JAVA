package Tarefa3;

import java.util.Scanner;

public class kmL {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
				float kml=12;
				System.out.println("Informe o tempo(minutos) de viagem");
				float t=sc.nextFloat();
				System.out.println("Informe a velocidade média durante a viagem");
				float v=sc.nextFloat();
				float d=t*v/120;
				float lu=d/kml;
				double etanol= 3.60*lu;
				System.out.println("A velocidade média durante a viagem é de : "+v+"km...");
				System.out.println("O tempo gasto na viagem: "+t+"min...");
				System.out.println("A distancia percorrida na viagem é de : "+d+"km...");
				System.out.println("A quantidade de litros gasta em uma viagem é de : "+lu+"L...");
				System.out.println("O valor de combustivel gasto na viagem é de : "+"R$"+etanol+"...");
				
		sc.close();
						
	}

}
