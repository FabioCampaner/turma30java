package Lista2;

import java.util.Scanner;

public class Lista2Exercicio4 {
	public static void main(String[] args) {
		
		Scanner leia  = new Scanner (System.in);
		
		double numero;
		
		
		System.out.printf("Digite um n�mero: ");
		numero = leia.nextDouble();
		
		if (numero < 0) {
			System.out.printf("N�mero negativo.");
		}
		else if(numero == 0) 
		{
			System.out.printf("N�mero neutro!\n");
		}
		
		else if (numero % 2 == 0) 
		{
			System.out.printf("N�mero par!\n");
			System.out.printf("A ra�z quadrada de %.2f � :%.2f", numero, (Math.sqrt(numero)));
		}
		else 
		{
			System.out.printf("N�mero �mpar!\n");
			System.out.printf("%.2f ao quadrado � :%.2f", numero, (Math.pow(numero, 2)));
		}
		
		leia.close();
	}
}
