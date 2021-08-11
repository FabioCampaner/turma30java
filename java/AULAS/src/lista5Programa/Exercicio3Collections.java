package lista5Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lista5classes.Estoque;
	/*
	 * Crie uma um programa para trabalhar com estoque de uma loja,
	 *  o programa deverá trabalhar com Collection do tipo List do Java
	 *  para manipular os dados desse estoque, o programa deverá atender
	 *  as seguintes funcionalidades:
	
	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.
	
	 */
public class Exercicio3Collections {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List <Estoque> estoque = new ArrayList<>();
		estoque.add(new Estoque("camiseta",10));
		estoque.add(new Estoque("calças",8));
		estoque.add(new Estoque("móveis",4));
		estoque.add(new Estoque("doces",100));
		
		System.out.println("Produtos da loja: ");
		System.out.println("Numero\tEstoque\tProduto ");
		for(Estoque item : estoque) {
			System.out.println(estoque.indexOf(item)+"\t"+ item.getEstoque()+"\t"+item.getProduto());
		}
		System.out.println("Escolha o número do produto para remover: ");
		int resposta = leia.nextInt();
		
		estoque.remove(resposta);
		
		System.out.println("Produtos da loja: ");
		System.out.println("Estoque\tProduto ");
		for(Estoque item : estoque) {
			System.out.println(item.getEstoque()+"\t"+item.getProduto());
		}
	
	}
	
	
}
