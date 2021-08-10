package entities;

public final class Gato extends Pet {
	
	//atributos
	private boolean miadoAlto;

	//contrutores
	public Gato(String raca, boolean miadoAlto) {
		super(raca);
		this.miadoAlto = miadoAlto;
	}
	
	//sobrecarga de construtores
	public Gato(String raca, int anoNascimento, boolean miadoAlto) {
		super(raca, anoNascimento);
		this.miadoAlto = miadoAlto;
	}

	//getters e setters
	public boolean isMiadoAlto() {
		return miadoAlto;
	}

	public void setMiadoAlto(boolean miadoAlto) {
		this.miadoAlto = miadoAlto;
	}
	
	@Override
	public void emiteSom() {
		if(miadoAlto) {
			System.out.println("MIAU MIAU MIAU MIAU");
		}
		else {
			System.out.println("miau miau miau miau");
		}
	}
	
	
}
