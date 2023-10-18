# Sistema de Gestão de Usuários e Departamentos para Salesforce

## Descrição
Este é um sistema de gerenciamento de usuários, departamentos, clientes e funcionários, construído em Java. Ele permite que você realize as seguintes operações:

1. Criar um novo usuário com informações como ID, nome de usuário, senha e endereço.
2. Criar um novo departamento com informações como ID, nome, data de criação e orçamento anual.
3. Criar um novo cliente vinculado a um usuário existente e associar produtos a esse cliente.
4. Criar um novo funcionário vinculado a um usuário existente e a um departamento existente.
5. Sair do menu.

O sistema também possui validações para evitar a criação de usuários, departamentos ou clientes duplicados.

## Instruções de Uso
1. Execute o programa e siga as instruções apresentadas no console.
2. Selecione uma opção digitando o número correspondente e pressione "Enter".
3. Siga as instruções para fornecer os dados necessários para criar um usuário, departamento, cliente ou funcionário, conforme a opção selecionada.
4. O sistema fornecerá feedback sobre o sucesso ou falha da operação.
5. Repita o processo para realizar outras operações ou selecione a opção "5" para sair do programa.

**Nota:**

- Clientes só podem ser criados a partir de um usuário criado, pois em seu construtor a classe cliente precisa de uma instância de Usuario.
- Funcionários são iguais, porém além da instância de usuário precisam também de um departamento existente.
- A opção de criar um novo cliente só aparecerá no menu quando houver uma instância de usuário criada. A opção de criar um novo funcionário só aparecerá no menu quando existir uma instância de usuário e de departamento.
- Caso o usuário insira uma opção que dê acesso ao código de criação de clientes ou funcionários, mesmo que não esteja aparecendo no console, ele entrará no case da respectiva opção, e caso não tenha criado anteriormente uma instância necessária para a criação desses objetos o programa dará erro. Isso e outros erros serão corrigidos nas sprints posteriores.

## Classes
- **Main:** Esta é a classe principal que contém o método `main` e roda o menu.
- **Usuario:** Esta classe representa um usuário com atributos como ID, nome de usuário, senha e endereço.
- **Departamento:** Esta classe representa um departamento com atributos como ID, nome, data de criação e orçamento anual.
- **Funcionario:** Esta classe representa um funcionário criado a partir de um usuário com atributos como ID, salário e cargo.
- **Endereço:** Esta classe possui como atributos informações sobre o endereço de um usuário, para posterior uso nas próximas sprints.
- **Cliente:** Esta classe representa um cliente criado a partir de um usuário e possui como atributos ID, data de inclusão e um usuário. Também possui um método para adicionar produtos, que adiciona um produto a uma lista de produtos dentro da classe.
- **Produto:** Essa classe representa os produtos da Salesforce que podem ser adicionados ao Cliente.

## Requisitos
- Java Development Kit (JDK) instalado.

## Execução
1. Compile o código-fonte usando um ambiente de desenvolvimento Java ou utilizando o comando `javac Main.java` no terminal.
2. Execute o programa com o comando `java Main` no terminal.
