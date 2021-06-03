package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Cantico");
		livros.push("Rebelião das Massas");
		livros.push("Smart Money");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		livros.size();
		livros.clear();
		livros.isEmpty();
		
//		livros.
	}
}
