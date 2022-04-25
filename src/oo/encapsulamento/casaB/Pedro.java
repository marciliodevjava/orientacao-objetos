package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		//segredo = Privado
		//facoDentroDeCasa = Pacote
		//formaDeFalar = Protected
		//todosSabem = Publico
		
		//System.out.println(esposa.segredo);
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		
	}

}
