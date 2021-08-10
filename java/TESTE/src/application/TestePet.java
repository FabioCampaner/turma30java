package application;

import entities.Ave;
import entities.Cachorro;
import entities.Gato;
import entities.Pet;

public class TestePet {

	public static void main(String[] args) {
		
		Pet animal1 = new Pet("Angorra",2019);
		Cachorro pet1 = new Cachorro("Pitbull", true);
		Gato pet2 = new Gato("Seamês", false);
		Ave pet3 = new Ave("Frango", false);
		
		animal1.setPorte('M');
		
		System.out.println(animal1.getRaca());
		System.out.println("A idade do bicho é "+(2021 - animal1.getAnoNascimento())+" anos.");
		animal1.emiteSom();
		pet1.emiteSom();
		pet2.emiteSom();
		pet3.emiteSom();
	}

}
