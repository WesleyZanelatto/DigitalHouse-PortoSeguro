package exercicios;

import java.util.Scanner;

public class Exc2_7OrdenarArrayEmCrescenteDecrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		// Ordenar Crescente e decrescente
		
		
		int[] vet= new int[6];
		int i,j,aux,op;
		char continuar='S';
		
		System.out.println("\n***Digite 5 n�meros inteiros***");
		
		while(continuar=='S')
		{
			System.out.println("\n\tDigite:\n1-Para ordem crescente\n2-Para ordem decrescente");
			op=ler.nextInt();
			
		switch(op)
		{
			case 1:
			{
			for(i=1;i<=5;i++)
				{
					System.out.printf("Digite o %d� valor: ",i);
					vet[i]=ler.nextInt();
				}
				
				
				for(i=1;i<=5;i++)
				{
					for(j=i+1;j<=5;j++)
					{
						if(vet[i] > vet[j])
						{
							aux=vet[i];
							vet[i]=vet[j];
							vet[j]=aux;
						}
					}
				}
				
				System.out.printf("\nVetor ordenado crescente: ");
				
				for(i=1;i<=5;i++)
				{
					System.out.printf(+vet[i]+" / ");
				}
				
				System.out.println("\n\n\t!!!N�meros ordenados com sucesso!!!");
				
				
				System.out.println("\nDeseja executar mais uma vez: S/N");
				continuar = ler.next().toUpperCase().charAt(0);
				
								
				break;
			}
			
			case 2:
			{
				for(i=1;i<=5;i++)
				{
					System.out.printf("Digite o %d� valor: ",i);
					vet[i]=ler.nextInt();
				}
				
				
				for(i=1;i<=5;i++)
				{
					for(j=i+1;j<=5;j++)
					{
						if(vet[i] < vet[j])
						{
							aux=vet[i];
							vet[i]=vet[j];
							vet[j]=aux;
						}
					}
				}
				
				System.out.printf("\nVetor ordenado decrescente: ");
				
				for(i=1;i<=5;i++)
				{
					System.out.printf(+vet[i]+" / ");
				}
				
				System.out.println("\n\n\t!!!N�meros ordenados com sucesso!!!");
				
				System.out.println("\nDeseja executar mais uma vez: S/N");
				continuar = ler.next().toUpperCase().charAt(0);
				
				break;
				}	
			
				default:
				{
					System.out.println("\nOp��o Inv�lida");
					System.out.println("\nDeseja tentar mais uma vez: S/N");
					continuar = ler.next().toUpperCase().charAt(0);
				}	
		}
		
		}	
	
	}

}
