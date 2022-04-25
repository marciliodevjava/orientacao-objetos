package oo.encapsulamento;

public class Pessoa {

	private int idade;

	public Pessoa(int idade) {
		alterarIdade(idade);
	}

	public int lerIdade() {
		return this.idade;
	}

	public void alterarIdade(int novaIDade) {
		novaIDade = Math.abs(novaIDade);
		if (novaIDade >= 0 && novaIDade <= 120) {
			this.idade = novaIDade;
		}
	}

}
