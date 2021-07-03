package lambda;

import java.util.funciton.Predicate;


public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro =
            prod -> (prod.preco * (1 - prod.desconto)) >= 750;
        
        Produto produto = new Produto("Notebook", 3893.39, 0,15);
        System.out.println(isCaro.teste(produto));
    }
}