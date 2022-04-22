package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adcionarItem("Caneta", 20, 7.45);
		compra1.adcionarItem("Borracha", 12, 3.89);
		compra1.adcionarItem("Caderno", 3, 18.79);

		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	}
}
