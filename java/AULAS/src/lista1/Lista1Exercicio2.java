package lista1;
import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		
		/*2. Faça um sistema que leia a idade de uma pessoa 
		 * expressa em dias e mostre-a expressa em anos, meses e dias. 
		*/
		
		Scanner leia = new Scanner(System.in);
		int idadeDias, ano, mes, dia;
		
		System.out.println("Digite o número de dias da sua vida: ");
		idadeDias = leia.nextInt();
		
		ano = (idadeDias / 365);
		mes = ((idadeDias % 365) / 30);
		dia = ((idadeDias % 365) % 30);
		
		System.out.println("O total de anos é: "+ ano);
		System.out.println("O total de meses é: "+ mes);
		System.out.println("O total de dias é: "+ dia);
		
		leia.close();
	}
}
