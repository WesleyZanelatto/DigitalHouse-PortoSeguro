package exercicios;

import java.util.Scanner;

public class Exc3_1VetorPontuacaoDeUmaAtividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade
		 * e o escreva em seguida.Encontre ap�s a maior pontua��o e a apresente.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int[] valores = new int[6];
		int i,j,aux;
		
		//Imprimir na tela
		System.out.println("\n***Digite 5 valores***\n");
		
		//01-La�o para receber os valores digitados
		for(i=1;i<valores.length;i++)
		{
			System.out.println("Digite o "+i+"� valor: ");
			valores[i] = ler.nextInt();
		}//01-Ecerramento desse la�o
		
		//Imprimir uma divis�o na tela
		System.out.println("********************************************");
		
		//02-La�o para imprimir as pontua��es
		for(i=1;i<valores.length;i++)
		{
			System.out.println(+i+"� pontua��o = "+valores[i]);	
		}//02-Encerramento desse la�o
		
		//Imprimir uma divis�o na tela
		System.out.println("********************************************");
		
		//03-La�o para colocar as pontua��es em ordem crescente
		for(i=1;i<valores.length;i++)
		{
			for(j=i+1;j<valores.length;j++)
			{
				if(valores[i]>valores[j])
				{
					aux=valores[i];
					valores[i]=valores[j];
					valores[j]=aux;
				}
			}
		}//03-Encerramento desse la�o
		
		//Imprimir na tela a maior pontua��o
		System.out.println("\nMaior pontua��o: "+valores[5]);		
		
	}

}
