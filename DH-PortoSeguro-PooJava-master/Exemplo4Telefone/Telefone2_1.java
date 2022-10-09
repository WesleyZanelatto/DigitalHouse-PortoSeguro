package pooJava.Exemplo4Telefone;

public abstract class Telefone2_1 { // Declarando a Classe abstract Telefone2_1

	// Criando os Atributos da classe
	private String tipo;

	/*
	 * CRIANDO MÉTODOS ABSTRATOS Não se deve implementar os Métodos abstratos na
	 * super classe abstrata quem DEVE implementar são as SubClasses que vão puxar a
	 * herança e criar o Polimorfismo para sobrescrever esses Métodos Abstratos.
	 */
	abstract public void disca(String numero);// Método abstrato disca com (parametro String numero)

	abstract public void toca(int numToques);// Método abstrato toca com (parametro int numToques)

	// Criando Método Especial Construtor
	public Telefone2_1(String tipo) {
		this.tipo = tipo; // Recebe "Telefone Celular" de Celular2_1 || "Telefone fixo" de Fixo2_1 || "Telefone público" de Publico2_1,
						  // ou seja, this.tipo = "Telefone Celular" || "Telefone fixo" || "Telefone público"
	}

	// Criação dos Métodos da classe Getters and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
