package aulas;

import java.util.Scanner;

public class CalculadoraSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in); // Criando um Scanner com a vari�vel ler para capta��o do dado diditado pelo usu�rio
		
		float n1=0,n2=0,resultado=0; // Declarando vari�veis Locais do Tipo Float
		int op; // Declarando vari�vel Local do Tipo Inteira
		
		System.out.println("\n\t\t***Calculadora***"); // Imprimindo na tala a mensagem c�culadora
		
		System.out.println("\n 1 - Soma"); // Imprimindo uma mensagem na tela
		System.out.println(" 2 - Diferen�a");// Imprimindo uma mensagem na tela
		System.out.println(" 3 - Multiplica��o");// Imprimindo uma mensagem na tela
		System.out.println(" 4 - Divis�o");// Imprimindo uma mensagem na tela
		
		System.out.println("\nDigite uma op��o: ");// Imprimindo uma mensagem na tela
		op = ler.nextInt();// Captando a op��o "op" digitada pelo usu�rio
		
		System.out.println("\nEntre com o primeiro n�mero: ");// Imprimindo uma mensagem na tela
		n1 = ler.nextFloat();// Captando  dado "n1" digitado pelo usu�rio
		System.out.println("\nEntre com o segundo n�mero: ");// Imprimindo uma mensagem na tela
		n2 = ler.nextFloat();// Captando  dado "n2" digitado pelo usu�rio
		
				
		switch(op) // Switch Case "Cardapio" 
		{
		case 1: // Caso o usu�rio digite 1 efetua uma soma
			resultado = n1 + n2; // Atribuindo em resultado a soma de n1 + n2
			break; // Assim que executado est� � a parada desse caso
		case 2: // Caso o usu�rio digite 2 efetua uma subtra��o
			resultado = n1 - n2;// Atribuindo em resultado a subtra��o de n1 - n2
			break;// Assim que executado est� � a parada desse caso
		case 3: // Caso o usu�rio digite 3 efetua uma multiplica��o
			resultado = n1 * n2;// Atribuindo em resultado a multiplica��o de n1 * n2
			break;// Assim que executado est� � a parada desse caso
		case 4: // Caso o usu�rio digite 4 efetua uma divis�o
			if(n2==0) // Caso n2 seja igual a 0(zero) essa linha ser� executada
			{
				System.out.println("N�o � poss�vel fazer divis�o por 0 (zero)");// Imprimindo uma mensagem na tela
			}
			else // Caso n2 seja diferente de 0(zero) ser� executado essa linha
			{
			resultado = n1 / n2;// Atribuindo em resultado a divis�o de n1 / n2
			break;// Assim que executado est� � a parada desse caso
			}
			
			default: // Caso o usu�rio esolha uma op��o que n�o consta no menu essa linha ser� executada
				System.out.println("\nOp��o Inv�lida"); // Imprimindo uma mensagem na tela
		}
		
		System.out.println("Resultado: "+resultado); // Imprimindo uma mensagem na tela

		
	}

}
