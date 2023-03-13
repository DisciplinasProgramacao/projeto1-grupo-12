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
        this.descricao = descricao;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void addQuantidadeEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    public void removeQuantidadeEstoque(int quantidade) {
        this.quantidadeEstoque -= quantidade;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double calcPrecoVenda(int vImposto) {

        this.precoVenda = precoCusto + margemLucro + vImposto;
        return precoVenda;
    }

    public double calcMargemLucro(double porcentLucro) {

        this.margemLucro = porcentLucro * precoCusto;
        return margemLucro;
    }

    public double calcImposto(double porcentImposto) {

        this.imposto = porcentImposto * (this.precoCusto + this.margemLucro);
        return imposto;
    }

    public boolean qtdEmEstoqueAbaixo() {

        return (quantidadeEstoque < minEstoque);
    }

    public void imprimirProduto() {
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço de Custo: " + this.precoCusto);
        System.out.println("Preço de Venda: " + this.precoVenda);
        System.out.println("Quantidade Estoque: " + this.quantidadeEstoque);
        System.out.println("Margem de lucro: " + this.margemLucro);
    }

}
