package exercicios;

import java.util.Scanner;

public class Exc2_2ImprimirQtdParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		Scanner ler = new Scanner(System.in);
		
		int n=0,ContImpares=0,ContPares=0;
		
		//int Num_Par[] = new int[10];
		
		System.out.println("\nLer 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.\n");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Digite o "+i+"� Valor: ");
			n=ler.nextInt();
			
			if(n%2==0)
			{
				ContPares++;
			}
			else
			{
				ContImpares++;
			}
		}
		
		System.out.println("\nQuantidade de n�meros pares = "+ContPares+ "\nQuantidade de n�meros impares = "+ContImpares);
		
	}

}
