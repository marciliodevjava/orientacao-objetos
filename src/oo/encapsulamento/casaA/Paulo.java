package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcessos() {
		//segredo = Privado
		//facoDentroDeCasa = Pacote
		//formaDeFalar = Protected
		//todosSabem = Publico
		//System.out.println(esposa.segredo);
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
	}
}
