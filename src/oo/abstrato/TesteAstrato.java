package oo.abstrato;

public class TesteAstrato {

	public static void main(String[] args) {
		
		Cachorro a = new Cachorro();
		System.out.println(a.mover());
		System.out.println(a.mamar());
		System.out.println(a.respirar());
	}
}
