package application;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtosList = new ArrayList<>();
    private static double valorVendido = 0;
    private static double valorGasto = 0;

    public double getValorVendido() {
        return valorVendido;
    }

    public double getValorGasto() {
        return valorGasto;
    }

    private void setValorGasto(double valor) {
        if((valor>0)) {
            valorGasto += valor;
        } 
    }

    private void setValorVendido(double valor) {
        if((valor>0)){
            valorVendido += valor;
        }
    }

    public int getQuantidade() {
        int qtd = 0;

        for (int i = 0; i < produtosList.size(); i++) {
            qtd += produtosList.get(i).getQuantidadeEstoque();
        }

        return qtd;
    }

    /**
     *  adciona um novo produto na lista do estoque
     * @param produto
     */
    public void addEstoque(Produto produto) {
        if (!produtosList.contains(produto)) {
            produtosList.add(produto);
            this.setValorGasto(produto.valorNoEstoque());
        }
    }

    /**
     * remove um produto da lista do estoque
     * @param produto
     */
    public void retirarEstoque(Produto produto) {
        if (produtosList.contains(produto)) {
            produtosList.remove(produto);
        }
    }

    /**
     * calcula e retorna o valor do estoque atual
     * @return
     */
    public double calcularValorEstoque() {
        double valorTotal = 0;

        for (int i = 0; i < produtosList.size(); i++) {
            valorTotal += produtosList.get(i).getPrecoCusto() * produtosList.get(i).getQuantidadeEstoque();
        }
        return valorTotal;
    }

    /**
     * retorna uma lista de produtos que estão com a quantidade menor que o minimo preposto 
     * @return
     */
    public List<Produto> QuaisMenorQueMinimo() {

        List<Produto> produtosAbaixoDoEstoque = new ArrayList<>();

        for (int i = 0; i < produtosList.size(); i++) {
            if (produtosList.get(i).qtdEmEstoqueAbaixo()) {
                produtosAbaixoDoEstoque.add(produtosList.get(i));
            }
        }

        return produtosAbaixoDoEstoque;
    }

    
    public String imprimirEstoque() {

        String produtosEstoque = "";

        for (int i = 0; i < produtosList.size(); i++) {

            produtosEstoque += "Produto " + i + ": " + produtosList.get(i).getDescricao() + "\n";
        }

        return produtosEstoque;
    }

    /**
     * dados de um produto específico
     * @param pesquisa
     */
    public Produto consultarProduto(String pesquisa) {

        Produto produtoConsultado = new Produto();

        for (int i = 0; i < produtosList.size(); i++) {
            if (produtosList.get(i).getDescricao().contains(pesquisa)) {
                produtoConsultado = produtosList.get(i);
            }
        }
        return produtoConsultado;
    }

    /**
     * retira certa quantidade no estoque do produto sugerido, se a quantidade total no final for maior ou igual a 0
     * @param pesquisa
     * @param quant
     */
    public void vendaQuantProd(String pesquisa, int quant) {

        for (int i = 0; i < produtosList.size(); i++) {
            if (produtosList.get(i).getDescricao().contains(pesquisa)) {
                if((produtosList.get(i).getQuantidadeEstoque()) - quant >= 0)
                produtosList.get(i).removeQuantidadeEstoque(quant);
                setValorVendido(produtosList.get(i).getPrecoVenda()*quant);
            }
        }
    }

/**
     * Adiciona uma quantidade específica dos produtos que tem a quantidade abaixo do mínimo, no estoque
     * @param quantidade
     */
    public void comprar(int quantidade) {

        List<Produto> produtosAbaixoDoEstoque;
        produtosAbaixoDoEstoque = QuaisMenorQueMinimo();

        if(quantidade>0){
            
            for (int i = 0; i < produtosAbaixoDoEstoque.size(); i++) {
                produtosAbaixoDoEstoque.get(i).addQuantidadeEstoque(quantidade);
                setValorGasto(produtosAbaixoDoEstoque.get(i).getPrecoCusto() * quantidade);
            }
        }
    }

}
