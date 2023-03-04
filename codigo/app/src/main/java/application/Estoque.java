package application;

public class Estoque {

    private Produto produto;
    private int quantidadeEstoque;

    public Estoque(int quantidadeEstoque) {
        
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Estoque() {
        this.quantidadeEstoque = 0;
    }

    public void addProduto(Produto produto) {
        
        this.produto = produto;
    }

    public int getQuantidade() {

        return this.quantidadeEstoque;
    }

    public void removeQtdProduto(Produto produto, int qtd ) {

        if((produto.getQuantidadeEstoque()>0) && (produto.getQuantidadeEstoque() >= this.quantidadeEstoque)){
            produto.removeQuantidadeEstoque(qtd);
            this.quantidadeEstoque -= qtd;
        }
    }

    public void addQtdProduto(Produto produto, int qtd ) {

        produto.addQuantidadeEstoque(qtd);
        this.quantidadeEstoque += qtd; 
    }



}
