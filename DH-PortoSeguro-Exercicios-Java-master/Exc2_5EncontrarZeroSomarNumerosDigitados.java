package exercicios;

import java.util.Scanner;

public class Exc2_5EncontrarZeroSomarNumerosDigitados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero
		  igual a zero. No final, mostre a soma dos n�meros digitados. (DO...WHILE)
		*/

		Scanner ler = new Scanner(System.in);
		
		int n,x=0,soma=0;
		
		System.out.println("\nDigite os valores desejado e para sair digite 0(zero)\n");
		
		do
		{
			x++;
			System.out.println("Digite o "+x+"� numero: ");
			n=ler.nextInt();
			
			soma+=n;			
			
		}
		while(n!=0);
		
		System.out.println("\nSoma dos valores digitados= "+soma);
		
	}

}
