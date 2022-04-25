package oo.heranca.carro;

public class Civic extends Carro{
	
	Civic(){
		super(220);
	}
	
	@Override
	void acelerrar() {
		if(this.velocidade <= super.VELOCIDADE_MAXIMA) {
			super.velocidade = super.velocidadeAtual += 10;			
		} else {
		super.velocidade = super.velocidadeAtual;
		}
	}
}
