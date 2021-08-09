package lista5classes;

public final class Cavalo extends Animal implements Sons{

	private String crina;
	private boolean sela;
	private String especie;
	
	public Cavalo(int pernas, int olhos, char pelo, String classe, int idade, boolean vida, String crina, boolean sela, String especie) {
		super(pernas, olhos, pelo, classe, idade, vida);
		this.crina = crina;
		this.sela = sela;
		this.especie = especie;
		
	}

	public String getCrina() {
		return crina;
	}

	public void setCrina(String crina) {
		this.crina = crina;
	}

	public boolean isSela() {
		return sela;
	}

	public void setSela(boolean sela) {
		this.sela = sela;
	}
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void emitirSons() {
		System.out.println("IEAA IEAA\n");
	}
	
}
