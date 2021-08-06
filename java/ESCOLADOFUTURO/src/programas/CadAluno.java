package programas;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		String[] alunes = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa","Andrei Felipe Corrêa de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu","Caio Saldanha Motta","Cássia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento","Fábio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Flávio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes","João Pedro Cruz Gomes","José Paulo de Matos Ferreira Neto","Letícia Porto Martins","Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani","Natália Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa","Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima","Thiago da Silva Machado","Vinícios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"}; 
		int[] notas = new int[alunes.length];
		int novaNota;
		String[] matriculas = new String[alunes.length]; //MAT-0X
		String matriculaEscolhida;
		boolean[] ativo = new boolean[alunes.length];
		char resposta, atividadeAlune;
		
		for(int x = 0; x < alunes.length; x++) {
			ativo[x] = true;

			if(x >= 9) {
				matriculas[x] = "MAT-"+(x+1);
			}
			else {
				matriculas[x] = "MAT-0"+(x+1);
			}
			
		}
		for(int x = 0; x < alunes.length; x++) {
			
			System.out.println(matriculas[x]+"\t\tNota: "+notas[x]+"\t\tSituação: "+((ativo[x])?"Ativo":"Inativo")+"\t\t"+alunes[x]);
		}
		do {
			System.out.println("\nDigite uma matrícula: ");
			matriculaEscolhida = leia.next().toUpperCase();
			for (int x = 0; x < alunes.length; x++) {
				if (matriculaEscolhida.equals(matriculas[x])) {
					System.out.println(matriculas[x]+"\t"+alunes[x]);
					System.out.println("Digite a nota desse aluno: ");
					novaNota = leia.nextInt();
					notas[x] = novaNota;
					
					System.out.println("Digite se o aluno está ativo[A] ou inativo[I]: ");
					atividadeAlune = leia.next().toUpperCase().charAt(0);
					
					if (atividadeAlune == 'A') {
						ativo[x] = true;
					}
					else {
						ativo[x] = false;
					}
					
				}	
			}
			
			
			System.out.println("Continuar? [S/N]: ");
			resposta = leia.next().toUpperCase().charAt(0);
		} while(resposta == 'S');
		
		for (int x = 0; x < alunes.length; x++) {
			if (notas[x] <= 5 && notas[x] != 0) {
				System.out.println("Estude mais");
			}
			else if(notas[x] > 5) {
				System.out.println("ótimo, continue assim!");
			}
		}
		
	}

}
