package exercicios;

import java.util.Scanner;

public class Exc1_4ParImparPositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
		 */

		Scanner ler = new Scanner(System.in);
		
		int n;
		
	System.out.println("\nEntre com um número inteiro: ");
	n = ler.nextInt();
	
	if (n % 2 == 0 && n >= 0)
	{
		System.out.printf("O número %d é par e positivo",n);
	}
	else if((n % 2 == 0 && n <= 0))
	{
		System.out.printf("O número %d é par e negativo",n);
	}
	else if((n % 2 != 0 && n >= 0))
	{
		System.out.printf("O número %d é ímpar e positivo",n);
	}
	else
	{
		System.out.printf("O número %d é ímpar e negativo",n);
	}
	}

}
