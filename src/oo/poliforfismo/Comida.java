package oo.poliforfismo;

public abstract class Comida{

	private double peso;

	public Comida(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
