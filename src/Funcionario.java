import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Funcionario extends Usuario{
    int id;
    String cargo;
    LocalDate dataAdmissao;
    String salario;

    Funcionario(){}

    Funcionario(int id, String cargo, LocalDate dataAdmissao, String salario){
        this.id = id;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
