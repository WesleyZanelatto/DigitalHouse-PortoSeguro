package exercicios;

import java.util.Scanner;

public class Exc1_3ArrayCalculeQuadradoDeCadaUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Desenvolva um sistema em que:
		Leia 4 (quatro) n�meros;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
		 */

		Scanner ler = new Scanner(System.in);
		
		//double n1=0,n2=0,n3=0,n4=0,t=0;
		double[] n= new double[5];
		double[] t= new double[5];
		int z=0,x;
		
		System.out.println("\n***Digite 4 valores inteiros***\n");
		
		for(x=1;x<5;x++)
		{
			
		System.out.println("Digite o " +x+ "� n�mero inteiro: ");
		n[x] = ler.nextInt();
		}
		
		z=x; // Para fazer o n�mero de impress�es correspondente a quantidade de colaboradores
		
		for(x=1;x<z;x++)
		{
		t[x] = Math.pow(n[3],2);
		
		if(t[x]>=1000)
		{
			System.out.printf("\nO terceiro valor digitado �: %.2f portanto o seu quadrado �: %.2f",n[3],Math.pow(n[3],2));
			break;
		}
		else
		{
			System.out.printf("\nO %d� valor digitado �: %.2f portanto o seu quadrado �: %.2f",x,n[x],Math.pow(n[x],2));
			
		}
		}
	}

}
