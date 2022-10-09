package exercicios;

import java.util.Scanner;

public class Exc1_1PapoDePescador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho.
		  Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) 
		  deve pagar uma multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel 
		  P (peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor
		  da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
		 */

		Scanner ler = new Scanner(System.in);
		
		float P=0,E=0,M=0; // "P" Vari�vel peso de tomate | "E" Vari�vel Excesso | "M" Vari�vel valor da multa
		
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
