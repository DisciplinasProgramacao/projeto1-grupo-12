package application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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


    @Test
    public void testCalvularValorEstoque(){
        Produto p1 = new Produto("Produto 1", 10, 20, 0,2);
        Produto p2 = new Produto("Produto 2", 20, 40, 0,2);
        Produto p3 = new Produto("Produto 3", 30, 60, 0, 2);
        e.addProduto(p1,1);
        e.addProduto(p2,2);
        e.addProduto(p3,1);
        assertEquals(80, e.calcularValorEstoque());
    }

    @Test
    public void testQuaisMenorQueMinimo(){
        Produto p1 = new Produto("Produto 1", 10, 20, 0,2);
        Produto p2 = new Produto("Produto 2", 20, 40, 0,2);
        Produto p3 = new Produto("Produto 3", 30, 60, 0, 2);
        e.addProduto(p1,1);
        e.addProduto(p2,2);
        e.addProduto(p3,1);
        assertEquals("Produto 1", e.QuaisMenorQueMinimo());
    }

}
