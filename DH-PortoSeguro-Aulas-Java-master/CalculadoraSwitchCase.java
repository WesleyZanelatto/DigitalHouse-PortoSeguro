package aulas;

import java.util.Scanner;

public class CalculadoraSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in); // Criando um Scanner com a variável ler para captação do dado diditado pelo usuário
		
		float n1=0,n2=0,resultado=0; // Declarando variáveis Locais do Tipo Float
		int op; // Declarando variável Local do Tipo Inteira
		
		System.out.println("\n\t\t***Calculadora***"); // Imprimindo na tala a mensagem cáculadora
		
		System.out.println("\n 1 - Soma"); // Imprimindo uma mensagem na tela
		System.out.println(" 2 - Diferença");// Imprimindo uma mensagem na tela
		System.out.println(" 3 - Multiplicação");// Imprimindo uma mensagem na tela
		System.out.println(" 4 - Divisão");// Imprimindo uma mensagem na tela
		
		System.out.println("\nDigite uma opção: ");// Imprimindo uma mensagem na tela
		op = ler.nextInt();// Captando a opção "op" digitada pelo usuário
		
		System.out.println("\nEntre com o primeiro número: ");// Imprimindo uma mensagem na tela
		n1 = ler.nextFloat();// Captando  dado "n1" digitado pelo usuário
		System.out.println("\nEntre com o segundo número: ");// Imprimindo uma mensagem na tela
		n2 = ler.nextFloat();// Captando  dado "n2" digitado pelo usuário
		
				
		switch(op) // Switch Case "Cardapio" 
		{
		case 1: // Caso o usuário digite 1 efetua uma soma
			resultado = n1 + n2; // Atribuindo em resultado a soma de n1 + n2
			break; // Assim que executado está é a parada desse caso
		case 2: // Caso o usuário digite 2 efetua uma subtração
			resultado = n1 - n2;// Atribuindo em resultado a subtração de n1 - n2
			break;// Assim que executado está é a parada desse caso
		case 3: // Caso o usuário digite 3 efetua uma multiplicação
			resultado = n1 * n2;// Atribuindo em resultado a multiplicação de n1 * n2
			break;// Assim que executado está é a parada desse caso
		case 4: // Caso o usuário digite 4 efetua uma divisão
			if(n2==0) // Caso n2 seja igual a 0(zero) essa linha será executada
			{
				System.out.println("Não é possível fazer divisão por 0 (zero)");// Imprimindo uma mensagem na tela
			}
			else // Caso n2 seja diferente de 0(zero) será executado essa linha
			{
			resultado = n1 / n2;// Atribuindo em resultado a divisão de n1 / n2
			break;// Assim que executado está é a parada desse caso
			}
			
			default: // Caso o usuário esolha uma opção que não consta no menu essa linha será executada
				System.out.println("\nOpção Inválida"); // Imprimindo uma mensagem na tela
		}
		
		System.out.println("Resultado: "+resultado); // Imprimindo uma mensagem na tela

		
	}

}
