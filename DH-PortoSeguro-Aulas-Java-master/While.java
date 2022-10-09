package aulas;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		float n1,n2,n3,media,somaMedia=0,mediaGeral;
		
		for(int x=1;x<=5;x++)//x=x+1 | x--  --> x=x-1 | x=x+5 soma de cinco em cinco
		{
			System.out.println("\nNotas do aluno "+x+" : ");
			System.out.println("\nEntre com a primeira nota: ");
			n1=ler.nextFloat(); //12
			
			while(n1<0 || n1>10)
			{
				System.out.println("\nVocê digitou um valor fora de 0 a 10... \nEntre com a primeira nota: ");
				n1=ler.nextFloat();
			}
			
			System.out.println("\nEntre com a segunda nota: ");
			n2=ler.nextFloat();
			
			while(n2<0 || n2>10)
			{
				System.out.println("\nVocê digitou um valor fora de 0 a 10... \nEntre com a segunda nota: ");
				n2=ler.nextFloat();
			}
			
				System.out.println("\nEntre com a terceira nota: ");
				n3=ler.nextFloat();
			
			while(n3<0 || n3>10)
			{
				System.out.println("\nVocê digitou um valor fora de 0 a 10... \nEntre com a terceira nota: ");
				n3=ler.nextFloat();
			}
			
			media = (n1+n2+n3)/3; // 7.5 | 3.5 | 5.0
			
			somaMedia = somaMedia + media; // somaMedia = somaMedia + 7.5 == 7.5 + 3.5 == 11 + 5.0 == 16 ...
			//somaMedia +=media; == somaMedia = somaMedia + media
			
		}
		
		mediaGeral = somaMedia / 5;
		System.out.printf("\nMedia geral: %2.2f",mediaGeral);
	}

}
