package application;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtosList = new ArrayList<>();
    private static float valorVendido;
    private static float valorGasto;

    

    public int getQuantidade() {
        int qtd = 0;

        for (int i = 0; i < produtosList.size(); i++) {
            qtd += produtosList.get(i).getQuantidadeEstoque();
        }

        return qtd;
    }

    public void addEstoque(Produto produto){
        if (!produtosList.contains(produto)) {
            produtosList.add(produto);
        } 
    }

    public void retirarEstoque(Produto produto){
        if (produtosList.contains(produto)) {
            produtosList.remove(produto);
        } 
    }

    public double calcularValorEstoque() {
        double valorTotal = 0;

        for (int i = 0; i < produtosList.size(); i++) {
            valorTotal += produtosList.get(i).getPrecoCusto() * produtosList.get(i).getQuantidadeEstoque();
        }
        return valorTotal;
    }

    public List QuaisMenorQueMinimo(){

        List<String> produtosAbaixoDoEstoque = new ArrayList<>();

        for (int i = 0; i < produtosList.size(); i++) {
            if(produtosList.get(i).qtdEmEstoqueAbaixo()){
                produtosAbaixoDoEstoque.add(produtosList.get(i).getDescricao());
            }
        }

        return produtosAbaixoDoEstoque;
    }

    public void imprimirEstoque() {

        for(int i=0; i < produtosList.size(); i++){
            System.out.println("Produto " + i + ": " + produtosList.get(i).getDescricao());
        } 
    } 

    public void consultarProduto(String pesquisa){

        for(int i = 0; i < produtosList.size(); i++){
            if(produtosList.get(i).getDescricao().contains(pesquisa)){
                produtosList.get(i).imprimirProduto();
            }
        }
    }

    public void vendaQuantProd(String pesquisa, int quant){

        for(int i = 0; i < produtosList.size(); i++){
            if(produtosList.get(i).getDescricao().contains(pesquisa)){
                produtosList.get(i).removeQuantidadeEstoque(quant);
            }
        }
    }

}
