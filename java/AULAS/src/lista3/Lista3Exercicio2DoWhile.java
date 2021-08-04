package lista3;

import java.util.Scanner;



public class Lista3Exercicio2DoWhile {

	public static void main(String[] args) {
		/*Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 *  E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair 
		 *  digitar 0(zero).(DO...WHILE)
		 */
		Scanner leia = new Scanner(System.in);
		int numeroDigitado = 0, contador = 0, soma = 0;
		double media = 0;
		do {
			System.out.println("Digite n�meros inteiros (digite [0] para parar): ");
			numeroDigitado = leia.nextInt();
			if (numeroDigitado % 3 == 0 && numeroDigitado != 0) {
				contador ++;
				soma += numeroDigitado;
			}
		} while(numeroDigitado != 0);
		
		media = (soma / contador);
		
		System.out.printf("A m�dia dos n�meros digitados que s�o m�ltiplos de 3 �: %.2f.", media);
	
		leia.close();
	}

}
