package exercicios;

import java.util.Scanner;

public class Exc1_6DadaIdadeNadador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos
		 */

		Scanner ler = new Scanner(System.in);
		
		int idade=0;
		
		System.out.println("\nDigite a idade do nadador: ");
		idade = ler.nextInt();
		
		if(idade>=5 && idade<=7)
		{
			System.out.println("\n\tInfantil A");
		}
		else if(idade>=8 && idade<=11)
		{
			System.out.println("\n\tInfantil B");
		}
		else if(idade>=12 && idade<=13)
		{
			System.out.println("\n\tJuvenil A");
		}
		else if(idade>=14 && idade<=17)
		{
			System.out.println("\n\tJuvenil B");
		}
		else if(idade>=18)
		{
			System.out.println("\n\tAdulto");
		}
		else
		{
			System.out.println("\n\t***Atenção este nadador é menor de 5 anos, portanto não há classificação***");
		}
	}

}
