package lista3;

import java.util.Scanner;

public class Lista3Exercicio1DoWhile {

	public static void main(String[] args) {
		/*Crie um programa que leia um número do teclado até que encontre um número igual a zero.
		No final, mostre a soma dos números digitados.(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		
		double numeroDigitado = 0, soma = 0;
		
		do {
			System.out.println("Digite um número para fazer um somatório (digite [0] para parar): ");
			numeroDigitado = leia.nextDouble();
			
			soma += numeroDigitado;
		} while (numeroDigitado != 0);
		System.out.printf("A soma dos números digitados é: %.2f.", soma);
		
		leia.close();
	}

}
