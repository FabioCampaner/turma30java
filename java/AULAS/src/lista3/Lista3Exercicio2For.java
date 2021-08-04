package lista3;

import java.util.Scanner;

public class Lista3Exercicio2For {

	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		Scanner leia = new Scanner(System.in);
		
		int numeroDigitado, numeroPar = 0, numeroImpar = 0;
		
		for(int x = 0; x < 10; x++) {
			do {
				System.out.println("Digite números inteiros positivos e diferentes de zero: ");
				numeroDigitado = leia.nextInt();
				if(numeroDigitado <= 0) {
					System.out.println("digite um valor válido!");
				}
			} while(numeroDigitado <= 0);
				
			if(numeroDigitado % 2 == 0) {
				numeroPar ++;
			}
			else if (numeroDigitado % 2 == 1) {
				numeroImpar++;
			}
		}
		System.out.printf("Foram digitados %d números pares e %d números ímpares!", numeroPar, numeroImpar);
		
		leia.close();
	}

}
