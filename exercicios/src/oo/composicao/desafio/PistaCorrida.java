package oo.composicao.desafio;

public class PistaCorrida {
	public static void main(String[] args) {
		Uno c = new Uno();
		
		c.acelerar();
		System.out.println(c);
		c.acelerar();
		System.out.println(c);
		c.acelerar();
		System.out.println(c);
		
		Ferrari f = new Ferrari();
		
		f.acelerar();
		System.out.println(f);
		f.acelerar();
		System.out.println(f);
		f.acelerar();
		System.out.println(f);
	}
}
