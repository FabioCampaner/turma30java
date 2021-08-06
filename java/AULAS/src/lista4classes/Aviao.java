package lista4classes;

public class Aviao {

	public String marca;
	public double tamanhoMetros;
	public String piloto;
	public boolean manutencao;
	public boolean motor;
	
	public Aviao (String marca, String piloto) {
		this.marca = marca;
		this.piloto = piloto;
	}
	
	public boolean ligarMotor(char ordem) {
		
		if (ordem == 'S') {
		return motor = true;
		}
		else {
		return motor = false;
		}
	}
		
	public double horasViagem (double quilometros, double velocidade) {
		double numeroDehoras = quilometros / velocidade;
		return numeroDehoras;
	}
	
	public void possibilidadeVoar () {
		if (this.manutencao) {
			System.out.println("Está apto para voar");	
		}
		else {
			System.out.println("O avião precisa de reparos!\n Proibido de voar.");
		}
		
	}
}
