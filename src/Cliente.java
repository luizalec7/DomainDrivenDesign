import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Usuario{
    int id;
    LocalDate dataInclusao;
    Usuario usuario;
    int numeroConta;
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    Cliente(){}
    Cliente(int id, LocalDate dataInclusao, Usuario usuario){
        this.id = id;
        this.dataInclusao = dataInclusao;
        this.usuario = usuario;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void addProduto(Produto produto){
        boolean produtoJaAdicionado = false;
        for (int i = 0; i < produtos.size(); i++) {
            if (produto.equals(produtos.get(i))){
                System.out.println("Produto já adicionado");
                produtoJaAdicionado = true;
                break;
            }
            }
        if (!produtoJaAdicionado){
            this.produtos.add(produto);
            System.out.println("Produto adicionado");
        }
        }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
