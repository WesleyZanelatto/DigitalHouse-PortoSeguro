package pooJava.Exemplo4Telefone;

public class TelefoneTeste2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando os objetos
		Celular2_1 celular = new Celular2_1();//Objeto da SubClasse Celular2_1
		Fixo2_1 fixo = new Fixo2_1();//Objeto da SubClasse Fixo2_1
		Publico2_1 publico = new Publico2_1();//Objeto da SubClasse Publico2_1
		
		Telefone2_1 telefone = null; //Criando uma variável chamada telefone que é do tipo Telefone2_1 e começa com null
									// Nesse caso eu não posso instancia-la, mas posse criar uma variável com o tipo da SuperClasse.

		int n = (int) (Math.random() * 3.0); // Criando uma variável n do tipo int && Math.random da biblioteca java.lang que é um
											 // sistema rondomico, ou seja, pega números aleatórios...

		System.out.println("\nO número escolhido foi: " + n);

		switch (n) {
		case 0:
			telefone = celular; // celular é o objeto criado na linha 9
			break;
		case 1:
			telefone = fixo; // fixo é o objeto criado na linha 10
			break;
		case 2:
			telefone = publico; // publico é o objeto criado na linha 11
			break;
		default:
			System.out.println("\n Erro inesperado!!!");
		}

		//
		if (telefone != null) { //Se a linha 13 for diferente de null ele executa o bloco
			telefone.disca("92324544");
			telefone.toca(2); // É o número de vezes que queremos que o telefone toque e no caso do Celular2_1 esse mesmo valor vai 
							  // ser uns dos valores do switch case.
		}

	}

}
