import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Usuario{
    int id;
    Date dataInclusao;
    Usuario usuario;
    int numeroConta;
    ArrayList<Produto> produtos = new ArrayList<Produto>();


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

    }
