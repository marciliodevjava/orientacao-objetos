package oo.heranca.carro;

public class Carro {

	protected int velocidadeAtual;
	protected int velocidade;

	void acelerrar() {
		this.velocidade = this.velocidadeAtual + 5;
	}

	boolean frear(){
		if(this.velocidadeAtual >= 5) {
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
