package exercicios;

import java.util.Scanner;

public class Exc3_1VetorPontuacaoDeUmaAtividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade
		 * e o escreva em seguida.Encontre após a maior pontuação e a apresente.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int[] valores = new int[6];
		int i,j,aux;
		
		//Imprimir na tela
		System.out.println("\n***Digite 5 valores***\n");
		
		//01-Laço para receber os valores digitados
		for(i=1;i<valores.length;i++)
		{
			System.out.println("Digite o "+i+"º valor: ");
			valores[i] = ler.nextInt();
		}//01-Ecerramento desse laço
		
		//Imprimir uma divisão na tela
		System.out.println("********************************************");
		
		//02-Laço para imprimir as pontuações
		for(i=1;i<valores.length;i++)
		{
			System.out.println(+i+"ª pontuação = "+valores[i]);	
		}//02-Encerramento desse laço
		
		//Imprimir uma divisão na tela
		System.out.println("********************************************");
		
		//03-Laço para colocar as pontuações em ordem crescente
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
		}//03-Encerramento desse laço
		
		//Imprimir na tela a maior pontuação
		System.out.println("\nMaior pontuação: "+valores[5]);		
		
	}

}
