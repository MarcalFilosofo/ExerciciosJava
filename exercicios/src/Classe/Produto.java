package Classe;

public class Produto {
	String nome;
	double preco;
	static double desconto;
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto(String nomeInicial) {
		
	}
	
	double precoComDesconto(){
		return (preco * (1 - desconto));
	}
	
	double precoComDesconto(double descontoDoGerente){
		return this.preco * (1 - (desconto + descontoDoGerente));
	}
}
