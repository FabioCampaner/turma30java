package lista4programa;

import lista4classes.Cliente;

public class lista4Exercicio1 {

	public static void main(String[] args) {
		
		/*
		 *  1 - Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe,
		 *   em seguida crie um objeto cliente, defina as instancias deste objeto e apresente 
		 *   as informa��es deste objeto no console.
		 */
		
		Cliente pessoa1 = new Cliente();
		
		pessoa1.anoNascimento = 2005;
		pessoa1.nome = "Irineu";
		
		System.out.println(pessoa1.nome+", bem vinde a nossa ad�ga.");
		
		System.out.println(pessoa1.maiorIdade(2021));
		
	}
}