package oo.heranca.carro;

public class CarroTeste {

	public static void main(String[] args) {

		Carro f1 = new Ferrari();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();

		Carro c1 = new Civic();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
	
		System.out.println("Primeira Acelerada: ");
		System.out.println("Velocidade Ferrari = " + f1.velocidade + " Kmh");
		System.out.println("Velocidade Civic = " + c1.velocidade + " Kmh");
		System.out.println();
		
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		f1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();
		c1.acelerrar();

		System.out.println("Segunda Acelerada: ");
		System.out.println("Velocidade Ferrari = " + f1.velocidade + " Kmh");
		System.out.println("Velocidade Civic = " + c1.velocidade + " Kmh");
		System.out.println();

		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();

		System.out.println("Segunda Freada: ");
		System.out.println("Velocidade Ferrari = " + f1.velocidade + " Kmh");
		System.out.println("Velocidade Civic = " + c1.velocidade + " Kmh");
		System.out.println();
	}
}
