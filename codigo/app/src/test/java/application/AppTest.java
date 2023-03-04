package application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
class AppTest {

    private Estoque e;
    private Produto p;

    @BeforeEach
    public void startUp(){ 
        e = new Estoque();
        p = new Produto();
    }


    @Test
    public void testQuantidade() {

        assertEquals(true, e.getQuantidade()>=0);
    }

    @Test
    public void testCompraProduto() {

        e.addQtdProduto(p, 10);
        assertEquals(10, p.getQuantidadeEstoque());
        assertEquals(10, e.getQuantidade());

        e.addQtdProduto(p, 25);
        assertEquals(35, p.getQuantidadeEstoque());
        assertEquals(35, e.getQuantidade());
    }

    @Test
    public void testRetiraProduto() {

        e.removeQtdProduto(p, 10);;
        assertEquals(0, e.getQuantidade());

        e.addQtdProduto(p, 10);
        e.removeQtdProduto(p, 5);
        assertEquals(5, e.getQuantidade());
    }


}
