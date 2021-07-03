package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.funciton.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<String> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.34, 0.9);
        Produto p2 = new Produto("lapis", 12.34, 0.9);
        Produto p3 = new Produto("apontador", 12.34, 0.9);
        Produto p4 = new Produto("carro", 12.34, 0.9);
        imprimir.accept(p1);

        List<Produto> produtos = Array.asList(p1, p2, p3, p4);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(p -> System.out::println);
    }
}
