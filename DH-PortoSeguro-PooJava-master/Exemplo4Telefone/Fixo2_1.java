package pooJava.Exemplo4Telefone;

public class Fixo2_1 extends Telefone2_1 {

	// Método Especial Construtor
	public Fixo2_1() {
		super("Telefone fixo");// Nesse caso temos apenas um único Atributo na SuperClasse Telefone2_1, que é o Atributo tipo 
							   //que recebe a String "Telefone fixo"
	}

	@Override //@Override significa que estou sobrescrevendo um MÉTODO da minha SuperClasse e o tornando em polimorfico.
			/*Implementando toca com o (parâmetro de retorno numToques),  devemos considerar que somento o nome toca 
			 * e o tipo int devem estar iguais ao da SuperClasse já o parâmetro numToques, poderia ser qualquer outro nome.
			 */
	public void toca(int numToques) {
		for (int i = 0; i < numToques; i++) {
			System.out.println("\nTrimmmmmmm...trimmmmmm");
		}
	}

	@Override //@Override significa que estou sobrescrevendo um MÉTODO da minha SuperClasse e o tornando em polimorfico.
			/*Implementando disca com o (parâmetro de retorno numero),  devemos considerar que somento o nome disca 
			 * e o tipo String devem estar iguais ao da SuperClasse já o parâmetro numero, poderia ser qualquer outro nome.
			 */
	public void disca(String numero) {
		System.out.println("\nDiscando: " + numero);
	}

}
