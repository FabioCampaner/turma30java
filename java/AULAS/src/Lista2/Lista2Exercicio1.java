package Lista2;

import java.util.Scanner;

public class Lista2Exercicio1 {

	/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	 */
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int numerosDigitados = 3;
		int[] numero = new int[numerosDigitados];
		int maiorNumero = 0;
		
		
		for (int i = 0; i < numerosDigitados; i++)
		{
			
			System.out.printf("Digite o %d� n�mero: ",i+1);
			numero[i] = leia.nextInt();
			
			if(i != 0) 
			{
				if(numero[i] > numero[i-1]) 
				{
					maiorNumero = numero[i];
				}
			}
			else 
			{
				maiorNumero = numero[i];
			}
		}
		System.out.printf("O maior n�mero � %d.", maiorNumero);
		
		leia.close();
	}
}
