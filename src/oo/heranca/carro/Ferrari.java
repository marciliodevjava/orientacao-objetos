package oo.heranca.carro;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	Ferrari() {
		super(280);
	}

	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		super.setDelta(15);
	}

	@Override
	void acelerrar() {
		if (this.velocidade <= super.VELOCIDADE_MAXIMA) {
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

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}

	@Override
	public int getDelta() {
		if (this.ligarTurbo && !this.ligarAr) {
			return 35;
		} else if (this.ligarTurbo && this.ligarAr) {
			return 30;
		} else if (!this.ligarAr && !this.ligarTurbo) {
			return 20;
		} else {
			return 15;
		}
	}
}
