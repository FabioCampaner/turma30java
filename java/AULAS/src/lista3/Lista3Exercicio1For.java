package lista3;



public class Lista3Exercicio1For {

	public static void main(String[] args) {
		//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		 
		
		for (int numero = 1000; numero < 2000; numero++) {
			if (numero % 11 == 5) {
				System.out.println(numero);	
			}
		}
	}
}
