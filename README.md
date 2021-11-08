# Grupo 2 - Projeto Final Gama Academy - DevBank(BlueBank)

<br>
<div align=center>   
# Spring Boot e Spring DataJPA. - Banco BlueBank - DevBank

Projeto Final do programa IBM Blue Academy <a href="https://ibmblueacademy.corporate.gama.academy/"> BLUE ACADEMY power by Gama Academy </a>.

</div><br>

## 📚 Índice
 1. [Sobre o Desafio](#projeto)
 2. [Tecnologias Utilizadas](#tecnologias)
 3. [Rodando a Aplicação](#requisitos)
<div id='projeto'/>
<br>

## 💻 Sobre o Projeto

O banco fictício BlueBank está construindo uma nova plataforma e precisa de
uma API para gerenciar as transações. Utilize suas novas habilidades com Spring Boot e
Spring Data.
O sistema deve permitir cadastro de novos clientes, incluindo dados pessoais e
dados para contato. O cliente deve ser atrelado a uma conta bancária, com um valor
inicial de saldo. Deve ser possível fazer transferências de um cliente para outro e esse
histórico de transações entre as contas deve ser registrado.

## Tecnologias Utilizadas no Projeto

Utilizamos abaixo algumas tecnologias para o desenvolvimento deste projeto tais como:

<a href="https://trello.com/b/POKeOJoX/blue-academy-ibm">Trello</a> - Para gerenciar as tarefas de acordo com datas de entregas e prioridades<br>
<a href="https://spring.io/">SpringBoot</a> - Framework para desenvolvimento da API<br>
<a href="https://swagger.io/tools/swagger-ui">Swagger</a> - Documentação dos Endpoints da API<br>

## Rodando a Aplicação

Faça uma cópia do projeto para seu computador:

Clone o repositório:

$ git clone https://github.com/Leoracejsa/DevBank

Compilando e rodando o projeto:

Acesse o projeto por uma IDE de sua preferência: ECLIPSE, VSCODE etc.

## Endpoints a Aplicação

Inserir 1 cliente:
http://localhost:8080/client/insert

Retorna 1 único cliente:
http://localhost:8080/client/findbyId/1

Retorna lista de clientes:
http://localhost:8080/client/findAllClient

Retorna 1 única conta:
http://localhost:8080/account/1

Retorna lista de contas:
http://localhost:8080/account/findAll

Envia 1 transferência entre contas:
http://localhost:8080/account/transferAccounts

Retornando 1 número de conta:
http://localhost:8080/account/numberAccount/8963







