package Lista2;

import java.util.Scanner;

public class Lista2Exercicio1 {

	/*Faça um programa que receba três inteiros e diga qual deles é o maior.
	 */
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int numerosDigitados = 3;
		int[] numero = new int[numerosDigitados];
		int maiorNumero = 0;
		
		
		for (int i = 0; i < numerosDigitados; i++)
		{
			
			System.out.printf("Digite o %d° número: ",i+1);
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
		System.out.printf("O maior número é %d.", maiorNumero);
		
		leia.close();
	}
}
