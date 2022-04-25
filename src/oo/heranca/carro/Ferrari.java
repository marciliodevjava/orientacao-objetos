package oo.heranca.carro;

public class Ferrari extends Carro {

	Ferrari() {
		super(280);
	}

	@Override
	void acelerrar() {
		if(this.velocidade <= super.VELOCIDADE_MAXIMA) {
			super.velocidade = super.velocidadeAtual += 15;			
		} else {
		super.velocidade = super.velocidadeAtual;
		}
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
