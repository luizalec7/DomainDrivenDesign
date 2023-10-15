public class Endereco {
    int cep;
    String rua;
    String bairro;
    String cidade;
    String pais;
    String referencia;

    Endereco(){

    }

    Endereco(int cep, String rua, String bairro, String cidade, String pais){
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.pais = pais;
    }
}
