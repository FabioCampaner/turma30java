package entities;

public final class Ave extends Pet {
	
	//atributos
	private boolean voa;

	//contrutores
	public Ave(String raca, boolean voa) {
		super(raca);
		this.voa = voa;
	}
	
	//sobrecarga de construtores
	public Ave(String raca, int anoNascimento, boolean voa) {
		super(raca, anoNascimento);
		this.voa = voa;
	}

	//getters e setters
	public boolean isVoa() {
		return voa;
	}

	public void setVoa(boolean voa) {
		this.voa = voa;
	}
	
	@Override
	public void emiteSom() {
		System.out.println("piu piu piu");
	}
	
	
}
