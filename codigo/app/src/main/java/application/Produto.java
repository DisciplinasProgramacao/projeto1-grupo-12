package application;

public class Produto {
    private String descricao;
    private float precoCusto;
    private float precoVenda;
    private int quantidadeEstoque;
    private float margemLucro;


    public Produto(String descricao, float precoCusto, float precoVenda, int quantidadeEstoque, float margemLucro){
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.quantidadeEstoque = quantidadeEstoque;
        this.margemLucro = margemLucro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(float margemLucro) {
        this.margemLucro = margemLucro;
    }

    public float calcPrecoVenda(int vImposto){
        
        this.precoVenda = precoCusto + margemLucro + vImposto;
        return precoVenda;
    }

    public float calcMargemLucro(float porcentLucro){

        this.margemLucro = porcentLucro * precoCusto;
        return margemLucro;
    }

    public float calcImposto(float porcentImposto){

        return (porcentImposto * (this.precoCusto + this.margemLucro));
    }

    public boolean qtdEmEstoqueAbaixo(int qtdMinima){

        if(qtdMinima < quantidadeEstoque){
            return false;
        }else{
            return true;
        }


    }


}
