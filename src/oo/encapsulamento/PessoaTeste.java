package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Marcilio", "Silva", 45);
		p1.setIdade(121);
		p1.setNome("Marcilio");

		System.out.println(p1.getNome());
		System.out.println(p1);// Ler

	}
}
