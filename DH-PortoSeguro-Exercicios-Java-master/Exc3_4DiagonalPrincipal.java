package exercicios;

import java.util.Scanner;

public class Exc3_4DiagonalPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		 * em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal,
		 * ou seja, diagonal principal.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int linha=0,coluna=0,cont=1,somaMatriz=0,somaDiagonal=0;
		
		//Imprimir na tela
		System.out.println("\n****Digite 9 valores ****\n");
		
		//01-Captação de dados
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.printf("Digite o %dº valor: ",cont);
				matriz[linha][coluna] = ler.nextInt();
				cont++;
			}
		}//01-Fecha captação de dados
		
		//Imprimir divisor de tela
		System.out.println("***************************************");
		
		//02-Soma dos valores da matriz e a Soma da diagonal principal
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				somaMatriz += matriz[linha][coluna];
				
				//Soma da diagonal principal
				if(linha==coluna)
				{
					somaDiagonal += matriz[linha][coluna]; 
				}//Fecha soma da diagonal principal
				
				//Imprimir as linhas e colunas com seus respectivos valores
				System.out.println("Linha "+linha+" e Coluna "+coluna+" da matriz = "+matriz[linha][coluna]);
			}
		}//02-Fecha a soma da matriz e diagonal principal
		
		//Imprimir divisor de tela
		System.out.println("***************************************");
		
		//Imprimir a soma dos valores da matriz
		System.out.println("\nSoma dos valores da matriz = "+somaMatriz);
		
		//Imprimir diagonal principal
		System.out.println("Soma da diagonal principal = "+somaDiagonal);
	}
}
