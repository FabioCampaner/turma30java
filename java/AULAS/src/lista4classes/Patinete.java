package lista4classes;

public class Patinete {

	public String marca;
	public int fabricacao;
	public boolean conservacao;
	public String estilo;
	public String apelido;
	
	public Patinete(String marca, String apelido, String estilo) {
		this.marca = marca;
		this.apelido = apelido;
		this.estilo = estilo;
	}
	
	public void setConservacao(char conservacao) {
		if (conservacao == 'S') {
			this.conservacao = true;
		}
		else {
			this.conservacao = false;
		}
	}
	
	public int tempoUso(int anoAtual) {
		return (anoAtual - fabricacao);
	}
}
