package pooJava.Exemplo4Telefone;

public class Publico2_1 extends Telefone2_1 {

	// Método Especial Construtor
	public Publico2_1() {
		super("Telefone público");// Nesse caso temos apenas um único Atributo na SuperClasse Telefone2_1, que é o Atributo tipo 
								  //que recebe a String "Telefone público"
	}

	@Override //@Override significa que estou sobrescrevendo um MÉTODO da minha SuperClasse e o tornando em polimorfico.
			/*Implementando toca com o (parâmetro de retorno numToques),  devemos considerar que somento o nome toca 
			 * e o tipo int devem estar iguais ao da SuperClasse já o parâmetro numToques, poderia ser qualquer outro nome.
			 */
	public void toca(int numToques) {
		for (int i = 0; i < numToques; i++) {
			System.out.println("\nTrimtrimtrim...Trimtrimtrim");
		}
	}

	@Override //@Override significa que estou sobrescrevendo um MÉTODO da minha SuperClasse e o tornando em polimorfico.
			  /*Implementando disca com o (parâmetro de retorno numero),  devemos considerar que somento o nome disca 
			   * e o tipo String devem estar iguais ao da SuperClasse já o parâmetro numero, poderia ser qualquer outro nome.
			   */
	public void disca(String numero) {
		if (numero.charAt(0) == '9' || numero.charAt(0) == '8') { // charAt vai pegar uma posição de um número, ou seja, se é igual a 0(zero)
																  // ele vai pegar a primeira posição... como se fosse um vetor.
			System.out.println("\nEste número não liga para celular!!!");
		} else {
			System.out.println("\nDiscando: " +numero);
		}
	}

}
