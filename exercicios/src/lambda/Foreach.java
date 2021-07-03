package lambda;

import java.util.Arrays;
import java.util.List;


public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Gui", "Bia", "Lia");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n Lambda\n");
		
		aprovados.forEach((nome) -> {
			System.out.println(nome + "!!!");
		});
		
		System.out.println("\nMethod Reference");
		aprovados.forEach(
			nome -> meuImprimir(nome)
		);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é " + nome);
	}
}
