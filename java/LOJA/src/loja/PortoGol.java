package loja;

import java.util.Scanner;

import entidades.Produto;

public class PortoGol {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		Produto estoque = new Produto("000","patins",20.00,5);
		
		System.out.println("Digite a quantidade: ");
		String quantidade = leia.next();
		estoque.retiraEstoque(quantidade, leia);
		
		
		System.out.println("Digite uma resposta: ");
		int resposta = leia.nextInt();
		validar(resposta);
		System.out.println("PASSOU");
	}
	
	public static void validar(int resposta) {
		if(resposta < 0) {
			System.out.println("Resposta inválida");
			System.out.println("Digite novamente: ");
			resposta = leia.nextInt();
			validar(resposta);
		}
		else {
			System.out.println("Valeu");
		}
	}
}
