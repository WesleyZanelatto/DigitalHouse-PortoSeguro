package exercicios;

import java.util.Scanner;

public class Exc2_5EncontrarZeroSomarNumerosDigitados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crie um programa que leia um número do teclado até que encontre um número
		  igual a zero. No final, mostre a soma dos números digitados. (DO...WHILE)
		*/

		Scanner ler = new Scanner(System.in);
		
		int n,x=0,soma=0;
		
		System.out.println("\nDigite os valores desejado e para sair digite 0(zero)\n");
		
		do
		{
			x++;
			System.out.println("Digite o "+x+"º numero: ");
			n=ler.nextInt();
			
			soma+=n;			
			
		}
		while(n!=0);
		
		System.out.println("\nSoma dos valores digitados= "+soma);
		
	}

}
