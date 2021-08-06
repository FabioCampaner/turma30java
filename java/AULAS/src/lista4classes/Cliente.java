package lista4classes;

public class Cliente {

	public String nome;
	public int anoNascimento;
	public double dinheiro;
	public boolean interesseCompra;
	
	
	public String maiorIdade (int anoAtual) {
		int idade = anoAtual - anoNascimento; 
		if (idade >= 18) {
		return "Você pode comprar nossos produtos. \nVocê tem "+idade+" anos, então é maior de idade";
		}
		else {
			return "Você não pode comprar nossos produtos. \nParece que você tem somente "+idade+" anos de idade";
		}
			
	}
}
