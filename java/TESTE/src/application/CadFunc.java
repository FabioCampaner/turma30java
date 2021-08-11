package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class CadFunc {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Funcionario> folha = new ArrayList<>();
		char op;
		do {
			System.out.println("Funcionário: F - Funcionário ou T - Terceiro: ");
			char tipo = leia.next().toUpperCase().charAt(0);
			
			System.out.println("Digite a matrícula: ");
			String matricula = leia.next().toUpperCase();		
			
			System.out.println("Digite as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			
			System.out.println("Digite o valor por hora: R$ ");
			double valorHora = leia.nextDouble();
			
			if (tipo == 'T') {
				System.out.println("Digite o valor do adicional: R$ ");
				double adicional = leia.nextDouble();
				folha.add(new Terceiro(matricula, horasTrabalhadas, valorHora, adicional));
			} 
			else if (tipo == 'F') {
				folha.add(new Funcionario(matricula, horasTrabalhadas, valorHora));
			}
			System.out.println("Continua [S/N]: ");
			op = leia.next().toUpperCase().charAt(0);
		} while(op == 'S');
		
		for(Funcionario func : folha) {
			System.out.printf("%s seu salário é R$ %.2f.\n",func.getMatricula(),func.salario());
		}
		leia.close();
	}
}
