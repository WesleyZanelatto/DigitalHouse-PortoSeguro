package exercicios;

import java.util.Scanner;

public class IfElseEncadeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem
		 indicando se este n�mero � par ou �mpar, e se e positivo ou negativo.
		 */
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
	System.out.println("\nEntre com um n�mero inteiro: ");
	numero = ler.nextInt();
	
	if (numero % 2 == 0 && numero >= 0)
	{
		System.out.printf("O n�mero %d � par e positivo",numero);
	}
	else if((numero % 2 == 0 && numero <= 0))
	{
		System.out.printf("O n�mero %d � par e negativo",numero);
	}
	else if((numero % 2 != 0 && numero >= 0))
	{
		System.out.printf("O n�mero %d � �mpar e positivo",numero);
	}
	else
	{
		System.out.printf("O n�mero %d � �mpar e negativo",numero);
	}

		
	}

}
