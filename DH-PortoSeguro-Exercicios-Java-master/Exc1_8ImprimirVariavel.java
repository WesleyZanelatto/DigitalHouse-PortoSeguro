package exercicios;

import java.util.Scanner;

public class Exc1_8ImprimirVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 8)	Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, 
		 caso contrário imprimi-la com o valor zero.
		 */

		Scanner ler = new Scanner(System.in);
		
		float N=0;
		
		System.out.println("\nDigite um valor: ");
		N = ler.nextFloat();
		
		if(N>100)
		{
			System.out.printf("\nO valor digitado foi: %.2f",N);
		}
		else
		{
			N=0;
			System.out.printf("\nN=%1.0f",N);
		}
	}

}
