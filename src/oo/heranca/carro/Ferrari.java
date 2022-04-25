package oo.heranca.carro;

public class Ferrari extends Carro {

	@Override
	void acelerrar() {
		super.velocidade = super.velocidadeAtual += 15;
	}

	@Override
	boolean frear() {
		if (super.velocidadeAtual >= 10) {
			super.velocidadeAtual -= 10;
			super.velocidade = super.velocidadeAtual;
			return true;
		} else if (super.velocidadeAtual >= 5) {
			super.velocidadeAtual -= 5;
			super.velocidade = super.velocidadeAtual;
			return true;
		}
		return false;
	}
}
