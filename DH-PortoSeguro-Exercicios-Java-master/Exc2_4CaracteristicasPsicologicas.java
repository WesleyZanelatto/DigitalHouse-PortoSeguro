package exercicios;

import java.util.Scanner;

public class Exc2_4CaracteristicasPsicologicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
 			o n�mero de pessoas calmas;
 			o n�mero de mulheres nervosas;
 			o n�mero de homens agressivos;
 			o n�mero de outros calmos;
 			o n�mero de pessoas nervosas com mais de 40 anos;
 			o n�mero de pessoas calmas com menos de 18 anos.
		 */

		Scanner ler = new Scanner(System.in);
		
		int idade,sexo,masculino=0,feminino=0,z=0,temperamento,pessoasCalmas=0,mulheresNervosas=0;
		int	homensAgressivos=0,outrosCalmos=0,nervosasMaisDe40=0,calmasMenores18=0;
		char continua='S';
		while(continua=='S' && z!=150) 
		{
		z++;
		System.out.println("\n***Pesquisa das caracter�sticas psicol�gicas***\n\n Participante n�"+z+"\n\n Digite a sua idade: ");
		idade=ler.nextInt();
		System.out.println("\nEntre as op��es digite um valor que corresponda ao seu sexo: \n1-Feminino\n2-Masculino\n3-Outros");
		sexo=ler.nextInt();
		System.out.println("\nEntre as op��es digite um valor que corresponda ao seu temperamento: \n1-Calmo(a)\n2-Nervoso(a)\n3-Agressivo(a)");
		temperamento=ler.nextInt();
		
		if(temperamento==1)
		{ pessoasCalmas++;}
		if(sexo==1 && temperamento==2)
		{ mulheresNervosas++;}
		if(sexo==2 && temperamento==3)
		{homensAgressivos++;}
		if(sexo==3 && temperamento==1)
		{outrosCalmos++;}
		if(temperamento==2 && idade>40)
		{nervosasMaisDe40++;}
		if(temperamento==1 && idade<18)
		{calmasMenores18++;}
		 
		//Continuar a pesquisa Sim/N�o ou se fica ou sai do Loop while
		if(z<150) 
		{System.out.println("\nVoc� deseja continua  a pesquisa: S/N ");
		continua = ler.next().toUpperCase().charAt(0); // l� um caracter e o transforma para maiuscula
		}
						
		}
		
		System.out.println("\nN�mero de pessoas calmas: "+pessoasCalmas);
		System.out.println("N�mero de mulheres nervosas: "+mulheresNervosas);
		System.out.println("N�mero de homens agressivos: "+homensAgressivos);
		System.out.println("N�mero de outros calmos: "+outrosCalmos);
		System.out.println("N�mero de pessoas nervosas com mais de 40 anos: "+nervosasMaisDe40);
		System.out.println("N�mero de pessoas calmas com menos de 18 anos: "+calmasMenores18);
	}

}
