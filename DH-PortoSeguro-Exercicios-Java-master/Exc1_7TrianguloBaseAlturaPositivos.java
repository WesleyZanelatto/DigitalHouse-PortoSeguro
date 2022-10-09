package exercicios;

import java.util.Scanner;

public class Exc1_7TrianguloBaseAlturaPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 7)	Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero).
		  Em caso afirmativo, calcular a área do triângulo.
		 */

		Scanner ler = new Scanner(System.in);
		
		float base=0,altura=0;
		
		System.out.println("\n\t!!!Calculando a área de um triângulo!!!");
		
		System.out.println("\nDigite a base do triângulo: ");
		base = ler.nextFloat();
		System.out.println("\nDigite a altura do triângulo: ");
		altura = ler.nextFloat();
		
		if(base>0 && altura>0)
		{
			//x = base*altura/2;
			System.out.printf("\nBase: %.2f \nAltura: %.2f \nA área do trângulo é: %.2f",base,altura,base*altura/2);
		}
		else
		{
			System.out.println("\n***Você digitou algum número negativo, por gentileza repita a operação***");
		}
	}

}
