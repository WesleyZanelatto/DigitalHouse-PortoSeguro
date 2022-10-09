package exercicios;

import java.util.Scanner;

public class Exc2_13CalculeSomaDeTodosNumerosDe1ateEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* do while
		 * Faça um programa que pegue um número do teclado e calcule a soma de todos os
		 * números de 1 até ele. Ex.: O usuário entra 7, o programa vai mostrar 28, 
		 * pois 1+2+3+4+5+6+7=28.
		 */
		
		Scanner ler = new Scanner (System.in);
		
		int valorInicial=1,valorUsuario,somatorio=0;
				
		System.out.printf("\nDigite um número: ");
		valorUsuario = ler.nextInt();
						
		do
		{
			somatorio += valorInicial;
			valorInicial++;
		}
		while(valorInicial<=valorUsuario);
		
		System.out.println("\nResultado = "+somatorio);
	}

}
