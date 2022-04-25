package oo.heranca.carro;

public class Carro {

	protected int velocidadeAtual;
	protected int velocidade;
	final int VELOCIDADE_MAXIMA;
	int delta = 5;

	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	void acelerrar() {
		if (this.velocidadeAtual + this.delta > this.VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			this.velocidade = this.velocidadeAtual + this.delta;
		}
	}

	boolean frear() {
		if (this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
			this.velocidade = this.velocidadeAtual;
			return true;
		} else {
			this.velocidadeAtual = 0;
			return false;
		}
	}

	int velocidadeDoCarro() {
		return this.velocidade;
	}
}
