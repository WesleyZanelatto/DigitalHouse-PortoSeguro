package aulas;

import java.util.Scanner;

public class TernarioOperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Uma alternativa para o uso do if e else � um operador tern�rio condicional. Este
		operador tern�rio (?: ) , � chamado assim porque tem tr�s termos como par�metro.
		
		Exemplo:
		teste ? resultado verdadeiro : resultado falso
		
		int menor = x < y ? x : y ; // A vari�vel menor recebe o valor do menor entre x e y.
		*/
		Scanner  ler = new Scanner(System.in);
		
		int menor,x,y;
		
		System.out.println("\nDigite o valor de x: ");
		x=ler.nextInt();
		System.out.println("\nDigite o valor de y: ");
		y=ler.nextInt();
		
		menor = x < y ? x : y;
		
		//System.out.println("\nO menor valor �: "+menor);
		System.out.printf("\nO menor valor �: %d",menor);
	}

}
