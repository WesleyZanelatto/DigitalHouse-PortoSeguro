package exercicios;

import java.util.Scanner;

public class Exc1_4ParImparPositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.
		 */

		Scanner ler = new Scanner(System.in);
		
		int n;
		
	System.out.println("\nEntre com um n�mero inteiro: ");
	n = ler.nextInt();
	
	if (n % 2 == 0 && n >= 0)
	{
		System.out.printf("O n�mero %d � par e positivo",n);
	}
	else if((n % 2 == 0 && n <= 0))
	{
		System.out.printf("O n�mero %d � par e negativo",n);
	}
	else if((n % 2 != 0 && n >= 0))
	{
		System.out.printf("O n�mero %d � �mpar e positivo",n);
	}
	else
	{
		System.out.printf("O n�mero %d � �mpar e negativo",n);
	}
	}

}
