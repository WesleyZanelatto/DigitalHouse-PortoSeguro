package exercicios;

import java.util.Scanner;

public class Exc1_2HorasTrabalhadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		   Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio. 
		  E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 50 calcule o excesso
		  de pagamento armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. 
		  No final do processamento imprimir o sal�rio total e o sal�rio excedente.
		 */

		Scanner ler = new Scanner(System.in);
		
		int C=0; // Variavel "C" C�digo do Colaborador
		float N=0,E=0; // Vari�vel "N" Numero de horas trabalhadas | Vari�vel "E" Excesso de pagamento
		
		System.out.println("\nDigite o c�digo do colaborador: ");
		C = ler.nextInt();
		System.out.println("\nDigite o n�mero de horas trabalhadas: ");
		N = ler.nextFloat();
		
		if(N>50)
		{
			E = N-50;
			System.out.printf("\nC�digo do Colaborador: %d \nSal�rio base: %.2f\nN�mero de horas excedido: %.2f"
							  + "\nSal�rio excedente: %.2f \nSal�rio total: %.2f",C,N*10,E,E*20,((N*10)+(E*20)));
		}
		else
		{
			E=0;
			System.out.printf("\nC�digo do Colaborador: %d \nSal�rio total: %.2f",C,N*10);
		}
	}

}
