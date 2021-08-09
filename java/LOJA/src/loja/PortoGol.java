package loja;

import java.util.Scanner;

public class PortoGol {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
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
