package aulas;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) { // Main Principal

		Scanner ler = new Scanner(System.in); // Criando uma variável "ler" para receber os dados inseridos pelo usuário
		
		// CRIANDO VARIÁVEIS COM OS SEUS TIPOS DE DADOS "PRIMITIVOS"
		//As variáveis também podem iniciar com $ ou _'anderline'
		String nome; // Criando a variável "nome" do Tipo String conjunto de caracteres
		int idade=26; // Criando a variável "idade" do Tipo inteiro numérico
		float altura=0; // Criando a variável "altura" do Tipo float ou real numérico
		// char --> utilizada para armazenar um caracter Exp: Opção 's' para sair e 'n' para continuar
		// final float variavelDesejada = 3.1415169 --> "final" utilizado para armazenar uma CONSTANTE
		// boolean X = true; // Variável tipo booleana, ou seja, true or false;
		
		//CRIANDO UMA IMPRESSÃO NA TELA
		System.out.println("\tOlá Mundo!!!\n"); // \t da um TAB e \n pula uma linha | println imprime e pula uma linha "Linha em coluna"
		
		System.out.println("Digite o seu nome: "); // Escreve uma mensagem na tela
		nome = ler.nextLine(); // Utilizado para capturar o dado inserido pelo usuário | "nextLine" leitura do tipo de dado String
		System.out.println("Digite a sua idade: "); // Escreve uma mensagem na tela
		idade = ler.nextInt(); // Utilizado para capturar o dado inserido pelo usuário | "nextInt" leitura do tipo de dado Inteiro
		System.out.println("Digite a sua altura: "); // Escreve uma mensagem na tela
		altura = ler.nextFloat(); // Utilizado para capturar o dado inserido pelo usuário | "nextFloat" leitura do tipo de dado Float
		
		System.out.printf("\nO meu nome é %s, tenho %d anos e a minha altura é %3.2f Mt.",nome,idade,altura);
		//System.out.println("\nO meu nome é " +nome+ ", tenho " +idade+ " anos e a minha altura é " +altura+ " Mt."); // Concatenado "+...+"
	}


}
