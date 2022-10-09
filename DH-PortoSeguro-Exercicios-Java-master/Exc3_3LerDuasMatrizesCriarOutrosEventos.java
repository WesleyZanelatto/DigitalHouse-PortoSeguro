package exercicios;

import java.util.Scanner;

public class Exc3_3LerDuasMatrizesCriarOutrosEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escreva um programa que l� duas matrizes N1(4,6) e N2(4,6 e criar:
		 * 
		 * a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o das matrizes N1 e N2;
		 * 
		 * b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma posi��o das matrizes N1 e N2.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		int linha=0,coluna=0,cont=1;
		
		//Imprimir na tela
		System.out.println("\n***Digite 24 valores***\n");
		
		//01-Capta��o de dados
		for(linha=0;linha<4;linha++) 
		{
			for(coluna=0;coluna<6;coluna++) 
			{
				System.out.println("Digite o "+cont+"� valor: ");
				N1[linha][coluna] = ler.nextInt();
				cont++;
			}
		}//01-Fecha cata��o de dados
		
		//Imprimir divisor de tela
		System.out.println("********************************************************************************\n\n\t\t\t\t*** Soma ***\n");
		
		//02-Soma
		for(linha=0;linha<4;linha++) 
		{
			for(coluna=0;coluna<6;coluna++) 
			{
				N2[linha][coluna] = N1[linha][coluna];
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				System.out.println("Linha "+linha+" e Coluna "+coluna+" de N1 = "+N1[linha][coluna]+
								   " --> Linha "+linha+" e Coluna "+coluna+" de N2 = "+N2[linha][coluna]+
								   " --> N1 + N2 = "+M1[linha][coluna]);
			}
		}//02-Fecha Soma
		
		//Imprimir divisor de tela
		System.out.println("********************************************************************************\n\n\t\t\t\t*** Subtra��o ***\n");
		
		//03-Subtra��o
		for(linha=0;linha<4;linha++) 
		{
			for(coluna=0;coluna<6;coluna++) 
			{
				N2[linha][coluna] = N1[linha][coluna];
				M1[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
				System.out.println("Linha "+linha+" e Coluna "+coluna+" de N1 = "+N1[linha][coluna]+
								   " --> Linha "+linha+" e Coluna "+coluna+" de N2 = "+N2[linha][coluna]+
								   " --> N1 - N2 = "+M2[linha][coluna]);
			}
		}//03-Fecha Subtra��o
	}

}
