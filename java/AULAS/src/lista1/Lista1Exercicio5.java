package lista1;
import java.util.Scanner;

public class Lista1Exercicio5 {
	
	public static void main(String[] args) {
		
		/*5. Fa�a um sistema que leia as 3 notas de um aluno e
		calcule a m�dia final deste aluno. Considerar que a m�dia
		� ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
		*/
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite sua primeira nota: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Digite sua primeira nota: ");
		nota3 = leia.nextDouble();
		
		
		media = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 3);
		
		
		System.out.println("Essa � a sua m�dia final: " + media);
		
		leia.close();
	}
}
