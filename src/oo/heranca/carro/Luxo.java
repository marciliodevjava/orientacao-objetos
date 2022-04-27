package oo.heranca.carro;

public interface Luxo {

	public abstract void ligarAr();
	public abstract void desligarAr();
	default int velocidadeDoAr() {
		return 1;
	}
}
