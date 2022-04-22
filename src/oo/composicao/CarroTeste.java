package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		System.out.println("Carro est� ligado: " + c1.estaLigado());

		c1.ligar();
		System.out.println("Carro est� ligado: " + c1.estaLigado());

		System.out.println(c1.motor.giros());

		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.println(c1.motor.giros());

		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();

		System.out.println(c1.motor.giros());

		//Re�ao biderecional
		System.out.println(c1.motor.carro.motor.giros());
	}
}
