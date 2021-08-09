package lista5Programa;

import lista5classes.Cachorro;
import lista5classes.Cavalo;
import lista5classes.Preguica;

public class SomAnimais {

	public static void main(String[] args) {
		
		/*	
		 * Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior
		 *  e invoque o método que emite o som de cada um de forma polimórfica, isto é, independente
		 *  do tipo de animal.
		 */

		Cavalo animal1 = new Cavalo(4, 2, 'C', "Mamífero", 6, true, "Amarela", true, "Cavalo");
		Cachorro animal2 = new Cachorro(4, 2, 'L', "Mamífero", 3, true, true, "Beagle", 'G', true, "Cachorro");
 		Preguica animal3 = new Preguica(4, 2, 'C', "Mamífero", 8, true, 20, false, "Brasil", "Bicho-Preguiça");
 		
 		System.out.print(animal1.getEspecie()+" emite esse som: ");
 		animal1.emitirSons();
 		
 		System.out.print(animal2.getEspecie()+" emite esse som: ");
 		animal2.emitirSons();
 		
 		System.out.print(animal3.getEspecie()+" emite esse som: ");
 		animal3.emitirSons();
	}

}
