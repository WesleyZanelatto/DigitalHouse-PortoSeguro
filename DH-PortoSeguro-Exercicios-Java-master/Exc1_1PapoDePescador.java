package exercicios;

import java.util.Scanner;

public class Exc1_1PapoDePescador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
		  Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
		  deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável 
		  P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
		  da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		 */

		Scanner ler = new Scanner(System.in);
		
		float P=0,E=0,M=0; // "P" Variável peso de tomate | "E" Variável Excesso | "M" Variável valor da multa
		
		System.out.println("\nDigite a quantidade de tomate: ");
		P = ler.nextFloat();
		
		if(P>50)
		{
			E = P-50;
			M = E*4;			
			System.out.printf("\nPeso excedente: %.2f\nMulta pelo peso excedente: %.2f",E,M);
		}
		else
		{
			System.out.printf("\nValor 'E' Excesso: %.2f\nValor 'M' Multa: %.2f",E,M);
		}
		
	}

}
