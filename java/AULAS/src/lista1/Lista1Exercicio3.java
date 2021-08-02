package lista1;
import java.util.Scanner;

public class Lista1Exercicio3 {
	
	public static void main (String[] args) {
		/*
		3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
		e mostre-o expresso em horas, minutos e segundos. 
		*/
		
		Scanner leia = new Scanner(System.in);
		
		int segundos, horas, minutos, segundoFinal, minutoFinal;
		
		
		System.out.println("Digite o tempo de duração do evento da fábrica (em segundos): ");
		segundos = leia.nextInt();
		
		minutos = (segundos / 60);

		horas = (minutos / 60);

		segundoFinal = (segundos % 60);
				
		minutoFinal = (minutos % 60);
		
				
		System.out.println("O tempo em horas foi de: "+ horas);
		System.out.println("O tempo em minutos foi de: "+ minutos);
		System.out.println("O tempo em segundos foi de: "+ segundos);
		
		System.out.println("Totalizando " + horas + " horas, " + minutoFinal + " minutos e " + segundoFinal + " segundos.");
		
		leia.close();
	}
}
