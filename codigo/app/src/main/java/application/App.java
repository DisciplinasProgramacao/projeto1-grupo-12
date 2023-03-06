package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Produto p1 = new Produto("banana", 10, 25, 20, 2);
        Produto p2 = new Produto("macarrao", 20, 30, 30, 2);
        Produto p3 = new Produto("linguiça", 20, 30, 3, 2);
        Produto p4 = new Produto("carne", 20, 30, 3, 2);

        Estoque e = new Estoque();

        List<Produto> produtosAbaixoDoEstoque = new ArrayList<>();

        e.reporEstoque(p1);
        e.reporEstoque(p2);
        e.reporEstoque(p3);
        e.reporEstoque(p4);

        produtosAbaixoDoEstoque = e.QuaisMenorQueMinimo();

        System.out.println(e.getQuantidade());
        System.out.println(e.calcularValorEstoque());
        e.retirarEstoque(p3);
        

        for(int i=0; i< produtosAbaixoDoEstoque.size(); i++) {
            System.out.println(produtosAbaixoDoEstoque.get(i).getDescricao());
        }

        e.imprimirEstoque();

    }
}
