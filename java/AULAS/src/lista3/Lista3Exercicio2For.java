package lista3;

import java.util.Scanner;

public class Lista3Exercicio2For {

	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner leia = new Scanner(System.in);
		
		int numeroDigitado, numeroPar = 0, numeroImpar = 0;
		
		for(int x = 0; x < 10; x++) {
			do {
				System.out.println("Digite n�meros inteiros positivos e diferentes de zero: ");
				numeroDigitado = leia.nextInt();
				if(numeroDigitado <= 0) {
					System.out.println("digite um valor v�lido!");
				}
			} while(numeroDigitado <= 0);
				
			if(numeroDigitado % 2 == 0) {
				numeroPar ++;
			}
			else if (numeroDigitado % 2 == 1) {
				numeroImpar++;
			}
		}
		System.out.printf("Foram digitados %d n�meros pares e %d n�meros �mpares!", numeroPar, numeroImpar);
		
		leia.close();
	}

}
