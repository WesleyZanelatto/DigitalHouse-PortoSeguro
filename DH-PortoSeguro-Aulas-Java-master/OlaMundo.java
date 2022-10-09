package aulas;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) { // Main Principal

		Scanner ler = new Scanner(System.in); // Criando uma vari�vel "ler" para receber os dados inseridos pelo usu�rio
		
		// CRIANDO VARI�VEIS COM OS SEUS TIPOS DE DADOS "PRIMITIVOS"
		//As vari�veis tamb�m podem iniciar com $ ou _'anderline'
		String nome; // Criando a vari�vel "nome" do Tipo String conjunto de caracteres
		int idade=26; // Criando a vari�vel "idade" do Tipo inteiro num�rico
		float altura=0; // Criando a vari�vel "altura" do Tipo float ou real num�rico
		// char --> utilizada para armazenar um caracter Exp: Op��o 's' para sair e 'n' para continuar
		// final float variavelDesejada = 3.1415169 --> "final" utilizado para armazenar uma CONSTANTE
		// boolean X = true; // Vari�vel tipo booleana, ou seja, true or false;
		
		//CRIANDO UMA IMPRESS�O NA TELA
		System.out.println("\tOl� Mundo!!!\n"); // \t da um TAB e \n pula uma linha | println imprime e pula uma linha "Linha em coluna"
		
		System.out.println("Digite o seu nome: "); // Escreve uma mensagem na tela
		nome = ler.nextLine(); // Utilizado para capturar o dado inserido pelo usu�rio | "nextLine" leitura do tipo de dado String
		System.out.println("Digite a sua idade: "); // Escreve uma mensagem na tela
		idade = ler.nextInt(); // Utilizado para capturar o dado inserido pelo usu�rio | "nextInt" leitura do tipo de dado Inteiro
		System.out.println("Digite a sua altura: "); // Escreve uma mensagem na tela
		altura = ler.nextFloat(); // Utilizado para capturar o dado inserido pelo usu�rio | "nextFloat" leitura do tipo de dado Float
		
		System.out.printf("\nO meu nome � %s, tenho %d anos e a minha altura � %3.2f Mt.",nome,idade,altura);
		//System.out.println("\nO meu nome � " +nome+ ", tenho " +idade+ " anos e a minha altura � " +altura+ " Mt."); // Concatenado "+...+"
	}


}
