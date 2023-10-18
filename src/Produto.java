public class Produto {
    int id;
    String nomeProduto;
    double valorProduto;
    String tipoProduto;

    Produto(String nomeProduto, double valorProduto, String tipoProduto){
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.tipoProduto = tipoProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
}
