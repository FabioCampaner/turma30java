package lista4classes;

public class ProdutoEletronico {
	
	private String nome;
	private double valorReais;
	private int estoque;

	
	public ProdutoEletronico (String nome, double valorReais) {
		this.nome = nome;
		this.valorReais = valorReais;
	}

	public double getValorReais() {
		return valorReais;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double valorImposto(double imposto) {
		imposto = ((this.valorReais / 100) * imposto);
		return imposto;
	}
	
}
