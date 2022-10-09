package exercicios;

public class Exc2_12ContagemDe233a456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* do while
		 * Faça um programa que mostre uma contagem na tela de 233 a 456, só que
		 * contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
		 */
		
		int n=229;
		
		do
		{
			if(n>=300 && n<=400)
			{
				n += 2;
				System.out.println(" "+n);
			}
			else
			{
				n += 4;
				System.out.println(" "+n);
			}
			
			n++;
		}
		while(n>=233 && n<453);
	}

}
