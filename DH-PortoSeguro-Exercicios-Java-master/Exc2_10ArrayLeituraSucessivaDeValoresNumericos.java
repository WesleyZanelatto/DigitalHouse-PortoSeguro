package exercicios;

import java.util.Scanner;

public class Exc2_10ArrayLeituraSucessivaDeValoresNumericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ENQUANTO
		 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
		 * apresente no final o total do somatório, a média e o total de valores lidos.
		 * O programa deve fazer as leituras dos valores enquanto o usuário estiver 
		 * fornecendo valores positivos, ou seja, o programa deve parar quando o usuário 
		 * fornecer um valor negativo.
		 */
		
		int n=0,i=0,somatorio=0,media=0;
		//float media=0;
		
		Scanner ler = new Scanner(System.in);
		
		while(n>=0)
		{
			i++;
			System.out.printf("Digite o %dº valor: ",i);
			n = ler.nextInt();
			
			if(n>=0)
			{
				somatorio += n;
				media = somatorio/i;
			}
			else
				break;
		}
		
		System.out.println("\n***********************************************");
		System.out.println("Total do somatorio = "+somatorio);
		System.out.println("Média = "+media);
		System.out.println("Total de valores lidos = "+i);
		System.out.println("***********************************************");
	}

}
