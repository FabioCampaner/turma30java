package application;

import entities.Funcionario;
import entities.Terceiro;

public class TesteFuncionario {

	public static void main(String[] args) {
		Terceiro funcionario1 = new Terceiro("001",8,110.0,10.0);
		Funcionario funcionario2 = new Funcionario("002",8,110.0);
		
		System.out.println("O sal�rio do funcion�rio terceirizado � "+funcionario1.salario());
		System.out.println("O sal�rio do funcion�rio � "+funcionario2.salario());
	}

}
