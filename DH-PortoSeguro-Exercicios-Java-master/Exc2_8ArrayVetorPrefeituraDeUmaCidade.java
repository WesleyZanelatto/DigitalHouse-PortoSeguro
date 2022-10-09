package exercicios;

import java.util.Scanner;

public class Exc2_8ArrayVetorPrefeituraDeUmaCidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*PARA (For)
		 *  A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
		 * a)Média do salário da população;
		 * b)Média do número de filhos;
		 * c)Maior salário;
		 * d)Percentual de pessoas com salário até R$ 100,00.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		float[] salario = new float[21]; //21 posiçãoes que resultara em 20 resultados
		float somaSalarios=0,mediaSalario=0,salarioMenor100=0,percentualSalarioMenor100=0,aux,mediaNumFilhos=0,somaNumFilhos=0;
		int[] numFilhos = new int[21];//21 posiçãoes que resultara em 20 resultados
		int i,j;
				
		System.out.println("\n*****Pesquisa da Prefeitura de uma cidade*****");
		
		//01-Captando dados do usuario
		for(i=1;i<salario.length;i++)
		{
			System.out.println("\nDigite o salario do "+i+"º participante: ");
			salario[i] = ler.nextFloat();
			System.out.println("\nDigite a quantidade de filhos do "+i+"º participante: ");
			numFilhos[i] = ler.nextInt();
		}//01-Encerrando laço de captação dos dados do usuario
		
		
		//02-Média salário da população e media numero de filhos
		for(i=1;i<salario.length;i++)
		{
			somaSalarios += salario[i];
			somaNumFilhos += numFilhos[i];
		}
			mediaSalario = somaSalarios/(i-1);
			mediaNumFilhos = somaNumFilhos/(i-1);
		//02-Encerrado
			
		//03-Ordenando Maior salário digitado
			for(i=0;i<salario.length;i++)
			{
				for(j=i+1;i<salario.length;i++)
				{
					if(salario[i]>salario[j])
					{
						aux=salario[i];
						salario[i]=salario[j];
						salario[j]=aux;
					}
				}
			}//03-Encerrando ordenamento do maior salário digitado
			
			
			//04-Percentual de pessoas com salário até R$ 100,00
			for(i=0;i<salario.length;i++)
			{
				if(salario[i]>0 && salario[i]<=100)
				{
					salarioMenor100++;
				}
			}
				percentualSalarioMenor100 = salarioMenor100/(i-1)*100;
			//04-Encerrado
				
			//05-Saida de dados na tela com os devidos resultados
			System.out.println("****************************************************");
			System.out.println("Média do salário da população: "+mediaSalario);
			System.out.printf("Média do número de filhos: %2.0f\n",mediaNumFilhos);
			System.out.println("Maior salário: "+salario[1]);
			System.out.println("Percentual de pessoas com salário até R$ 100,00: "+percentualSalarioMenor100+"%");
			System.out.println("****************************************************");
			//05-Encerrado
			
		}

}
