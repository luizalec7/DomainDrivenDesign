Read Me - Sistema de Gestão de Usuários e Departamentos
Descrição
Este é um sistema de gerenciamento de usuários, departamentos, clientes e funcionários, construído em Java. Ele permite que você realize as seguintes operações:

Criar um novo usuário com informações como ID, nome de usuário, senha e endereço.
Criar um novo departamento com informações como ID, nome, data de criação e orçamento anual.
Criar um novo cliente vinculado a um usuário existente e associar produtos a esse cliente.
Criar um novo funcionário vinculado a um usuário existente e a um departamento existente.
Sair do menu.

O sistema também possui validações para evitar a criação de usuários, departamentos ou clientes duplicados.

Instruções de Uso
Execute o programa e siga as instruções apresentadas no console.

Selecione uma opção digitando o número correspondente e pressione "Enter".

Siga as instruções para fornecer os dados necessários para criar um usuário, departamento, cliente ou funcionário, conforme a opção selecionada.

O sistema fornecerá feedback sobre o sucesso ou falha da operação.

Repita o processo para realizar outras operações ou selecione a opção "5" para sair do programa.

Nota: 

Clientes só podem ser criados a partir de um usuário criado, pois em seu construtor a classe cliente precisa de uma instância de Usuario.

Funcionários são iguais, porém além da instância de usuário precisam também de um departamento existente.

A opção de criar novo cliente só aparecerá no menu uma vez que haja uma instância de usuário criada. A opção de criar novo funcionário só aparecerá no menu uma vez que exista uma instância de usuário e de departamento.

Caso o usuário insira uma opção que dê acesso ao código de criação de clientes ou funcionários, mesmo que não esteja aparecendo no console, ele entrará no case da respectiva opção, e caso não tenha criado anteriormente uma instância necessária para a criação desses objetos o programa dará erro. Isso e outros erros serão corrigidos nas sprints posteriores.


Classes:

Main: Esta é a classe principal que contém o método main e roda o menu.

Usuario: Esta classe representa um usuário com atributos como ID, nome de usuário, senha e endereço.

Departamento: Esta classe representa um departamento com atributos como ID, nome, data de criação e orçamento anual.

Funcionario: Esta classe representa um funcionário criado a partir de um usuário com atributos como ID, salário e cargo.

Endereço: Esta classe possui como atributos informações sobre o endereço de um usuário, para posterior uso nas próximas sprints.

Cliente: Esta classe representa cliente criado a partir de um usuário e possui como atributos ID, data de inclusao e um usuario. Também possui um método adiciona produtos, que adiciona um produto a uma lista de produtos dentro da classe.

Produto: Essa classe representa os produtos da Salesforce que podem ser adicionados ao Cliente.



Requisitos:
Java Development Kit (JDK) instalado.

Execução:

Compile o código-fonte usando um ambiente de desenvolvimento Java ou utilizando o comando javac Main.java no terminal.

Execute o programa com o comando java Main no terminal.
