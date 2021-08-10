package lista5classes;

public abstract class Animal {

	/*
	 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela),
	 *  utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os 
	 *  animais fique na classe Animal: 
	 */
	
	private int pernas;
	private int olhos;
	private char pelo; //C- curto, L - longo
	private String classe; //Mamíferos
	private int idade;
	private boolean vida;
	
	public Animal(int pernas, int olhos, char pelo, String classe, int idade, boolean vida) {
		super();
		this.pernas = pernas;
		this.olhos = olhos;
		this.pelo = pelo;
		this.classe = classe;
		this.idade = idade;
		this.vida = vida;
		
		
	}

	public int getPernas() {
		return pernas;
	}

	public void setPernas(int pernas) {
		this.pernas = pernas;
	}

	public int getOlhos() {
		return olhos;
	}

	public void setOlhos(int olhos) {
		this.olhos = olhos;
	}

	public char getPelo() {
		return pelo;
	}

	public void setPelo(char pelo) {
		this.pelo = pelo;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isVida() {
		return vida;
	}

	public void setVida(boolean vida) {
		this.vida = vida;
	}
	
	public void emitirSons() {
		System.out.println("Emitindo o som do animal...");
		
	}
	
	
	
}
