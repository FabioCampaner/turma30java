package lista1;
import java.util.Scanner;

public class Lista1Exercicio6 {

	public static void main(String[] args) {
		
		/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
		P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �:
		*/
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, d, raiz;
		
		System.out.println("Digite a localiza��o do ponto P1 no eixo horizontal: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite a localiza��o do ponto P1 no eixo vertical: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite a localiza��o do ponto P2 no eixo horizontal: ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite a localiza��o do ponto P2 no eixo vertical: ");
		y2 = leia.nextDouble();
		
		raiz = Math.pow((x2 - x1), 2)  + Math.pow((y2 - y1), 2);
		d = Math.sqrt(raiz);
		
		//fazer troca por fora das aspas no printf.
		//%f arredonda double
		//%d inteiro
		//%s string chama a string
		//%b boolean
		
		System.out.printf("A dist�ncia entre o ponto P1: (" + x1 + "; " + y1 + ") e P2: ("  + x2 + "; " + y2 + ") �: %.2f" + d);
		
		leia.close();	
	}
}
