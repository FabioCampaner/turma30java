package introducao;
import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		String nome;
		int anoNascimento, idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		nome = leia.next();
		
		/* para nome completo
		System.out.println("Digite o nome completo: ");
		nome = leia.nextLine();
		*/
				
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
				
		idade = 2021 - anoNascimento;
		
		System.out.print("Oi "+ nome +", sua idade é "+ idade +" anos.");
		
		leia.close();
	}
}
