package exercicios;

import java.util.Scanner;

public class Exc1_5SecretariaMeioAmbiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes
		  do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 
		  1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as indústrias do 1º e 2º grupo são intimadas
		   a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
		    Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
		 */

		Scanner ler = new Scanner(System.in);
		
		float ip=0; // Variavel "ip" Índice de poluição
		
		System.out.println("\nDigite o índice de poluição: ");
		ip = ler.nextFloat();
		
		if(ip<=0.25)
		{
			System.out.println("\nAs empresas do 1º, 2º e 3º grupo, podem continuar as suas atividades normalmente!");
		}
		else if(ip>0.25 && ip<=0.3)
		{
			System.out.println("\nAs empresas do 1º grupo são notificadas a suspenderem suas atividades!");
		}
		else if(ip>0.3 && ip<=0.4)
		{
			System.out.println("As empresas do 1º e 2º grupo são notificadas a suspenderem suas atividades!");
		}
		else if (ip>0.4)
		{
			System.out.println("As empresas de todos os grupos são notificadas a paralisarem suas atividades!");
		}
	}

}
