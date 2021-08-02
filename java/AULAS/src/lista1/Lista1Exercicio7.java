package lista1;
import java.util.Scanner;

public class Lista1Exercicio7 {

	public static void main(String[] args) {
		
		/*7. Um sistema de equações lineares do tipo: 
		, pode ser resolvido segundo mostrado abaixo : 
		 
		Escreva um sistema que lê os coeficientes 
		a,b,c,d,e e f e calcula e mostra os valores de x e y. 
		*/
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite um valor para a: ");
		a = leia.nextDouble();
		
		System.out.println("Digite um valor para b: ");
		b = leia.nextDouble();
		
		System.out.println("Digite um valor para c: ");
		c = leia.nextDouble();
		
		System.out.println("Digite um valor para d: ");
		d = leia.nextDouble();
		
		System.out.println("Digite um valor para e: ");
		e = leia.nextDouble();
		
		System.out.println("Digite um valor para f: ");
		f = leia.nextDouble();
		
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
				
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		
		System.out.println("Os valores de X e Y são respectivamente " + x + " e " + y);
		
		leia.close();
	}
}
