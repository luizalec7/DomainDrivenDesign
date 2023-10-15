import java.time.LocalDate;
import java.util.ArrayList;

public class Departamento {
    int id;
    String nomeDepartamento;
    LocalDate dataCriacao;
    String descricaoDepartamento;
    String valorOrcamentoAnual;
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    Departamento(){}
    Departamento(int id,
                 String nomeDepartamento,
                 LocalDate dataCriacao,
                 String valorOrcamentoAnual){
        this.id = id;
        this.nomeDepartamento = nomeDepartamento;
        this.dataCriacao = dataCriacao;
        this.valorOrcamentoAnual = valorOrcamentoAnual;
    }
    public void addFuncionario(Funcionario funcionario){
        boolean funcionarioJaAdicionado = false;
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionario.equals(funcionarios.get(i))){
                System.out.println("Funcionário já adicionado");
                funcionarioJaAdicionado = true;
                break;
            }
        }
        if (!funcionarioJaAdicionado){
            this.funcionarios.add(funcionario);
            System.out.println("Funcionário adicionado");
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDescricaoDepartamento() {
        return descricaoDepartamento;
    }

    public void setDescricaoDepartamento(String descricaoDepartamento) {
        this.descricaoDepartamento = descricaoDepartamento;
    }

    public String getValorOrcamentoAnual() {
        return valorOrcamentoAnual;
    }

    public void setValorOrcamentoAnual(String valorOrcamentoAnual) {
        this.valorOrcamentoAnual = valorOrcamentoAnual;
    }
}
