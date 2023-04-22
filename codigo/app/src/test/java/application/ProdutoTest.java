package application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
class ProdutoTest {

    private Produto p;

    @BeforeEach
    public void startUp(){ 
        p = new Produto("banana", 10, 25, 20, 2);
    }

    @Test
    public void testAddAndRemoveQuantidadeEstoque() {

        p.addQuantidadeEstoque(10);
        assertEquals(30, p.getQuantidadeEstoque());

        p.removeQuantidadeEstoque(5);
        assertEquals(25, p.getQuantidadeEstoque());
    }

    @Test //criado por João, para mostrar que não funciona.
    public void deveCalcPrecoVenda(){
        Produto p1 = new Produto("eu", 100, 0, 1000, 0.5);
        assertEquals(177.0,p1.getPrecoVenda(),0.01);
    }

    @Test //criado por João: como saber que estava funcionando?
    public void nãoPodeAdicionarNegativo(){
        Produto p1 = new Produto("eu", 100, 0, 5, 0.5);
        p1.addQuantidadeEstoque(-5);
        assertEquals(5, p1.getQuantidadeEstoque());
    }

    @Test
    public void testCalcPrecoVenda() {

        p.calcPrecoVenda(10);
        assertEquals(22, p.getPrecoVenda());
    }
    
    @Test
    public void testCalcMargemLucro() {

        p.calcMargemLucro(1.5);
        assertEquals(15, p.getMargemLucro(),0.5);
    }

    @Test
    public void testCalcImposto() {

        p.calcImposto();
        assertEquals(2.16, p.getImposto(),0.5);
    }

    @Test
    public void testQtdEmEstoqueAbaixo() {

        p.qtdEmEstoqueAbaixo();
        assertTrue(true);
    }
}

    