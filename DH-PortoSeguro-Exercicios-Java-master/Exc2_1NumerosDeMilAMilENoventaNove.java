package exercicios;

//import java.util.Scanner;

public class Exc2_1NumerosDeMilAMilENoventaNove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Informar todos os números de 1000 a 1999 que quando divididos por 11
		 obtemos resto = 5. (FOR)
		 */
		//Scanner ler = new Scanner(System.in);
		
		int cont=0;
		
		System.out.println("\nInformar todos os números de 1000 a 1999 que quando divididos por \n11 obtemos resto = 5.\n");
		
		for(int i=1000;i<=1999;i++)
		{
			int t=i%11;
			
			if(t==5)
			{
				cont++;
				System.out.println(+i+" dividido por 11 tem resto= "+t);
			}
		}
		
		System.out.println("\nTotal de numeros com resto = 5 ---> "+cont);
		
	}

}
