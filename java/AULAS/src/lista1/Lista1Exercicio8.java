package lista1;
import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		

		/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem 
		 * do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem 
		 * do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de 
		 * fábrica de um carro e escreva o custo ao consumidor. 
		 */

		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoFinal, porcentagemDistribuidor, porcentagemImpostos;
		
		
		System.out.println("Digite o custo de fábrica do carro: ");
		custoFabrica = leia.nextDouble();
		
		
		porcentagemDistribuidor = ((custoFabrica / 100) * 28);
				
		porcentagemImpostos = ((custoFabrica / 100) * 45);
			
		custoFinal = (custoFabrica + porcentagemDistribuidor + porcentagemImpostos);
		
		
		System.out.println("O custo do carro para o consumidor será de: " + custoFinal + " reais");
		
		leia.close();
	}
}
