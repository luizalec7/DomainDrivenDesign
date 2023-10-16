import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        boolean usuarioNaoCadastrado = true;

        while(true){


            if (usuarioNaoCadastrado){
                System.out.println("Selecione uma opção:\n1- Novo usuário\n2- Novo Cliente\n3- Novo Funcionário");
            }else{
                System.out.println("Selecione uma opção:\n1- Novo usuário \n2- Novo Cliente\n3- Novo Funcionário\n4- Checar usuário cadastrados.");
            }


            int opcao = scanner.nextInt();
            switch (opcao){
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

                    for (int i = 0; i < usuarios.size(); i++){
                        if (usuario.equals(usuarios.get(i))){
                            System.out.println("Usuário já adicionado.");
                            usuarioJaCriado = true;
                            break;
                        }
                    }
                    if (!usuarioJaCriado){
                        usuarios.add(usuario);
                        System.out.println("Usuário criado com sucesso!");
                        usuarioNaoCadastrado = false;
                    }
                    break;
                case 4:
                    System.out.println("Usuários cadastrados: ");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.print(usuarios.get(i).getNomeDeUsuario() + " ");
                        System.out.println();
                    }

            }


        }
    }
}
