package exercicios;

import java.util.Scanner;

public class Exc1_7TrianguloBaseAlturaPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 7)	Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos (positivos maiores que zero).
		  Em caso afirmativo, calcular a �rea do tri�ngulo.
		 */

		Scanner ler = new Scanner(System.in);
		
		float base=0,altura=0;
		
		System.out.println("\n\t!!!Calculando a �rea de um tri�ngulo!!!");
		
		System.out.println("\nDigite a base do tri�ngulo: ");
		base = ler.nextFloat();
		System.out.println("\nDigite a altura do tri�ngulo: ");
		altura = ler.nextFloat();
		
		if(base>0 && altura>0)
		{
			//x = base*altura/2;
			System.out.printf("\nBase: %.2f \nAltura: %.2f \nA �rea do tr�ngulo �: %.2f",base,altura,base*altura/2);
		}
		else
		{
			System.out.println("\n***Voc� digitou algum n�mero negativo, por gentileza repita a opera��o***");
		}
	}

}
