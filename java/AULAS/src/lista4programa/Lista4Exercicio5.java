package lista4programa;

import lista4classes.Patinete;

public class Lista4Exercicio5 {

	public static void main(String[] args) {
		/*
		 * 5 -  Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as
		 *  informações deste objeto no console. 
		 */ 
		Patinete meuPatinete = new Patinete("Scooter", "Killer of the Road", "sombrio com chamas" );
		
		meuPatinete.fabricacao = 1990;
		
		meuPatinete.setConservacao('S');
		
		System.out.println("Meu patinete está há "+meuPatinete.tempoUso(2021)+" anos arrasando nas estradas"+((meuPatinete.conservacao)?" e está perfeito!":" e está destruído, porém continua mortal!!!"));
		
		System.out.println("O design do patinete é "+meuPatinete.estilo+"! E se chama "+meuPatinete.apelido+"!!!");
		
	}

}
