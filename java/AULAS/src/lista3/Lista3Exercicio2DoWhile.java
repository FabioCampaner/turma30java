package lista3;

import java.util.Scanner;



public class Lista3Exercicio2DoWhile {

	public static void main(String[] args) {
		/*Escrever um programa que receba vários números inteiros no teclado.
		 *  E no final imprimir a média dos números múltiplos de 3. Para sair 
		 *  digitar 0(zero).(DO...WHILE)
		 */
		Scanner leia = new Scanner(System.in);
		int numeroDigitado = 0, contador = 0, soma = 0;
		double media = 0;
		do {
			System.out.println("Digite números inteiros (digite [0] para parar): ");
			numeroDigitado = leia.nextInt();
			if (numeroDigitado % 3 == 0 && numeroDigitado != 0) {
				contador ++;
				soma += numeroDigitado;
			}
		} while(numeroDigitado != 0);
		
		media = (soma / contador);
		
		System.out.printf("A média dos números digitados que são múltiplos de 3 é: %.2f.", media);
	
		leia.close();
	}

}
