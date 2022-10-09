package aulas;

import java.util.Scanner;

public class TernarioOperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Uma alternativa para o uso do if e else é um operador ternário condicional. Este
		operador ternário (?: ) , é chamado assim porque tem três termos como parâmetro.
		
		Exemplo:
		teste ? resultado verdadeiro : resultado falso
		
		int menor = x < y ? x : y ; // A variável menor recebe o valor do menor entre x e y.
		*/
		Scanner  ler = new Scanner(System.in);
		
		int menor,x,y;
		
		System.out.println("\nDigite o valor de x: ");
		x=ler.nextInt();
		System.out.println("\nDigite o valor de y: ");
		y=ler.nextInt();
		
		menor = x < y ? x : y;
		
		//System.out.println("\nO menor valor é: "+menor);
		System.out.printf("\nO menor valor é: %d",menor);
	}

}
