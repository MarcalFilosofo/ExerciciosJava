package oo.composicao.desafio;

public class Ferrari extends Carro {
	Ferrari(){
		super(220);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	
	
}
