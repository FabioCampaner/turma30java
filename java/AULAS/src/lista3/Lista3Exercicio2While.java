package lista3;

import java.util.Scanner;

public class Lista3Exercicio2While {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas 
		 * dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: 
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 
		 * 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
		 *  calcule e mostre: (WHILE)
		 
		o n�mero de pessoas calmas; 
		o n�mero de mulheres nervosas; 
		o n�mero de homens agressivos; 
		o n�mero de outros calmos;
		o n�mero de pessoas nervosas com mais de 40 anos; 
		o n�mero de pessoas calmas com menos de 18 anos.
		*/
		Scanner leia = new Scanner(System.in);
		
		final int LIMITE_ENTREVISTADOS = 150;
		int x = 0,
		idade, 
		calmas = 0, 
		mulheresNervosas = 0, 
		homensAgressivos = 0, 
		outresCalmes = 0, 
		nervosasMaior40 = 0, 
		calmasMenor18 = 0;
		
		char genero, op;
		
		while(x < LIMITE_ENTREVISTADOS) {
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			leia.nextLine();
			
			System.out.println("Digite seu g�nero (1-feminino / 2-masculino / 3-Outros): ");
			genero = leia.next().charAt(0);
			
			System.out.println("Digite a op��o que mais se enquadra em voc�: \n 1 - pessoa calma;\n 2 - pessoa nervosa;\n 3 - pessoa agressiva ");
			System.out.println("Resposta: ");
			op = leia.next().charAt(0);
			if(op == '1') {
				calmas ++;
				if(genero == '3') {
					outresCalmes++;
				}
				if(idade < 18) {
					calmasMenor18++;
				}
			}
			else if (op == '2') {
				if(genero == '1') {
					mulheresNervosas++;
				}
				if(idade > 40) {
					nervosasMaior40++;
				}
			}
			else if (op == '3' && genero == '2') {
				homensAgressivos++;
			}
			x++;
		}
		System.out.printf("%d pessoa(s) calma(s); \n", calmas);
		System.out.printf("%d mulhere(s) nervosa(s); \n", mulheresNervosas);
		System.out.printf("%d homen(s) agressivo(s);\n", homensAgressivos);
		System.out.printf("%d identificade(s) como outro(s) calmo(s); \n", outresCalmes);
		System.out.printf("%d pessoa(s) nervosa(s) com mais de 40 anos; \n", nervosasMaior40);
		System.out.printf("%d pessoa(s) calma(s) com menos de 18 anos. \n", calmasMenor18);
		
		leia.close();
	}

}
