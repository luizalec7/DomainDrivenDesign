import java.time.LocalDate;
import java.util.Date;

public class Usuario{
     int id;
     String nomeDeUsuario;
     String senha;
     LocalDate dataRegistro;
     String nomeCompleto;
     Endereco endereco;

     Usuario(){
     }

     Usuario(int id, String nomeDeUsuario, String senha, LocalDate dataRegistro, Endereco endereco){
         this.id = id;
         this.nomeDeUsuario = nomeDeUsuario;
         this.senha = senha;
         this.dataRegistro = dataRegistro;
         this.nomeCompleto = nomeCompleto;
     }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

