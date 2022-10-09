package exercicios;

import java.util.Scanner;

public class Exc2_6ReceberVariosNumerosMediaMultiploDeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escrever um programa que receba vários números inteiros no teclado. E no final
		imprimir a média dos números múltiplos de 3. Para sair digitar
		0(zero). (DO...WHILE)
		*/

		Scanner ler = new Scanner(System.in);
		
		float media=0,mult=0;
		int n,x=0;
		
		do
		{
			x++;
			System.out.println("Digite o "+x+"º valor: ");
			n=ler.nextInt();
			
			if(n%3==0)
			{
			 mult+= n;
			 media= mult/(x);
			}
		}
		while(n!=0);
		
		//System.out.println("\nmult= "+mult);
		//System.out.println("\nmedia= "+media);
		//System.out.println("\nx= "+x);		
		System.out.printf("\nA média dos números multiplos de 3: "+media);
	}

}
