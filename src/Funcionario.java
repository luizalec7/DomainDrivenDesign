import java.util.Date;

public class Funcionario extends Usuario{
    int id;
    String cargo;
    Date dataAdmissao;
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}
