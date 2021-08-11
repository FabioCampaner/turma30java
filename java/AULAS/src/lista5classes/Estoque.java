package lista5classes;

public class Estoque {
	
	private String produto;
	private int estoque;
	
	public Estoque(String produto, int estoque) {
		super();
		this.produto = produto;
		this.estoque = estoque;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
}
