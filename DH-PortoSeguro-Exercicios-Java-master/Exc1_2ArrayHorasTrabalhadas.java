package exercicios;

import java.util.Scanner;

public class Exc1_2ArrayHorasTrabalhadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		   Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio. 
		  E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 50 calcule o excesso
		  de pagamento armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. 
		  No final do processamento imprimir o sal�rio total e o sal�rio excedente.
		 */

		Scanner ler = new Scanner(System.in);
		
		int x,k=0,continua=1;
		int[] C = new int[5];// Variavel "C" C�digo do Colaborador
		float[] N = new float[5];// Vari�vel "N" Numero de horas trabalhadas
		float[] E = new float[5];// Vari�vel "E" Excesso de pagamento
		
		
		for(x=0;x<5;x++)
		{
			if(continua==1)
			{
			    System.out.println("\nDigite o c�digo do colaborador: ");
				C[x] = ler.nextInt();
				System.out.println("\nDigite o n�mero de horas trabalhadas: ");
				N[x] = ler.nextFloat();
				
				System.out.println("\nDigite:\n1-Para continuar\n2-Para sair");
				continua=ler.nextInt();
				
			}
			else
				break;
		}
		
		k=x; // Para fazer o n�mero de impress�es correspondente a quantidade de colaboradores
		
		for(x=0;x<k;x++)
		{
	    if(N[x]>50)
		{
			E[x] = N[x]-50;
			System.out.println("\n----------------------------------------------------------------");
			System.out.printf("\nC�digo do Colaborador: %d \nSal�rio base: %.2f\nN�mero de horas excedido: %.2f"
							  + "\nSal�rio excedente: %.2f \nSal�rio total: %.2f",C[x],N[x]*10,E[x],E[x]*20,((N[x]*10)+(E[x]*20)));
			System.out.println("\n----------------------------------------------------------------");
		}
		else
		{
			E[x]=0;
			System.out.println("\n----------------------------------------------------------------");
			System.out.printf("\nC�digo do Colaborador: %d \nSal�rio total: %.2f",C[x],N[x]*10);
			System.out.println("\n----------------------------------------------------------------");
		}
		}
	      		
	}

}
