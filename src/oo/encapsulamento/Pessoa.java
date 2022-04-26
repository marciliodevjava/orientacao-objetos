package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;
	private String sobreNome;

	public Pessoa(String nome, String sobreNome, int idade) {
		setSobreNome(sobreNome);
		setNome(nome);
		setIdade(idade);
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Getters
	public int getIdade() {
		return this.idade;
	}

	// Settters
	public void setIdade(int novaIDade) {
		novaIDade = Math.abs(novaIDade);
		if (novaIDade >= 0 && novaIDade <= 120) {
			this.idade = novaIDade;
		}
	}

	@Override
	public String toString() {
		return "Olá eu sou o " + getNome() + " meu sobre nome é " + getSobreNome() + " minha idade é " + getIdade();
	}

}
