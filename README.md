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
![image](https://user-images.githubusercontent.com/6587097/140747247-470f2695-91f1-44bd-ad19-0edb24e8b3cf.png)


Retorna lista de clientes:
http://localhost:8080/client/findAllClient
![image](https://user-images.githubusercontent.com/6587097/140747371-bc8151bc-f8f7-40b4-9123-d1cd7cbc4ff8.png)


Retorna 1 única conta:
http://localhost:8080/account/1
![image](https://user-images.githubusercontent.com/6587097/140747425-3be6d4f3-3999-4537-9d3a-eab8268cde7d.png)


Retorna lista de contas:
http://localhost:8080/account/findAll
![image](https://user-images.githubusercontent.com/6587097/140747471-30b432b4-2a3f-4f0b-a374-ce033ec0832a.png)


Envia 1 transferência entre contas:
http://localhost:8080/account/transferAccounts
![image](https://user-images.githubusercontent.com/6587097/140747522-1b16b35a-cba5-43cf-9aeb-11f70728b745.png)


Retornando 1 número de conta:
http://localhost:8080/account/numberAccount/8963
![image](https://user-images.githubusercontent.com/6587097/140747572-077933d7-2e72-4190-ba69-bc4a552cd1f8.png)

Retornando histórico de transações:
http://localhost:8080/historyTransactions/findAll
![image](https://user-images.githubusercontent.com/6587097/140756640-16844539-3bdb-4c38-a92a-d575d45a0fdd.png)


## Banco de Dados em Memória 

Abaixo encontra-se os dados inseridos diretamente da aplicação

SELECT * FROM ACCOUNT 
![image](https://user-images.githubusercontent.com/6587097/140747732-3de07e6f-4e80-4d99-9bc2-dc0005f46f21.png)

SELECT * FROM CLIENT 
![image](https://user-images.githubusercontent.com/6587097/140747832-ada984e2-1722-42a3-803a-a12657aeb8db.png)

SELECT * FROM TRANSACTIONS 
![image](https://user-images.githubusercontent.com/6587097/140747907-67d4455c-fa69-4bcd-9b06-b89c2cccaba2.png)










