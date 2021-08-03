package Lista2;

import java.util.Scanner;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int[] numero = new int[3];
		int menorNumero, maiorNumero, valorMaximo, valorMinimo, numeroMedio = 0;

		System.out.printf("Digite um valor m�nimo: ");
		valorMinimo = leia.nextInt();
		maiorNumero = valorMinimo; 
				
		System.out.printf("Digite um valor m�ximo: ");
		valorMaximo = leia.nextInt();
		menorNumero = valorMaximo;
		
		for (int contador = 0; contador < 3; contador++) {
		
			System.out.printf("Digite o %d� n�mero: ",contador+1);
			numero[contador] = leia.nextInt();
				
			if(numero[contador] > valorMaximo || numero[contador] < valorMinimo) {
				do {
				System.out.println("Escolha um n�mero dentro dos limites estabelecidos!");
				System.out.println("Digite novamente: ");
				numero[contador] = leia.nextInt();
				} while (numero[contador] > valorMaximo || numero[contador] < valorMinimo);
			}
			
			if (numero[contador] < menorNumero) {
						menorNumero = numero[contador];
			}
			if(numero[contador] > maiorNumero) {
					maiorNumero = numero[contador];
			}
		}
		for (int contador = 0; contador < 3; contador++) {
			
			if (numero[0] == numero[contador]) {
				numeroMedio = numero[0];
			}
			if (numero[contador] > menorNumero && numero[contador] < maiorNumero){
				numeroMedio = numero[contador];
			}
		}	
		
		
			System.out.printf("\n%d\n%d\n%d",menorNumero,numeroMedio, maiorNumero);
		
		
		leia.close();
	}
}
