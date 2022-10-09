package pooJava.Exemplo3Pessoa;

public class Cliente1_3 extends Pessoa1_3 {

	private int codigoCliente;
	private String ultimaCompra;

	public Cliente1_3(int codigoCliente, String nome, String cpf, String endereco, int telefone, int idade,
			String ultimaCompra) {
		super(nome, cpf, endereco, telefone, idade);
		this.codigoCliente = codigoCliente;
		this.ultimaCompra = ultimaCompra;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getUltimaCompra() {
		return ultimaCompra;
	}

	public void setUltimaCompra(String ultimaCompra) {
		this.ultimaCompra = ultimaCompra;
	}

	public void imprimirInfo() // Método para imprimirInfo
	{
		System.out.println("\nCódigo do cliente: " + codigoCliente + "\nNome: " + getNome() + "\nCPF: " + getCpf()
				+ "\nEndereço: " + getEndereco() + "\nTelefone: " + getTelefone() + "\nIdade: " + getIdade()
				+ "\nData da última compra: " + ultimaCompra);
	}

}
