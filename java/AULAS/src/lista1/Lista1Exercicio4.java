package lista1;
import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main (String[] args) {
		
		/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) 
		 * e calcule a seguinte express�o: D=(R + S) sendo R=(A+B)� e S=(B+C)�
		*/
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, r, s, d;
		
		System.out.println("Vamos calcular o valor de D! Escolha n�meros inteiros positivos: ");
		System.out.println("Digite o primeiro n�mero: ");
		a = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		b = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
				
		s = Math.pow((b + c), 2);

		d = (r + s) / 2;
				
		System.out.println("O resultado da express�o �: " + d);
		leia.close();
	}
	
}
