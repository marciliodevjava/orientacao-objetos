package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();

	void adcionarItem(String nome, int quantidade, double preco) {
		this.adcionarItem(new Item(nome, quantidade, preco));
	}

	void adcionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}

	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}

		return total;
	}
}
