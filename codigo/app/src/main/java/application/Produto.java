package application;

public class Produto {
    private String descricao;
    private double precoCusto;
    private double precoVenda;
    private int quantidadeEstoque;
    private double margemLucro;
    private static int minEstoque = 5;
    private double imposto;

    public Produto(String descricao, double precoCusto, double precoVenda, int quantidadeEstoque, double margemLucro) {
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.quantidadeEstoque = quantidadeEstoque;
        this.margemLucro = margemLucro;
        this.imposto = imposto;
    }

    public Produto() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.length()>3){
            this.descricao = descricao;
        }
    }  

    public double getImposto() {
        return imposto;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        if(precoCusto > 0.01){
            this.precoCusto = precoCusto;
        }
    }

    public double getPrecoVenda() {
        return precoVenda;
    }
    
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    
    public double getMargemLucro() {
        return margemLucro;
    }

    /**
     * adiciona a quantidade no produto
     * @param quantidade
     */
    public void addQuantidadeEstoque(int quantidade) {
        if(quantidade > 0) {
            this.quantidadeEstoque += quantidade;
        }
    }

    /**
     * remove a quantidade do produto, se a quantidade total no final for maior ou igual a 0
     * @param quantidade
     */
    public void removeQuantidadeEstoque(int quantidade) {
        if((quantidade>0) && (quantidade <= this.quantidadeEstoque)){
            this.quantidadeEstoque -= quantidade;
        }
    }


    /**
     * calcula e retorna o preço de venda
     * @param vImposto
     * @return
     */
    public double calcPrecoVenda(int vImposto) {

        this.precoVenda = precoCusto + margemLucro + vImposto;
        return precoVenda;
    }

    /**
     * calcula e retorna a margem de lucro
     * @param porcentLucro
     * @return
     */
    public double calcMargemLucro(double porcentLucro) {

        if((porcentLucro>=0.3) && porcentLucro<= 0.8){
            this.margemLucro = porcentLucro * precoCusto;
        }
       
        return margemLucro;
    }

    /**
     * calcula e retorna o imposto
     * @param porcentImposto
     * @return
     */
    public double calcImposto() {

        double porcentImposto = 0.18;

        this.imposto = porcentImposto * (this.precoCusto + this.margemLucro);

        return imposto;
    }

    /**
     * retorna t/f se o produto está com a quantidade abaixo do minimo preposto
     * @return
     */
    public boolean qtdEmEstoqueAbaixo() {

        return (quantidadeEstoque < minEstoque);
    }

    /**
     * retorna todos os dados de um produto
     * @return
     */
    public String imprimirProduto() {

        String result = "";
        
        result += "Descrição: " + this.descricao + "\nPreço de Custo: " + this.precoCusto + "\nPreço de Venda: " + this.precoVenda + "\nQuantidade Estoque: " + this.quantidadeEstoque +
        "\nMargem de lucro: " + this.margemLucro;

        return result;
    }

    /**
     * retorna o valor contido no estoque
     * @return
     */
    public double valorNoEstoque() {
        return (this.precoCusto*this.quantidadeEstoque);
    }

}