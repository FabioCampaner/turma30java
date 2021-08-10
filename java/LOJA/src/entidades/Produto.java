package entidades;

import java.util.Scanner;

public class Produto {

	//Atributos
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;
	
	//Construtores
	public Produto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		if (estoque < 0) {
			this.estoque = 0;
		}
		else {
			this.estoque = estoque;
		}
	}

	//Encapsulamento - Métodos
	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	/*
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	} */
	
	public void incluiEstoque(int quantidade) {
		if(quantidade <= 0) {
			System.out.println("Quantidade incorreta.");
		}
		else {
			this.estoque += quantidade;
		}
	}
	
	public void retiraEstoque(String quantidade, Scanner leia) {
		boolean validar = false;
		do {
		if(Integer.parseInt(quantidade) > this.estoque) {
			System.out.println("Quantidade indisponível.");
			quantidade = leia.next();
		}
		else if(Integer.parseInt(quantidade) < 0) {
			System.out.println("Digite uma quantidade positiva.");
			quantidade = leia.next();
		}
		else {
			this.estoque -= Integer.parseInt(quantidade);
			validar = true;
		}
		} while(validar == false);
	}
	
}
