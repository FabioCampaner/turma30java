package lista3;

import java.util.Scanner;

public class Lista3Exercicio1DoWhile {

	public static void main(String[] args) {
		/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
		No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		
		double numeroDigitado = 0, soma = 0;
		
		do {
			System.out.println("Digite um n�mero para fazer um somat�rio (digite [0] para parar): ");
			numeroDigitado = leia.nextDouble();
			
			soma += numeroDigitado;
		} while (numeroDigitado != 0);
		System.out.printf("A soma dos n�meros digitados �: %.2f.", soma);
		
		leia.close();
	}

}
