package exercicios;

import java.util.Scanner;

public class Exc2_13CalculeSomaDeTodosNumerosDe1ateEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* do while
		 * Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os
		 * n�meros de 1 at� ele. Ex.: O usu�rio entra 7, o programa vai mostrar 28, 
		 * pois 1+2+3+4+5+6+7=28.
		 */
		
		Scanner ler = new Scanner (System.in);
		
		int valorInicial=1,valorUsuario,somatorio=0;
				
		System.out.printf("\nDigite um n�mero: ");
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
