package Classe;


public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook");
		p1.preco = 100.00;
		Produto.desconto = 0.25;
		
		Produto p2 = new Produto("Notebook");
		p2.preco = 100.00;
		
		
		double precoFinal = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.2);

		System.out.println(precoFinal);
		System.out.println(precoFinal2);
	}
}
