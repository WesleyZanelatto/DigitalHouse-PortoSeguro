package exercicios;

import java.util.Scanner;

public class Exc1_2ArrayHorasTrabalhadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		   Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
		  E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso
		  de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
		  No final do processamento imprimir o salário total e o salário excedente.
		 */

		Scanner ler = new Scanner(System.in);
		
		int x,k=0,continua=1;
		int[] C = new int[5];// Variavel "C" Código do Colaborador
		float[] N = new float[5];// Variável "N" Numero de horas trabalhadas
		float[] E = new float[5];// Variável "E" Excesso de pagamento
		
		
		for(x=0;x<5;x++)
		{
			if(continua==1)
			{
			    System.out.println("\nDigite o código do colaborador: ");
				C[x] = ler.nextInt();
				System.out.println("\nDigite o número de horas trabalhadas: ");
				N[x] = ler.nextFloat();
				
				System.out.println("\nDigite:\n1-Para continuar\n2-Para sair");
				continua=ler.nextInt();
				
			}
			else
				break;
		}
		
		k=x; // Para fazer o número de impressões correspondente a quantidade de colaboradores
		
		for(x=0;x<k;x++)
		{
	    if(N[x]>50)
		{
			E[x] = N[x]-50;
			System.out.println("\n----------------------------------------------------------------");
			System.out.printf("\nCódigo do Colaborador: %d \nSalário base: %.2f\nNúmero de horas excedido: %.2f"
							  + "\nSalário excedente: %.2f \nSalário total: %.2f",C[x],N[x]*10,E[x],E[x]*20,((N[x]*10)+(E[x]*20)));
			System.out.println("\n----------------------------------------------------------------");
		}
		else
		{
			E[x]=0;
			System.out.println("\n----------------------------------------------------------------");
			System.out.printf("\nCódigo do Colaborador: %d \nSalário total: %.2f",C[x],N[x]*10);
			System.out.println("\n----------------------------------------------------------------");
		}
		}
	      		
	}

}
