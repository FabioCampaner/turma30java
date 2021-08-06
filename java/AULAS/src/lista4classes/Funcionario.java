package lista4classes;

public class Funcionario {

	public String nome;
	public String cpf;
	public String rg;
	public double salario;
	
	public Funcionario(String nome, String cpf, String rg ) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public boolean cumprirDemanda (char cumprimento) {
		if (cumprimento == 'S') {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setSalario(double quantidade, double valorPorDemanda) {
		salario = (quantidade * valorPorDemanda);
	}
	
}
