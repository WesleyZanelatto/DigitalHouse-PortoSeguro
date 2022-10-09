package aulas;

import java.util.Scanner;

public class ArraysVetor11022022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		float [] media = new float[5]; // Variavel Unidimensional | Criando um vetor 5 posições, iniciando sempre em 0(zero), ou seja, de 0 à 4 instancias
		String [] nomeAluno = new String[5]; // Exemplo de um Array do Tipo String com 5 posições
		float n1,n2,n3,somaMedia=0,mediaGeral;
		int x, aprovados=0,exame=0,reprovados=0;
		
		for(x=0;x<5;x++)
		{	
			System.out.println("\nNotas do "+(x+1)+"º aluno");
			
			System.out.println("\nEntre com o nome do aluno:"); 
			/*POPULAR ARRAY*/ nomeAluno[x] = ler.next(); //POPULAR o Array nomeAluno | Captando nome digitado pelo usuário
			
			System.out.println("\nEntre com a primeira nota: ");
			n1=ler.nextFloat();
			while(n1<0 || n1>10)
			{
				System.out.println("\nIntervalo de notas errado...\n\nEntre com a primeira nota: ");
				n1=ler.nextFloat();
			}
			System.out.println("\nEntre com a segunda nota: ");
			n2=ler.nextFloat();
			while(n2<0 || n2>10)
			{
				System.out.println("\nIntervalo de notas errado...\n\nEntre com a segunda nota: ");
				n2=ler.nextFloat();
			}
			
			System.out.println("\nEntre com a terceira nota: ");
			n3=ler.nextFloat();
			while(n3<0 || n3>10)
			{
				System.out.println("\nIntervalo de notas errado...\n\nEntre com a terceira nota: ");
				n3=ler.nextFloat();
			}
			
			//POPULAR O ARRAY
			media[x] = (n1+n2+n3)/3; //Popular vetor, ou seja, começou a inserir os dados nele
			
			//Mensagem na tela se o aluno foi aprovado, ficou de exame ou foi reprovado
			if(media[x]>=7 && media[x]<=10)
			{
				//System.out.println("\nAluno: "+nomeAluno[x]);
				System.out.println("--------------------------------");
				System.out.println("Aluno "+nomeAluno[x]+" aprovado!!!"); // Imprimindo o nome do aluno
				aprovados++;
			}
			else if(media[x]>=5 && media[x]<=7)
			{
				System.out.println("--------------------------------");
				System.out.println("Aluno "+nomeAluno[x]+" exame!!!");// Imprimindo o nome do aluno
				exame++;
			}
			else
			{
				System.out.println("--------------------------------");
				System.out.println("Aluno "+nomeAluno[x]+" reprovado!!!");// Imprimindo o nome do aluno
				reprovados++;
			}
			
			
			System.out.println("Com Media: "+media[x]);
			System.out.println("--------------------------------");
			
			somaMedia += media[x]; //Somando as medias ==> somaMedia = somaMedia + media[x];
						
		}
		//Neste momento o x vale 5
		mediaGeral = somaMedia / x;
		
		System.out.println("\nMédia geral: "+mediaGeral);
		System.out.println("\n Tivemos:  "+aprovados+" alunos aprovados\n Tivemos: "+exame+" alunos de exame \n Tivemos: "+reprovados+" alunos reprovados");
		
	}

}
