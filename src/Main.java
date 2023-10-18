import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        boolean usuarioNaoCadastrado = true;

        while(true){

            if (usuarios.isEmpty()) {
            System.out.println("Selecione uma opção:" +
                    "\n1- Novo usuário \n2- Novo Departamento\n5- Para sair do menu.");
            }
            else if (!usuarios.isEmpty() && !departamentos.isEmpty()) {
                 System.out.println("Selecione uma opção:" +
                    "\n1- Novo usuário \n2- Novo Departamento" +
                    "\n3- Novo cliente\n4- Novo funcionário.\n5- Para sair do menu.");
            }
            else{
                System.out.println("Selecione uma opção:" +
                    "\n1- Novo usuário \n2- Novo Departamento\n3- Novo Cliente\n5- Para sair do menu.");
            }

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Criando novo usuário");

                    System.out.print("id do usuário: ");
                    int idDoUsuario = scanner.nextInt();

                    System.out.print("nome de usuário: ");
                    String nomeDeUsuario = scanner.next();

                    System.out.print("Digite uma senha: ");
                    String senha = scanner.next();

                    System.out.println("Endereço");
                    System.out.print("CEP: ");
                    int cep = scanner.nextInt();

                    System.out.print("Rua: ");
                    String rua = scanner.next();

                    System.out.println("Bairro: ");
                    String bairro = scanner.next();

                    System.out.println("Cidade: ");
                    String cidade = scanner.next();

                    System.out.println("País: ");
                    String pais = scanner.next();

                    LocalDate dataRegistro = LocalDate.now();
                    Endereco endereco = new Endereco(cep, rua, bairro, cidade, pais);

                    Usuario usuario = new Usuario(
                            idDoUsuario,
                            nomeDeUsuario,
                            senha,
                            dataRegistro,
                            endereco);

                    boolean usuarioJaCriado = false;

                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuario.getId() == (usuarios.get(i).getId())) {
                            System.out.println("Usuário já adicionado.");
                            usuarioJaCriado = true;
                            break;
                        }
                    }
                    if (!usuarioJaCriado) {
                        usuarios.add(usuario);
                        System.out.println("Usuário criado com sucesso!");
                        usuarioNaoCadastrado = false;
                    }
                    break;
                case 2:
                    System.out.println("Criando novo Departamento Salesforce");
                    System.out.println("id do departamento:");
                    int idDepartamento = scanner.nextInt();

                    System.out.println("Nome do departamento");
                    String nomeDepartamento = scanner.next();

                    System.out.println("Digite um orçamento anual: ");
                    String orcamentoAnual = scanner.next();

                    LocalDate dataCriacao = LocalDate.now();

                    Departamento departamento = new Departamento(
                            idDepartamento,
                            nomeDepartamento,
                            dataCriacao,
                            orcamentoAnual);

                    boolean departamentoJaAdicionado = false;
                    for (int i = 0; i < departamentos.size(); i++) {
                        if (departamento.getId() == departamentos.get(i).getId()) {
                            System.out.println("Departamento já adicionado");
                            departamentoJaAdicionado = true;
                            break;
                        }
                    }
                    if (!departamentoJaAdicionado) {
                        departamentos.add(departamento);
                        System.out.println("Departamento criado com sucesso.");
                    }
                    break;


                case 3:
                    System.out.println("Criando novo cliente Salesforce: ");

                    System.out.println("Id do cliente: ");
                    int idCliente = scanner.nextInt();

                    LocalDate dataInclusao = LocalDate.now();

                    System.out.println("Digite o id de um usuário cadastrado para vinculá-lo ao novo cliente: ");
                    System.out.println("Lista de usuários criados e seus ids:\n ");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(
                                "Nome de usuário: "
                                        + usuarios.get(i).getNomeDeUsuario() +
                                        "\nId do usuário: " + usuarios.get(i).getId());
                    }
                    int idDoUsuarioCliente = scanner.nextInt();

                    Usuario usuarioEscolhido = null;
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).getId() == idDoUsuarioCliente) {
                            usuarioEscolhido = usuarios.get(i);
                        }
                        else{
                            System.out.println("Usuário não encontrado.");
                        }
                    }
                    Cliente cliente = new Cliente(idCliente, dataInclusao, usuarioEscolhido);

                    Produto produtoSalesforce1 = new Produto(
                            "Sales Cloud", 120.00, "CRM de vendas");
                    Produto produtoSalesforce2 = new Produto(
                            "Marketing Cloud", 130.00, "CRM de marketing");
                    Produto produtoSalesforce3 = new Produto(
                            "Service Cloud", 100.00, "CRM de suporte ao cliente");

                    System.out.println("Qual produto deseja adicionar ao carrinho?");
                    System.out.println("1 - Sales cloud.\n2 - Marketing cloud\n3 - Service cloud.");

                    int produtoEscolhido = scanner.nextInt();

                    switch (produtoEscolhido) {
                        case 1:
                            cliente.addProduto(produtoSalesforce1);
                            break;
                        case 2:
                            cliente.addProduto(produtoSalesforce2);
                            break;
                        case 3:
                            cliente.addProduto(produtoSalesforce3);
                    }

                    System.out.println("Cliente criado com sucesso ao assinar o serviço " + cliente.produtos.get(0).getNomeProduto());
                    break;

                case 4:
                    System.out.println("Criando novo funcionário");
                    System.out.println("Digite um id para o funcionário: ");
                    int idFuncionario = scanner.nextInt();

                    System.out.println("Digite o cargo: ");
                    String cargo = scanner.next();

                    LocalDate dataAdmissao = LocalDate.now();

                    System.out.println("Digite o salário: ");
                    String salario = scanner.next();


                    System.out.println("Digite o id de um usuário cadastrado para vincular ao Funcionário: ");
                    System.out.println("Lista de usuários criados e seus ids: ");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(
                                "Nome de usuário: "
                                        + usuarios.get(i).getNomeDeUsuario() +
                                        "\nId do usuário: " + usuarios.get(i).getId());
                    }
                    int idUsuarioFuncionario = scanner.nextInt();
                    Usuario usuarioEscolhidoFuncionario = null;

                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).getId() == idUsuarioFuncionario){
                            usuarioEscolhidoFuncionario = usuarios.get(i);
                        }else{
                            System.out.println("Usuário não encontrado");
                        }

                    }


                    System.out.println("Departamento do funcionário: ");

                    System.out.println("Digite o id de um departamento para enviar o funcionário: ");
                    System.out.println("Lista de departamentos criados e seus ids:\n ");
                    for (int i = 0; i < departamentos.size(); i++) {
                        System.out.println(
                                "Nome do departamento: "
                                        + departamentos.get(i).getNomeDepartamento() +
                                        "\nId do departamento: " + departamentos.get(i).getId());
                    }
                    int idDoDepartamentoEscolhido = scanner.nextInt();

                    Departamento departamentoEscolhido = null;
                    for (int i = 0; i < departamentos.size(); i++) {
                        if (departamentos.get(i).getId() == idDoDepartamentoEscolhido) {
                            departamentoEscolhido = departamentos.get(i);
                        }
                    }

                    Funcionario funcionario = new Funcionario(
                            idFuncionario,
                            cargo,
                            dataAdmissao,
                            salario,
                            usuarioEscolhidoFuncionario,
                            departamentoEscolhido);

                    System.out.println("Funcionário " + funcionario.usuario.getNomeDeUsuario() +
                            " admitido com sucesso no departamento "
                            + funcionario.departamento.getNomeDepartamento() + " com o cargo de " + funcionario.getCargo());
                    break;
                case 5:
                   System.exit(0);

                default:
                    System.out.println("Opção inválida.\n");

            }
        }
    }
}