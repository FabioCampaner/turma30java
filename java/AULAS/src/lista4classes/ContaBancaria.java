package lista4classes;

public class ContaBancaria {

	public String usuario;
	public double valorTotal;
	public boolean dividas;
	
	
	public ContaBancaria(String usuario, double valorTotal) {
		this.usuario = usuario;
		this.valorTotal = valorTotal;
	}
	
	public void setDividas(double valorPagar) {
		if (valorPagar > valorTotal) {
			dividas = true;
		}
		else {
			dividas = false;
		}
	}
	
	public void setValorTotal (double recebimentos) {
		this.valorTotal += recebimentos;
	}
}
