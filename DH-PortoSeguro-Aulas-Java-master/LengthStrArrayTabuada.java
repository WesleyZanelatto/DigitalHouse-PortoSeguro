package aulas;

import java.util.Scanner;

public class LengthStrArrayTabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  ler = new Scanner(System.in);
		
		int tabuada,x=1,resultado;
		
		System.out.printf("\nEntre com qual tabuada deseja montar: ");
		tabuada = ler.nextInt();
		
		String strArray[] = new String[10];
		
		for(x=1;x<=strArray.length;x++)
		{
			
			resultado = x * tabuada;
			System.out.println(+tabuada+" x "+x+" = "+resultado);
			
		}
	}

}
