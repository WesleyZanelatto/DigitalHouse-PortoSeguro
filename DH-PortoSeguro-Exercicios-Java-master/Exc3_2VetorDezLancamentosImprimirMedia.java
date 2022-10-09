package exercicios;

import java.util.Scanner;

public class Exc3_2VetorDezLancamentosImprimirMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado.Faça um programa que gere um vetor com
		 * os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, 
		 * contabilize e apresente também quantas foram as ocorrências do maior lançamento.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int[] lancamentos = new int[11];
		int i,j,aux,somaLancamentos=0,mediaAritmetica=0,contMaiorLancamento=0;
		
		//Imprimir na tela
		System.out.println("\n***Digite 10 valores***\n");
		
		//01-Laço para receber os lançamentos digitados
		for(i=1;i<lancamentos.length;i++)
		{
			System.out.println("Digite o "+i+"º lançamento: ");
			lancamentos[i] = ler.nextInt();
		}//01-Ecerramento desse laço
		
		//Imprimir uma divisão na tela
		System.out.println("********************************************");
		
		//02-Laço para imprimir os lançamentos
		for(i=1;i<lancamentos.length;i++)
		{
			System.out.println(+i+"º lançamento: "+lancamentos[i]);	
		}//02-Encerramento desse laço
		
		//Imprimir uma divisão na tela
		System.out.println("********************************************");
		
		//03-Média aritmética
		for(i=1;i<lancamentos.length;i++)
		{
			somaLancamentos += lancamentos[i];
			mediaAritmetica = somaLancamentos/(lancamentos.length-1);
		}//03-Encerramento desse laço
		
				
		//04-Laço para colocar os lançamentos em ordem crescente
		for(i=1;i<lancamentos.length;i++)
		{
			for(j=i+1;j<lancamentos.length;j++)
			{
				if(lancamentos[i]>lancamentos[j])
				{
					aux=lancamentos[i];
					lancamentos[i]=lancamentos[j];
					lancamentos[j]=aux;
				}
			}
		}//04-Encerramento desse laço
		
		//05- Ocorrências do maior lançamento
		for(i=1;i<lancamentos.length;i++)
		{
			if(lancamentos[i]==lancamentos[10])
			{
				contMaiorLancamento++;
			}
		}//05- Encerramento desse laço
		
		//Imprimir na tela a media aritmética dos lançamentos
		System.out.println("Média aritmética dos lançamentos: "+mediaAritmetica);
		
		//Imprimir uma divisão na tela
		System.out.println("********************************************");
		
		//Imprimir na tela a ocorrências do maior valor
		System.out.println("Ocorrência do maior lançamento: "+contMaiorLancamento);
			
	}

}
