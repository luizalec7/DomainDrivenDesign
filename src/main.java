import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        cliente1.addProduto(produto1);
        cliente1.addProduto(produto1);


        Endereco enderecoUsuario = new Endereco(
                12345123,
                "rua1",
                "bairro1",
                "cidade1",
                "Brasil");

        LocalDate dataUsuario = LocalDate.of(2023, 10, 15);

        Usuario usuario = new Usuario(
                1,
                "Natan",
                "natan123",
                dataUsuario,
                "Natan Junior Rodrigues Lopes",
                enderecoUsuario);
        System.out.println(usuario.getNomeDeUsuario());
        LocalDate dataCriacaoDepartamento = LocalDate.of(2019, 04, 23);
        Departamento departamento = new Departamento(
                12345,
                "Salesforce1",
                dataCriacaoDepartamento,
                "USD$300,000.00");

    }
}
