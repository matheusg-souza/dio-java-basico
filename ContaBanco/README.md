# Desafio Sintaxe - DIO - Trilha Java Básico 

Este projeto é um simples programa em Java que simula a criação de uma conta bancária. O usuário deve fornecer informações como número da conta, número da agência, nome completo e valor de depósito. O programa então exibe uma mensagem de confirmação com esses dados.

## Funcionalidades

- Solicita ao usuário:
  - Número da conta
  - Número da agência
  - Nome completo
  - Valor para depósito inicial
- Exibe uma mensagem de boas-vindas com os dados fornecidos.

## Exceções

O programa trata a `InputMismatchException` para garantir que os dados fornecidos pelo usuário sejam válidos.

## Pré-requisitos

- Java Development Kit (JDK) instalado

## Como Executar

1. Clone o repositório ou baixe o arquivo `ContaTerminal.java`.

2. Compile o arquivo Java:
    ```sh
    javac ContaTerminal.java
    ```

3. Execute o programa:
    ```sh
    java ContaTerminal
    ```

4. Siga as instruções exibidas no terminal para inserir os dados da conta.

## Exemplo de Uso

```plaintext
Número da Conta:
12345
Número da Agência:
6789-0
Digite seu nome e sobrenome:
João da Silva
Digite o valor para depósito:
1500.00

Olá João da Silva, obrigado por criar uma conta em nosso banco, sua agência é 6789-0, conta 12345 e seu saldo 1500.0 já está disponível para saque.
