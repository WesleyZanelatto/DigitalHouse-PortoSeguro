package pooJava.Exemplo3Pessoa;

import java.util.Scanner; 

public class OperarioTeste1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		String nome,endereco,cpf;
		int telefone,idade;
		float valorProducao,comissao;
				
		System.out.println("\nDigite o nome do operario: ");
		nome = "Wesley"; //ler.nextLine();
		System.out.println("Digite o endereço: ");
		endereco = "Rua uiuiui"; //ler.nextLine();
		System.out.println("Digite o cpf: ");
		cpf = "55195582895"; //ler.nextLine();
		System.out.println("Digite o telefone: ");
		telefone = 965217908;//ler.nextInt();
		System.out.println("Digite a idade: ");
		idade = 36;//ler.nextInt(36);
		System.out.println("Digite o valor produzido: ");
		valorProducao = 24546;//ler.nextFloat();
		System.out.println("Digite a comissão: ");
		comissao = 10;//ler.nextFloat();
		
		//"Wesley","Rua uiuiui","35182893825",965217908,36,24546,10
		
		Operario1_3 emp = new Operario1_3(nome,endereco,cpf,telefone,idade,valorProducao,comissao);
		
		if(emp.validarCpf() == true)
		{
			emp.imprimirInfo();
			emp.calcularProducao();
		}	
		else
			{
			System.out.println("\n----Número CPF Inválido\nPor favor, tente novamente.");
			}
	}

}
