package pooJava.Exemplo3Pessoa;

public class EmpregadoUm1_3 extends Pessoa1_3 {
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	//Método Especial Construtor
	public EmpregadoUm1_3(String nome,String endereco,String cpf, int telefone, int idade, int codigoSetor, float salarioBase, float imposto)
	{
		super(nome,endereco,cpf,telefone,idade); //Atributos da SuperClasse Pessoa1_3
		this.codigoSetor = codigoSetor; // Atributo da SubClasse empregado1_3
		this.salarioBase = salarioBase;// Atributo da SubClasse empregado1_3
		this.imposto = imposto;// Atributo da SubClasse empregado1_3
	}
	
	//Criação dos Métodos da classe
	public int getCodigoSetor() { // get => é utilizado quando por exemplo você quer consultar o valor/conteúdo de um atributo.
		return codigoSetor;		  //É usado apenas para exibir/return(retornar) valor, nunca pra alterar.
	}

	public void setCodigoSetor(int codigoSetor) { // set => é usado quando você quer alterar o valor/conteúdo de um atributo do objeto.
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	public void imprimirInfo() // Método para imprimirInfo
	{
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF: "+getCpf()+"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+
				"\nEndereço: "+getEndereco()+"\nCódigo do Setor: "+codigoSetor+"\nSalário base: "+salarioBase+
				"\nValor em porcentagem (sem o %) de imposto a ser retido do salário: "+imposto);
	}
	
	public void calcularSalario() // Método para calcularSalario
	{
		double salarioLiquido = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO salário total a ser recebido pelo empregado: "+getNome()+
				" é igual a: "+salarioLiquido);
	}
	
}
