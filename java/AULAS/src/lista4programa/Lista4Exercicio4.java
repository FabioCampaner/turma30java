package lista4programa;

import java.util.Scanner;

import lista4classes.Funcionario;

public class Lista4Exercicio4 {

	public static void main(String[] args) {
		
		/*
		 * 4 - Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe,
		 *  em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as
		 *  informações deste objeto no console.
		 */
		Funcionario destaqueMes = new Funcionario("Joana","555.444.333-22"," 11.122.233-3");
		Scanner leia = new Scanner(System.in);
		
		destaqueMes.setSalario(15, 200);
		char resposta;
		System.out.println("Você cumpriu a sua demanada? [S/N]: ");
		resposta = leia.next().toUpperCase().charAt(0);
		
		if(destaqueMes.cumprirDemanda(resposta)) {
			
			System.out.printf("%s\nCPF %s\nRG %s\nSeu salário será de %.2f.", destaqueMes.nome, destaqueMes.cpf, destaqueMes.rg ,destaqueMes.salario );
		}
		else {
			System.out.printf("%s\nCPF %s\nRG %s\nTermine o que falta para ver o seu salário.", destaqueMes.nome, destaqueMes.cpf, destaqueMes.rg );
			
		}
	}

}
