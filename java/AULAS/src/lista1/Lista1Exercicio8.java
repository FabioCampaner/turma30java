package lista1;
import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		

		/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem 
		 * do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem 
		 * do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de 
		 * f�brica de um carro e escreva o custo ao consumidor. 
		 */

		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoFinal, porcentagemDistribuidor, porcentagemImpostos;
		
		
		System.out.println("Digite o custo de f�brica do carro: ");
		custoFabrica = leia.nextDouble();
		
		
		porcentagemDistribuidor = ((custoFabrica / 100) * 28);
				
		porcentagemImpostos = ((custoFabrica / 100) * 45);
			
		custoFinal = (custoFabrica + porcentagemDistribuidor + porcentagemImpostos);
		
		
		System.out.println("O custo do carro para o consumidor ser� de: " + custoFinal + " reais");
		
		leia.close();
	}
}
