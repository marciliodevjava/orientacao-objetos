package oo.heranca.carro;

public class Ferrari extends Carro {

	void acelerrar() {
		this.velocidade = this.velocidadeAtual += 15;
	}

	boolean frear() {
		if (this.velocidadeAtual >= 10) {
			this.velocidadeAtual -= 10;
			this.velocidade = this.velocidadeAtual;
			return true;
		} else if (this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
			this.velocidade = this.velocidadeAtual;
			return true;
		}
		return false;
	}
}
