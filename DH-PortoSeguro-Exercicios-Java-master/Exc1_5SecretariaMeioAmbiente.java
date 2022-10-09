package exercicios;

import java.util.Scanner;

public class Exc1_5SecretariaMeioAmbiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o altamente poluentes
		  do meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 
		  1� grupo s�o intimadas a suspenderem suas atividades, se o �ndice crescer para 0,4 as ind�strias do 1� e 2� grupo s�o intimadas
		   a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
		    Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.
		 */

		Scanner ler = new Scanner(System.in);
		
		float ip=0; // Variavel "ip" �ndice de polui��o
		
		System.out.println("\nDigite o �ndice de polui��o: ");
		ip = ler.nextFloat();
		
		if(ip<=0.25)
		{
			System.out.println("\nAs empresas do 1�, 2� e 3� grupo, podem continuar as suas atividades normalmente!");
		}
		else if(ip>0.25 && ip<=0.3)
		{
			System.out.println("\nAs empresas do 1� grupo s�o notificadas a suspenderem suas atividades!");
		}
		else if(ip>0.3 && ip<=0.4)
		{
			System.out.println("As empresas do 1� e 2� grupo s�o notificadas a suspenderem suas atividades!");
		}
		else if (ip>0.4)
		{
			System.out.println("As empresas de todos os grupos s�o notificadas a paralisarem suas atividades!");
		}
	}

}
