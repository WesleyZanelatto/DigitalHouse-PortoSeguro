package exercicios;

import java.util.Scanner;

public class IfElseEncadeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Faça um sistema que leia um número inteiro e mostre uma mensagem
		 indicando se este número é par ou ímpar, e se e positivo ou negativo.
		 */
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
	System.out.println("\nEntre com um número inteiro: ");
	numero = ler.nextInt();
	
	if (numero % 2 == 0 && numero >= 0)
	{
		System.out.printf("O número %d é par e positivo",numero);
	}
	else if((numero % 2 == 0 && numero <= 0))
	{
		System.out.printf("O número %d é par e negativo",numero);
	}
	else if((numero % 2 != 0 && numero >= 0))
	{
		System.out.printf("O número %d é ímpar e positivo",numero);
	}
	else
	{
		System.out.printf("O número %d é ímpar e negativo",numero);
	}

		
	}

}
