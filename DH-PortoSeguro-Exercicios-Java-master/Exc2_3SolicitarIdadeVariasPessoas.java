package exercicios;

import java.util.Scanner;

public class Exc2_3SolicitarIdadeVariasPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)
		 */
		Scanner ler = new Scanner(System.in); // Declarando ler para obter do Scanner a captação de dados do teclado 
		
		int idade=0,x=0,menor21=0,maior50=0; // declarando as variaveis
		
		while(idade!=-99) // Laço while enquanto idade for diferente de -99 o laço continua
		{
			x++; // Incremento para quantidade de pessoas
			System.out.println("Digite a idade da "+x+"º pessoa: ");// impressão na tela
			idade=ler.nextInt();//Captando dado do teclado e atribuindo o dado para a variavel idade
			
			if(idade<21)//se idade for menor que 21 executa o que esta entre as chaves
			{
				menor21++; // Incremento menor21 cada vez que entrar aqui menor21 recebe menor21+1
			}
			else if(idade>50)// Se a idade for maior que 50 executa o que esta entre as chaves
			{
				maior50++; // Incremento maior50 cada vez que entrar aqui maior50 recebe menor50+1
			}
							
		}
		/*Saida de dados na tela para mostrar a quantidades de pessoas menores de 21 e maiores de 50 'LEMBRANDO QUE O QUE ESTIVER 
		ENTRE 21 E 50 NÃO VAI MUDAR O SOMATORIO...
		*/
		System.out.println("\nTotal de pessoas menores de 21 anos = "+(menor21-1)+"\nTotal de pessoas maiores de 50 anos = "+maior50);
		System.out.println("\nTotal de pessoas = "+(x-1)); //Impressão na tela pcom o TOTAL de pessoas que colocaram as suas idades...
	}
	}
