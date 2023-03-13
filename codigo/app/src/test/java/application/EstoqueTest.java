package application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;


class EstoqueTest {

    private Estoque e;
    private Produto p1, p2, p3, p4;

    @BeforeEach
    public void startUp(){ 
        e = new Estoque();
        p1 = new Produto("banana", 10, 25, 20, 2);
        p2 = new Produto("macarrao", 20, 30, 30, 2);
        p3 = new Produto("linguiça", 20, 30, 3, 2);
        p4 = new Produto("carne", 20, 30, 3, 2);
    }


    @Test
    public void testQuantidade() {

        assertEquals(true, e.getQuantidade()>=0);
    }

    @Test
    public void reporEstoque() {

        assertEquals(0, e.getQuantidade());
        e.reporEstoque(p1);
        assertEquals(20, e.getQuantidade());
    }

    @Test
    public void testRetiraProduto() {

        e.reporEstoque(p1);
        e.reporEstoque(p2);
        
        e.retirarEstoque(p1);
        assertEquals(30, e.getQuantidade());
    }


     @Test
     public void testCalcularValorEstoque(){
         Produto p1 = new Produto("Produto 1", 10, 20, 1,2);
         Produto p2 = new Produto("Produto 2", 20, 40, 2,2);
         Produto p3 = new Produto("Produto 3", 30, 60, 1, 2);
         e.reporEstoque(p1);
         e.reporEstoque(p2);
         e.reporEstoque(p3);
         assertEquals(80, e.calcularValorEstoque());
     }

     @Test
     public void testQuaisMenorQueMinimo(){
         Produto p1 = new Produto("Produto 1", 10, 20, 0,2);
         Produto p2 = new Produto("Produto 2", 20, 40, 6,2);
         Produto p3 = new Produto("Produto 3", 30, 60, 3, 2);
         e.reporEstoque(p1);
         e.reporEstoque(p2);
         e.reporEstoque(p3);
         assertEquals("[Produto 1, Produto 3]", e.QuaisMenorQueMinimo().toString());
     }

}
