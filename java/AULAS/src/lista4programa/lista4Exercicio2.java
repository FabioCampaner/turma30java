package lista4programa;

import lista4classes.Aviao;

public class lista4Exercicio2 {

	public static void main(String[] args) {
		
		/*
		 * 2 - Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
		 *  em seguida crie um objeto avião, defina as instancias deste objeto e apresente as
		 *   informações deste objeto no console.
		 */
		
		Aviao maquina1 = new Aviao("Boeing-747", "John Travolta");
		
		maquina1.manutencao = true;
		
		maquina1.possibilidadeVoar();
		
		maquina1.ligarMotor('S');
		
		if (maquina1.motor) {
			System.out.println("Decolagem já vai começar!");
			System.out.printf("A viagem durará cerca de %.2f horas.",(maquina1.horasViagem(18460, 988)));
		}
		
		
		
		

	}

}
