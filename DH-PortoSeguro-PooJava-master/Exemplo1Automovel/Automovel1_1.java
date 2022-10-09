package pooJava.Exemplo1Automovel;

public class Automovel1_1 {

		//Declaração dos Atributos da classe Automóvel1_1
		private String nomeProprietario; // Atributo= [modificador] Tipo nome
		private String modelo; // Atributo= [modificador] Tipo nome
		private String placa; // Atributo= [modificador] Tipo nome
		private int ano; // Atributo= [modificador] Tipo nome
		//private => Garante a segurança dessas informações pois somente está classe tem acesso a essas informações
		
		//Criação do Método Especial Construtor
		public Automovel1_1(String nomeProprietario,String modelo,String placa,int ano) //Método => [modificador] nome(parametros separados por ,)
		{
			super(); // Idica que são Atributos da Super Classe
			this.nomeProprietario = nomeProprietario; // this.nomeProprietario(se refere a você mesmo, é o próprio Atributo)
			this.modelo = modelo; // this.modelo(se refere a você mesmo, é o próprio Atributo)
			this.placa = placa; // this.placa(se refere a você mesmo, é o próprio Atributo)
			this.ano = ano; // this.ano(se refere a você mesmo, é o próprio Atributo)
		}
		
		//Criação dos Métodos da classe
		//Botão direito / Source / Generate Getters and Setters
		public String getNomeProprietario() { // get => é utilizado quando por exemplo você quer consultar o valor/conteúdo de um atributo. 
			return nomeProprietario;		  //É usado apenas para exibir/return(retornar) valor, nunca pra alterar.
		}
		public void setNomeProprietario(String nomeProprietario) {// set => é usado quando você quer alterar o valor/conteúdo de um atributo do objeto.
			this.nomeProprietario = nomeProprietario;
		}
		public String getModelo() {// get => é utilizado quando por exemplo você quer consultar o valor/conteúdo de um atributo.
			return modelo;		   //É usado apenas para exibir/return(retornar) valor, nunca pra alterar.
		}
		public void setModelo(String modelo) { // set => é usado quando você quer alterar o valor/conteúdo de um atributo do objeto.
			this.modelo = modelo;
		}
		public String getPlaca() { // get => é utilizado quando por exemplo você quer consultar o valor/conteúdo de um atributo.
			return placa;		   //É usado apenas para exibir/return(retornar) valor, nunca pra alterar.
		}
		public void setPlaca(String placa) {// set => é usado quando você quer alterar o valor/conteúdo de um atributo do objeto.
			this.placa = placa;
		}
		public int getAno() { // get => é utilizado quando por exemplo você quer consultar o valor/conteúdo de um atributo.
			return ano;		  //É usado apenas para exibir/return(retornar) valor, nunca pra alterar.
		}
		public void setAno(int ano) {// set => é usado quando você quer alterar o valor/conteúdo de um atributo do objeto.
			this.ano = ano;
		}

		
		
		public void imprimirInfo() // Criando um método independente, para realizaer o que eu acho necessario. Void, pois será sem retorno
		{
			System.out.println(nomeProprietario+ " possui um(a) "+modelo+" com placa: "+placa+" e ano: "+ano);
		}
	
}
