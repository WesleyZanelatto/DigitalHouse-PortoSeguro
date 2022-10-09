package exercicios;

import java.util.Scanner;

public class Exc1_3CalculeQuadradoDeCadaUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */

		Scanner ler = new Scanner(System.in);
		
		double n1=0,n2=0,n3=0,n4=0,t=0;
		
		System.out.println("\nDigite 4 números inteiros: ");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		n4 = ler.nextInt();
				
		t = Math.pow(n3,2);
		
		if(t>=1000)
		{
			System.out.printf("\nO terceiro valor digitado é: %.2f portanto o seu quadrado é: %.2f",n3,Math.pow(n3,2));
		}
		else
		{
			System.out.printf("\nO primeiro valor digitado é: %.2f portanto o seu quadrado é: %.2f",n1,Math.pow(n1,2));
			System.out.printf("\nO segundo valor digitado é: %.2f portanto o seu quadrado é: %.2f",n2,Math.pow(n2,2));
			System.out.printf("\nO terceiro valor digitado é: %.2f portanto o seu quadrado é: %.2f",n3,Math.pow(n3,2));
			System.out.printf("\nO quarto valor digitado é: %.2f portanto o seu quadrado é: %.2f",n4,Math.pow(n4,2));
		}
	}

}
