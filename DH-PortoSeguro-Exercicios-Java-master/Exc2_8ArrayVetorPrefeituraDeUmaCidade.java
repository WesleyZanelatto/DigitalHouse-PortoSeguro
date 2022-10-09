package exercicios;

import java.util.Scanner;

public class Exc2_8ArrayVetorPrefeituraDeUmaCidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*PARA (For)
		 *  A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		 * coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:
		 * a)M�dia do sal�rio da popula��o;
		 * b)M�dia do n�mero de filhos;
		 * c)Maior sal�rio;
		 * d)Percentual de pessoas com sal�rio at� R$ 100,00.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		float[] salario = new float[21]; //21 posi��oes que resultara em 20 resultados
		float somaSalarios=0,mediaSalario=0,salarioMenor100=0,percentualSalarioMenor100=0,aux,mediaNumFilhos=0,somaNumFilhos=0;
		int[] numFilhos = new int[21];//21 posi��oes que resultara em 20 resultados
		int i,j;
				
		System.out.println("\n*****Pesquisa da Prefeitura de uma cidade*****");
		
		//01-Captando dados do usuario
		for(i=1;i<salario.length;i++)
		{
			System.out.println("\nDigite o salario do "+i+"� participante: ");
			salario[i] = ler.nextFloat();
			System.out.println("\nDigite a quantidade de filhos do "+i+"� participante: ");
			numFilhos[i] = ler.nextInt();
		}//01-Encerrando la�o de capta��o dos dados do usuario
		
		
		//02-M�dia sal�rio da popula��o e media numero de filhos
		for(i=1;i<salario.length;i++)
		{
			somaSalarios += salario[i];
			somaNumFilhos += numFilhos[i];
		}
			mediaSalario = somaSalarios/(i-1);
			mediaNumFilhos = somaNumFilhos/(i-1);
		//02-Encerrado
			
		//03-Ordenando Maior sal�rio digitado
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
			}//03-Encerrando ordenamento do maior sal�rio digitado
			
			
			//04-Percentual de pessoas com sal�rio at� R$ 100,00
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
			System.out.println("M�dia do sal�rio da popula��o: "+mediaSalario);
			System.out.printf("M�dia do n�mero de filhos: %2.0f\n",mediaNumFilhos);
			System.out.println("Maior sal�rio: "+salario[1]);
			System.out.println("Percentual de pessoas com sal�rio at� R$ 100,00: "+percentualSalarioMenor100+"%");
			System.out.println("****************************************************");
			//05-Encerrado
			
		}

}
