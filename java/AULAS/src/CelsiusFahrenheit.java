
import java.util.Locale;
import java.util.Scanner;

public class CelsiusFahrenheit {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String nome;
		double celsius, fahrenheit;
		Scanner leia = new Scanner(System.in);
			
		System.out.println("Digite um nome: ");
		nome = leia.next();
	
		
		System.out.println("Digite a temperatura em Celsius: ");
		celsius = leia.nextDouble();
					
		fahrenheit = ((celsius * 1.8) + 32);
			
		System.out.print("Oi "+ nome +", a temperatura é "+ fahrenheit +"°F.");
		
		leia.close();
	}

}
