package exercicios;

import java.util.Scanner;

public class Exc3_2VetorDezLancamentosImprimirMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado.Fa�a um programa que gere um vetor com
		 * os lan�amentos, escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
		 * contabilize e apresente tamb�m quantas foram as ocorr�ncias do maior lan�amento.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int[] lancamentos = new int[11];
		int i,j,aux,somaLancamentos=0,mediaAritmetica=0,contMaiorLancamento=0;
		
		//Imprimir na tela
		System.out.println("\n***Digite 10 valores***\n");
		
		//01-La�o para receber os lan�amentos digitados
		for(i=1;i<lancamentos.length;i++)
		{
			System.out.println("Digite o "+i+"� lan�amento: ");
			lancamentos[i] = ler.nextInt();
		}//01-Ecerramento desse la�o
		
		//Imprimir uma divis�o na tela
		System.out.println("********************************************");
		
		//02-La�o para imprimir os lan�amentos
		for(i=1;i<lancamentos.length;i++)
		{
			System.out.println(+i+"� lan�amento: "+lancamentos[i]);	
		}//02-Encerramento desse la�o
		
		//Imprimir uma divis�o na tela
		System.out.println("********************************************");
		
		//03-M�dia aritm�tica
		for(i=1;i<lancamentos.length;i++)
		{
			somaLancamentos += lancamentos[i];
			mediaAritmetica = somaLancamentos/(lancamentos.length-1);
		}//03-Encerramento desse la�o
		
				
		//04-La�o para colocar os lan�amentos em ordem crescente
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
		}//04-Encerramento desse la�o
		
		//05- Ocorr�ncias do maior lan�amento
		for(i=1;i<lancamentos.length;i++)
		{
			if(lancamentos[i]==lancamentos[10])
			{
				contMaiorLancamento++;
			}
		}//05- Encerramento desse la�o
		
		//Imprimir na tela a media aritm�tica dos lan�amentos
		System.out.println("M�dia aritm�tica dos lan�amentos: "+mediaAritmetica);
		
		//Imprimir uma divis�o na tela
		System.out.println("********************************************");
		
		//Imprimir na tela a ocorr�ncias do maior valor
		System.out.println("Ocorr�ncia do maior lan�amento: "+contMaiorLancamento);
			
	}

}
