package lista4programa;


import lista4classes.Paciente;

public class Lista4Exercicio7 {

	public static void main(String[] args) {
		/*
		 * 7 -  Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as
		 *  informações deste objeto no console.
		 */ 
		Paciente pessoa1 = new Paciente("Marcolina", "Covid");

		pessoa1.setEstado('L'); // G - Grave, C - Controlado, L - Leve.
		
		pessoa1.setInternacao();
		
		System.out.println(pessoa1.nome+" está com "+pessoa1.doenca+" em estado "+pessoa1.getEstado()+".");
		
		if (pessoa1.getInternacao()) {
			System.out.println("Por isso precisará de internação.");
		}
		else {
			System.out.println("Por isso pode voltar para casa, tomando as devidas medicações.");
		}
		
	}

}
