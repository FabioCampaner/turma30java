package entities;

public final class Cachorro extends Pet {

	//atributos
	private boolean latidoAlto;

	//contrutores
	public Cachorro(String raca, boolean latidoAlto) {
		super(raca);
		this.latidoAlto = latidoAlto;
	}
	
	//sobrecarga de construtores
	public Cachorro(String raca, int anoNascimento, boolean latidoAlto) {
		super(raca, anoNascimento);
		this.latidoAlto = latidoAlto;
	}

	//getters e setters
	public boolean isLatidoAlto() {
		return latidoAlto;
	}

	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}
	
	@Override
	public void emiteSom() {
		if(latidoAlto) {
			System.out.println("AU AU AU AU");
		}
		else {
			System.out.println("au au au au");
		}
	}
	
}
