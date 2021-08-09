package lista5classes;

public final class Preguica extends Animal implements Sons {

	private int garrasComprimento;
	private boolean extincao;
	private String origemGeografica;
	private String especie;
	
	public Preguica(int pernas, int olhos, char pelo, String classe, int idade, boolean vida, int garrasComprimento,
			boolean extincao, String origemGeografica, String especie) {
		super(pernas, olhos, pelo, classe, idade, vida);
		this.garrasComprimento = garrasComprimento;
		this.extincao = extincao;
		this.origemGeografica = origemGeografica;
		this.especie = especie;
	}

	public int getGarrasComprimento() {
		return garrasComprimento;
	}

	public void setGarrasComprimento(int garrasComprimento) {
		this.garrasComprimento = garrasComprimento;
	}

	public boolean isExtincao() {
		return extincao;
	}

	public void setExtincao(boolean extincao) {
		this.extincao = extincao;
	}

	public String getOrigemGeografica() {
		return origemGeografica;
	}

	public void setOrigemGeografica(String origemGeografica) {
		this.origemGeografica = origemGeografica;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public void emitirSons() {
		System.out.println("AAAH AAAH\n");
		
	}
	
	
}
