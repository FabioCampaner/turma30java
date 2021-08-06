package lista4classes;

public class Paciente {

	public String nome;
	public String doenca;
	private String estado; 
	private boolean internacao; 
	
	public Paciente(String nome, String doenca) {
		this.nome = nome;
		this.doenca = doenca;
	}
	
	public void setInternacao() {
		if (this.estado == "grave") {
			internacao = true;
		}
		else {
			internacao = false;
		}
	}
	
	// G - Grave, C - Controlado, L - Leve.
	public void setEstado(char estado) {
		if(estado == 'G') {
			this.estado = "grave";
		}
		else if (estado == 'C') {
			this.estado = "controlado";
		}
		else if (estado == 'L') {
			this.estado = "leve";
		}
	}

	public String getEstado() {
		return estado;
	}
	
	public boolean getInternacao() {
		return internacao;
	}
	
}
