package exercicios;

public class Exc2_9NumerosImparesMultiplosDeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*PARA (For)
		 * Desenvolver um sistema que efetue a soma de todos os numeros impares que sao multiplos de tres
		 * e que se encontram no conjunto dos numeros de 1 ate 500.
		 */
		int i,soma=0;
		
		for(i=0;i<500;i++)
		{
			if(i%2!=0 && i%3==0)
			{
				soma += i;
			}
		}
		
		System.out.println("Resultado = "+soma);
	
	}

}
