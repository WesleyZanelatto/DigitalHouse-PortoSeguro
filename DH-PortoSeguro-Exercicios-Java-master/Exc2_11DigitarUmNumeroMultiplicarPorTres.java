package exercicios;

import java.util.Scanner;

public class Exc2_11DigitarUmNumeroMultiplicarPorTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ENQUANTO
		 * Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
		 * três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
		 * digita 5, devemos observar na tela a seguinte sequência: 5 15 45 135.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int n=0;
				
		System.out.println("\nDigite um numero: ");
		n = ler.nextInt();
		
		System.out.println("***************************");
		System.out.printf("%d ",n);
		
		while(n>0 && n<=100)
		{
			n *= 3;
			System.out.printf("%d ",n);
			
		}
			
	}

}
