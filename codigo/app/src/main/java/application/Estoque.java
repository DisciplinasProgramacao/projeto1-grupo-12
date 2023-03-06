package application;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private Produto produto;
    private int quantidadeEstoque;
    private List<Produto> produtos = new ArrayList<>();
    private List<Integer> quantidades = new ArrayList<>();

    public Estoque(int quantidadeEstoque) {
        
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Estoque() {
        this.quantidadeEstoque = 0;
    }

    public void addProduto(Produto produto, int quantidade) {
        if (!produtos.contains(produto)) {
            produtos.add(produto);
            quantidades.add(quantidade);
            addQtdProduto(produto, quantidade);
        } 
        else {
            int index = produtos.indexOf(produto);
            int novaQuantidade = quantidades.get(index) + quantidade;
            quantidades.set(index, novaQuantidade);
            addQtdProduto(produto, quantidade);
        }
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

    public double calcularValorEstoque() {
        double valorTotal = 0;
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            int quantidade = quantidades.get(i);
            valorTotal += produto.getPrecoCusto() * quantidade;
        }
        return valorTotal;
    }

    public String QuaisMenorQueMinimo(){
        String menor = "Nenhum";
        for (int i = 0; i < produtos.size(); i++) {
            if(produto.qtdEmEstoqueAbaixo(0)){
                menor = produto.getDescricao();
            }
        }
        return menor;
    }
        

}
