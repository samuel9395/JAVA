package Tarefa3;

import java.util.Scanner;

public class carro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o custo de fábrica do veículo:");
				float cf=sc.nextFloat();
				System.out.println("Digite a porcentagem sobre o custo de distribuição do veículo:");
				float cd=sc.nextFloat()/100*cf;
				System.out.println("Digite a procentagem sobre o valor do imposto sobre o custo de fábrica veículo:");
				float ci=sc.nextFloat()/100*cf;
				float custoImposto=cd+ci;
				System.out.println("Custo de impostos sobre a fabricação do veículo é: "+"R$"+custoImposto+" reais");
				float custoc=cf+cd+ci;
			System.out.println("O custo de um carro novo ao consumidor é: "+"R$"+custoc+" reais");
		sc.close();
				
	}

}
