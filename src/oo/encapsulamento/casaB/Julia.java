package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();
	
	void testeAcessos() {
		//segredo = Privado
		//facoDentroDeCasa = Pacote
		//formaDeFalar = Protected
		//todosSabem = Publico
		
		//System.out.println(sogra.segredo);
		//System.out.println(sogra.facoDentroDeCasa);
		//System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	}
}
