package aulas;

import java.util.Scanner;

public class ArrayBidmensional11022022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int[][] numeros = new int[2][3];
		int linha,coluna,quantPar=0,somaImpar=0;
		
		for(linha=0;linha<2;linha++) // For encadeado
		{
			for(coluna=0;coluna<3;coluna++) // For encadeado
			{
				System.out.println("\nEntre com um n�mero: ");
				numeros[linha][coluna] = ler.nextInt();
				
				if(numeros[linha][coluna] % 2 ==0)
				{
					quantPar++;
				}
				else
				{
					somaImpar += numeros[linha][coluna]; // somaImpar = somaImpar + numeros[linha][coluna]
				}
			
				
			}
		}
		
		System.out.println("\nQuantidade de n�meros pares: "+quantPar);
		System.out.println("\nSomat�rio dos n�meros �mpares: "+somaImpar);
		
	}

}
