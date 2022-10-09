package aulas;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int tabuada,x=1,resultado;
		
		System.out.printf("\nEntre com qual tabuada deseja montar: ");
		tabuada = ler.nextInt();
		
		do // 'do while' primeiro executa e depois testa | 'while' testa e depois executa
		{
			
			resultado = x * tabuada;
			System.out.println(+tabuada+" x "+x+" = "+resultado);
			x++;
		}
		while(x<=10);
		
	}

}
