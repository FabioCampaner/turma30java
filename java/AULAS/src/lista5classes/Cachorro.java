package lista5classes;

public final class Cachorro extends Animal implements Sons{

	private boolean coleira;
	private String raca;
	private char orelhas; //G - Grandes, M - Médias, P - Pequenas
	private boolean antipulgas;
	private String especie;
	
	
	public Cachorro(int pernas, int olhos, char pelo, String classe, int idade, boolean vida, boolean coleira,
			String raca, char orelhas, boolean antipulgas, String especie) {
		super(pernas, olhos, pelo, classe, idade, vida);
		this.coleira = coleira;
		this.raca = raca;
		this.orelhas = orelhas;
		this.antipulgas = antipulgas;
		this.especie = especie;
		
		
	}

	public boolean isColeira() {
		return coleira;
	}

	public void setColeira(boolean coleira) {
		this.coleira = coleira;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public char getOrelhas() {
		return orelhas;
	}

	public void setOrelhas(char orelhas) {
		this.orelhas = orelhas;
	}

	public boolean isAntipulgas() {
		return antipulgas;
	}

	public void setAntipulgas(boolean antipulgas) {
		this.antipulgas = antipulgas;
	}
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public void emitirSons() {
		System.out.println("AU AU\n");
		
	}
	
	
}
