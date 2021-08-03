package Lista2;

import java.util.Scanner;

public class Lista2Exercicio4 {
	public static void main(String[] args) {
		
		Scanner leia  = new Scanner (System.in);
		
		double numero;
		
		
		System.out.printf("Digite um número: ");
		numero = leia.nextDouble();
		
		if (numero < 0) {
			System.out.printf("Número negativo.");
		}
		else if(numero == 0) 
		{
			System.out.printf("Número neutro!\n");
		}
		
		else if (numero % 2 == 0) 
		{
			System.out.printf("Número par!\n");
			System.out.printf("A raíz quadrada de %.2f é :%.2f", numero, (Math.sqrt(numero)));
		}
		else 
		{
			System.out.printf("Número ímpar!\n");
			System.out.printf("%.2f ao quadrado é :%.2f", numero, (Math.pow(numero, 2)));
		}
		
		leia.close();
	}
}
