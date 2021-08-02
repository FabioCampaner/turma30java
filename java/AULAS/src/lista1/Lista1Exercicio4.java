package lista1;
import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main (String[] args) {
		
		/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
		 * e calcule a seguinte expressão: D=(R + S) sendo R=(A+B)² e S=(B+C)²
		*/
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, r, s, d;
		
		System.out.println("Vamos calcular o valor de D! Escolha números inteiros positivos: ");
		System.out.println("Digite o primeiro número: ");
		a = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
				
		s = Math.pow((b + c), 2);

		d = (r + s) / 2;
				
		System.out.println("O resultado da expressão é: " + d);
		leia.close();
	}
	
}
