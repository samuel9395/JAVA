package Tarefa4;

import java.util.Scanner;

public class atividade10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite o número total de eleitores de Sicero:");
				float EleitoreSiceros=sc.nextFloat();
			System.out.println("Digite o número total de votos nulos do candidato Sicero:");
				float NuloSicero=sc.nextFloat();
			System.out.println("Digite o número total de votos em branco do candidato Sicero:");
				float BrancoSicero=sc.nextFloat();
				
			System.out.println("Digite o número total de eleitores de Tereza:");
				float EleitoreTereza=sc.nextFloat();
			System.out.println("Digite o número total de votos nulos do candidato Tereza:");
				float NuloTereza=sc.nextFloat();
			System.out.println("Digite o número total de votos em branco do candidato Tereza:");
				float BrancoTereza=sc.nextFloat();

			System.out.println("Digite o número total de eleitores de João:");
				float EleitoreJoao=sc.nextFloat();
			System.out.println("Digite o número total de votos nulos do candidato João:");
				float NuloJoao=sc.nextFloat();
			System.out.println("Digite o número total de votos em branco do candidato João:");
				float BrancoJoao=sc.nextFloat();
				
			//TOTAL ELEITORES
			float TotalEleitores=EleitoreSiceros+EleitoreTereza+EleitoreJoao;
			float Totalbranco=BrancoJoao+BrancoSicero+BrancoTereza;
			float Totalnulo=NuloJoao+NuloSicero+NuloTereza;
			
			//PERCENTUAL DE VOTOS VÁLIDOS TOTAL 
			float PvSicero=(EleitoreSiceros-BrancoSicero-NuloSicero)/EleitoreSiceros*100;
			float PvJoao=(EleitoreJoao-NuloJoao-BrancoJoao)/EleitoreJoao*100;
			float PvTereza=(EleitoreTereza-NuloTereza-BrancoTereza)/EleitoreTereza*100;
			//PERCENTUAL DE VOTOS EM BRANCO 
			float PbSicero=(BrancoSicero/EleitoreSiceros)*100;
			float PbJOAO=(BrancoJoao/EleitoreJoao)*100;
			float PbTereza=(BrancoTereza/EleitoreTereza)*100;
			//PERCENTUAL DE VOTOS NULOS
			float PnSicero=(NuloSicero/EleitoreSiceros)*100;
			float PnJoao=(NuloJoao/EleitoreJoao)*100;
			float PnTereza=(NuloTereza/EleitoreTereza)*100;
			
			//TOTAIS
			System.out.println("TOTAL ELEITORES: "+TotalEleitores);
			System.out.println("TOTAL DE VOTOS NULOS "+Totalnulo);
			System.out.println("TOTAL DE VOTOS EM BRANCO: "+Totalbranco);
			//VÁLIDOS
			System.out.println("PERCENTUAL DE VOTOS VÁLIDOS SICERO: "+PvSicero+"%");
			System.out.println("PERCENTUAL DE VOTOS VÁLIDOS JOÃO: "+PvJoao+"%");
			System.out.println("PERCENTUAL DE VOTOS VÁLIDOS TEREZA: "+PvTereza+"%");
			//NULOS
			System.out.println("PERCENTUAL DE VOTOS NULOS SÍCERO: "+PnSicero+"%");
			System.out.println("PERCENTUAL DE VOTOS NULOS JOÃO: "+PnJoao+"%");
			System.out.println("PERCENTUAL DE VOTOS NULOS TEREZA: "+PnTereza+"%");
			//BRANCOS
			System.out.println("PERCENTUAL DE VOTOS EM BRANCO SÍCERO: "+PbSicero+"%");
			System.out.println("PERCENTUAL DE VOTOS EM BRANCO JOÃO: "+PbJOAO+"%");
			System.out.println("PERCENTUAL DE VOTOS EM BRANCO TEREZA: "+PbTereza+"%");
			
			
		sc.close();
		
	}

}
