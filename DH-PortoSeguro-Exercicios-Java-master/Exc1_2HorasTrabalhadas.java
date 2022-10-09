package exercicios;

import java.util.Scanner;

public class Exc1_2HorasTrabalhadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		   Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
		  E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso
		  de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
		  No final do processamento imprimir o salário total e o salário excedente.
		 */

		Scanner ler = new Scanner(System.in);
		
		int C=0; // Variavel "C" Código do Colaborador
		float N=0,E=0; // Variável "N" Numero de horas trabalhadas | Variável "E" Excesso de pagamento
		
		System.out.println("\nDigite o código do colaborador: ");
		C = ler.nextInt();
		System.out.println("\nDigite o número de horas trabalhadas: ");
		N = ler.nextFloat();
		
		if(N>50)
		{
			E = N-50;
			System.out.printf("\nCódigo do Colaborador: %d \nSalário base: %.2f\nNúmero de horas excedido: %.2f"
							  + "\nSalário excedente: %.2f \nSalário total: %.2f",C,N*10,E,E*20,((N*10)+(E*20)));
		}
		else
		{
			E=0;
			System.out.printf("\nCódigo do Colaborador: %d \nSalário total: %.2f",C,N*10);
		}
	}

}
