package aulas;

// import java.util.Scanner;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner  ler = new Scanner(System.in);
		
		float x=5,y=10;
		
		System.out.println("\n***Valores iniciais*** \nValor de X="+x+"\nValor de y="+y);
		System.out.println("\n--------------------------------\n\n***Operadores de Atribui��o***");
		x=5;y=10;
		System.out.println("\nExpress�o 'x+=y' = "+(x+=y)+" --> Significado 'x=x+y' (Somando)");
		x=5;y=10;
		System.out.println("Express�o 'x-=y' = "+(x-=y)+" --> Significado 'x=x-y' (Subtraindo)");
		x=5;y=10;
		System.out.println("Express�o 'x*=y' = "+(x*=y)+" --> Significado 'x=x*y' (Multiplicando)");
		x=5;y=10;
		System.out.println("Express�o 'x/=y' = "+(x/=y)+" --> Significado 'x=x/y' (Dividindo)");
				
	}

}
