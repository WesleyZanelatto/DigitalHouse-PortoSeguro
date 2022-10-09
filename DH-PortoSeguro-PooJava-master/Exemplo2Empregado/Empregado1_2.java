package pooJava.Exemplo2Empregado;

import java.text.NumberFormat; // Biblioteca que altera o formato da moeda para configuração que ja esta o sistema operacional, no nosso caso R$

public class Empregado1_2 {

	//Criação dos Atributos
	private String nome;
	private double salario;
	
	// Método Especial Construtor
	public Empregado1_2(String n,double s)//O nome do Construtor deve ter o mesmo nome da Minha Classe | Com dois paramentros n e s
	{
		this.setNome(n); // Ja esta iniciando com o paramentro n, pois setNome esta iniciando com paramentro n | set é um modificador
		this.setSalario(s); // Ja esta iniciando com o paramentro s, pois setSalario esta iniciando com paramentro s | set é um modificador
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Criando outros Métodos próprios, ou seja, Métodos da propria Classe
	public void aumentaSalario(double percentual)
	{
		salario *= 1 + percentual / 100; //salario = (salario * (1 + percentual / 100))
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // Coloca a moeda do país de acordo com a configuração do computador | nf é uma variável
		nf.setMinimumFractionDigits(2);//É um Método que indica quantas casas depois da virgula
		String formatoMoeda = nf.format(salario); // formata um valor para uma formatação monetária | salario é o Atributo | formatoMoeda é uma variavel
		return formatoMoeda; // retorna o formatoMoeda
	}
	
	public void imprimir()
	{
		System.out.println(nome+"\t\t" + "Salário: " + this.formatarMoeda());// nome que é o Atributo | this.formatarMoeda() esta comunicando dois Métodos da propria Classe
	}
	
}
