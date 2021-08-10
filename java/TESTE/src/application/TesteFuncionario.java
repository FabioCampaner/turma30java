package application;

import entities.Funcionario;
import entities.Terceiro;

public class TesteFuncionario {

	public static void main(String[] args) {
		Terceiro funcionario1 = new Terceiro("001",8,110.0,10.0);
		Funcionario funcionario2 = new Funcionario("002",8,110.0);
		
		System.out.println("O salário do funcionário terceirizado é "+funcionario1.salario());
		System.out.println("O salário do funcionário é "+funcionario2.salario());
	}

}
