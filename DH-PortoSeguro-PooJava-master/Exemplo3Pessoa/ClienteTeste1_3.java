package pooJava.Exemplo3Pessoa;

//import java.util.Scanner;

public class ClienteTeste1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner ler = new Scanner(System.in);

		// String nome, endereco, cpf, ultimaCompra;
		// int telefone, idade, codigoCliente = 0;
		/*
		 * System.out.println("\nDigite o código do cliente: "); codigoCliente = 85800;
		 * // ler.nextLine(); System.out.println("\nDigite o nome: "); nome = "Wesley";
		 * // ler.nextLine(); System.out.println("Digite o cpf: "); cpf = "32199582880";
		 * // ler.nextLine(); System.out.println("Digite o endereço: "); endereco =
		 * "Rua uiuiui"; // ler.nextLine(); System.out.println("Digite o telefone: ");
		 * telefone = 965217908;// ler.nextInt();
		 * System.out.println("Digite a idade: "); idade = 36;// ler.nextInt(36);
		 * System.out.println("Data da última compra: "); ultimaCompra = "22/02/2022";//
		 * ler.nextLine();
		 */

		// Cliente1_3 cliTest = new Cliente1_3(codigoCliente, nome, cpf,
		// endereco,telefone, idade, ultimaCompra);
		Cliente1_3 cliTest = new Cliente1_3(85800, "Wesley", "35182893825", "Rua uiuiui", 965217908, 36, "22/02/2022");

		//if (cliTest.validarCpf() == true) {
			cliTest.imprimirInfo();
		//} else {
		//	System.out.println("\n----Número CPF Inválido\nPor favor, tente novamente.");
		//}
	}
}
