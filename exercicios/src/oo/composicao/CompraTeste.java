package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "João";
		c1.adicionarItem(new Item("Caneta", 20, 7.45));
		c1.adicionarItem(new Item("Borraçha", 12, 0.5));
		c1.adicionarItem(new Item("Carro", 1, 10000.00));
		c1.adicionarItem(new Item("Bola", 3, 6.5));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());

		
	}
}
