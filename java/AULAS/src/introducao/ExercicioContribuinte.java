package introducao;

import java.util.Scanner;

public class ExercicioContribuinte {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		
		char genero;
		
		double salario;
		
		char finalPalavra;
		
		System.out.println("Digite o seu nome completo: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o gênero de preferência M - Masculino, F - feminino ou E - Neutro: ");
		genero = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Digite o salário em reais: ");
		salario = leia.nextDouble();
		
		if(genero == 'M') {
			finalPalavra = 'o';
		}
		else if (genero == 'F') {
			finalPalavra = 'a';
		}
		else {
			finalPalavra = 'e';
		}
		                           
		if(salario <= 2000) {
			System.out.println("ISENTO/ISENTA/ISENTE");
		}
		else if(salario <= 5000) {
			System.out.printf("Car%c %s, pague %.2f de imposto e recebe %.2f de salário bruto",finalPalavra,nome,(salario*0.15),(salario*0.85));
		}
		else {
			System.out.printf("Car%c, pague %.2f de imposto e recebe %.2f de salário bruto",finalPalavra,nome,(salario*0.25),(salario*0.75));
			
		}
		leia.close();
	}
}
