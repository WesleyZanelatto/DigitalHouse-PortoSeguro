package aulas;

import java.util.Scanner;

public class SqrtPowIfElseEncadeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in); // Criando uma variável "ler" para receber os dados inseridos pelo usuário
		
		// CRIANDO VARIÁVEIS COM OS SEUS TIPOS DE DADOS "PRIMITIVOS"
		//As variáveis também podem iniciar com $ ou _'anderline'
		String nome; // Criando a variável Local "nome" do Tipo String conjunto de caracteres
		int idade=0,x=0,y=0; // Criando a variável Local "idade" do Tipo inteiro numérico
		float altura=0; // Criando a variável Local "altura" do Tipo float ou real numérico
		double nota1=0,nota2=0,nota3=0,media=0; // Criando a variável Local "nota1,nota2,nota3,media" do Tipo Double
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
		
		//CAPTANDO DADOS PARA FAZER A MEDIA ARITMETICA DAS NOTAS CAPTADAS
		System.out.println("Entre com a primeira nota: "); // Escreve uma mensagem solicitando a primeira nota na tela
		nota1 = ler.nextFloat(); // Utilizado para capturar o dado inserido pelo usuário | "nextFloat" leitura do tipo de dado Float
		System.out.println("Entre com a segunda nota: "); // Escreve uma mensagem solicitando a segunda nota na tela
		nota2 = ler.nextFloat(); // Utilizado para capturar o dado inserido pelo usuário | "nextFloat" leitura do tipo de dado Float
		System.out.println("Entre com a terceira nota: "); // Escreve uma mensagem solicitando a terceira nota na tela
		nota3 = ler.nextFloat(); // Utilizado para capturar o dado inserido pelo usuário | "nextFloat" leitura do tipo de dado Float
		
		media = (nota1+nota2+nota3)/3; // media esta recebendo o cálculo aritmetico | 7,8 | 5,6 | 3,4
			
		//LAÇO IF ELSE ENCADEADO
		if(media>=7 && media<=10) 
		{
			System.out.println("\nAluno Aprovado!!!");
		}
		else if(media>=5 && media<=7) 
		{
			System.out.println("\nAluno de exame!!!");
		}
		else if(media>=0 && media<5)
		{
			System.out.println("\nAluno de reprovado!!!");
		}
		else
		{
			System.out.println("\n!!!Média inválida!!!");
		}
		
		System.out.printf("\nO meu nome é %s, tenho %d anos e a minha altura é %2.2f Mt.\n\nA média aritmética é %2.2f",nome,idade,altura,media);
		//System.out.println("\nO meu nome é " +nome+ ", tenho " +idade+ " anos e a minha altura é " +altura+ " Mt.\n\nA média aritmética é " +media); // Concatenado "+...+"
		
		nota1 = Math.sqrt(nota2); // Utilizando Math.sqrt E Atribuindo em nota1 a raiz quadrada da nota2 | Que ja esta na Biblioteca .lang
		nota2 = Math.pow(nota3,3); // Utilizando Math.pow E Atribuindo em nota2 a raiz quadrada da nota3 elevada por 3 | Que ja esta na Biblioteca .lang
		
		//System.out.printf("\nA raiz quadrada de %2.2f é %2.2f",nota2,nota1);// Escreve uma mensagem na tela com a nota2 e a raiz quadrada do mesmo
		
		System.out.printf("\nEntre com o valor de x: ");
		x = ler.nextInt();
		System.out.printf("\nEntre com o valor de y: ");
		y = ler.nextInt();
		
		x = x % y; // calcula o resto da divisão de dois números inteiros

	}

}
