Read Me - Sistema de Gestão de Usuários, Departamentos e Componentes
Descrição
Este é um sistema de gerenciamento de usuários, departamentos, clientes e funcionários, construído em Java. Ele permite que você realize as seguintes operações:

Criar um novo usuário com informações como ID, nome de usuário, senha e endereço.
Criar um novo departamento com informações como ID, nome, data de criação e orçamento anual.
Criar um novo cliente vinculado a um usuário existente e associar produtos a esse cliente.
Criar um novo funcionário vinculado a um usuário existente e a um departamento existente.
Sair do menu.
Este sistema agora inclui as seguintes classes adicionais como componentes:

Classe Endereco
A classe Endereco representa o endereço de um usuário e possui os seguintes atributos:

cep: Código de Endereçamento Postal (CEP).
rua: Nome da rua.
bairro: Nome do bairro.
cidade: Nome da cidade.
pais: Nome do país.
referencia: Campo opcional para uma referência do endereço.
Esta classe fornece métodos para acessar e definir esses atributos.

Classe Funcionario
A classe Funcionario representa um funcionário e herda da classe Usuario. Ela inclui os seguintes atributos:

id: Identificador único do funcionário.
cargo: Cargo do funcionário.
dataAdmissao: Data de admissão do funcionário.
salario: Salário do funcionário.
usuario: Referência ao usuário vinculado ao funcionário.
departamento: Referência ao departamento em que o funcionário trabalha.
A classe fornece métodos para acessar e definir esses atributos.

Classe Produto
A classe Produto representa um produto e possui os seguintes atributos:

id: Identificador único do produto.
nomeProduto: Nome do produto.
valorProduto: Valor do produto.
tipoProduto: Tipo ou descrição do produto.
A classe fornece métodos para acessar e definir esses atributos.

Classe Cliente
A classe Cliente representa um cliente vinculado a um usuário e inclui os seguintes atributos:

id: Identificador único do cliente.
dataInclusao: Data de inclusão do cliente.
usuario: Referência ao usuário vinculado ao cliente.
numeroConta: Número de conta do cliente.
produtos: Uma lista de produtos associados a este cliente.
Esta classe também oferece um método addProduto para adicionar produtos à lista de produtos do cliente.

Requisitos
Java Development Kit (JDK) instalado.
Execução
Compile o código-fonte usando um ambiente de desenvolvimento Java ou utilizando o comando javac Main.java no terminal.

Execute o programa com o comando java Main no terminal.

Observações
Certifique-se de que os objetos de usuário, departamento, cliente, funcionário e outros componentes criados sejam exclusivos, para evitar duplicatas.

O sistema atual não possui armazenamento persistente de dados, portanto, as informações inseridas serão perdidas quando o programa for encerrado.

Para fins de demonstração, o código inclui exemplos de criação de produtos Salesforce para vincular a clientes. Você pode estender essa funcionalidade, se necessário.

O sistema pode ser expandido e aprimorado de várias maneiras, como a adição de recursos de persistência de dados ou melhorias na interface do usuário.

O código contém alguns comentários para auxiliar na compreensão, mas pode ser mais documentado e modularizado, dependendo dos requisitos do projeto.

Aproveite a gestão de usuários, departamentos, clientes e funcionários com este sistema, agora com componentes adicionais!
