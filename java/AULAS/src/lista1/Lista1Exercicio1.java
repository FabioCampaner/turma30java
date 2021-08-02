package lista1;
import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
		 * meses e dias e mostre-a expressa apenas em dias. 
		 */
		
		Scanner leia = new Scanner(System.in);
		int ano, mes, dia, idade;
		
		System.out.println("Digite o ano do seu nascimento: ");
		ano = leia.nextInt();
		
		System.out.println("Digite o mês do seu nascimento: ");
		mes = leia.nextInt();
		
		System.out.println("Digite o dia do seu nascimento: ");
		dia = leia.nextInt();
		
		idade = (((2021 - ano) * 365) + (mes * 30) + dia);
		
		System.out.println("Você tem aproximadamente "+ idade +" dias de idade!");
		leia.close();
	}
}
