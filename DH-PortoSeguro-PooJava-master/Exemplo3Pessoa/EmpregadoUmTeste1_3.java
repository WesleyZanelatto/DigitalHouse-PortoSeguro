package pooJava.Exemplo3Pessoa;

public class EmpregadoUmTeste1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpregadoUm1_3 emp = new EmpregadoUm1_3("Edu","Rua da Marola, 386","54443366776",948484848,22,123,20000,15);
		
		if(emp.validarCpf() == true)
		{
			emp.imprimirInfo();
			emp.calcularSalario();
		}
		else
			{
			System.out.println("----Número CPF Inválido\nPor favor, tente novamente.");
			}
				
	}

}
