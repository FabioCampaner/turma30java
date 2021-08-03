package Lista2;

import java.util.Scanner;

public class Lista2Exercicio3 {
	public static void main(String[] args) {
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
			18-25 adulto
		*/
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade < 10) {
			System.out.println("Jovem demais!");
		}
		else if (idade <= 14) {
			System.out.println("Categoria Infantil.");
		}
		else if (idade <= 17) {
			System.out.println("Categoria Juvenil.");
		}
		else if (idade <= 25) {
			System.out.println("Categoria Adulto.");
		}
		else {
			System.out.println("Você está acima do limite etário.");
		}
		
		leia.close();
	}
}
