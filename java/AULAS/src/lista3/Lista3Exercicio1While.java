package lista3;

import java.util.Scanner;

public class Lista3Exercicio1While {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
		 *  Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */
		Scanner leia = new Scanner(System.in);
		
		int idade =0, totalizadorMaior = 0, totalizadorMenor = 0;
		
		while(idade != -99) {
			System.out.println("Digite a idade (qualquer valor inapropriado será descartado); ");
			System.out.println("Ou digite -99 para parar: ");
			idade = leia.nextInt();
			if(idade < 21 && idade > 0) {
				totalizadorMenor ++;
			}
			if(idade > 5 && idade < 110) {
				totalizadorMaior++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos é " + totalizadorMenor);
		System.out.println("Total de pessoas com mais de 50 anos é " + totalizadorMaior);
		leia.close();
	}

}
