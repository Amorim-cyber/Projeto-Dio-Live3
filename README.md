# Projeto Live DIO :three: :rocket:

> Seguindo a trilha das live codes disponibilizados pela digital innovation one, vou iniciar o terceiro projeto que consiste em criar uma aplicação baseada em microserviços utilizando o spring cloud.
>
> Objetivo aqui é aprender cada vez mais sempre! :smiley:
>
> Não posso deixar de agradecer a toda a equipe que proporcionou essa oportunidade. Fica aqui minha gratidão!
>
> **Observação importante!**
>
> Esse projeto está utilizando dependências de versões passadas, caso você esteja tendo dificuldades no andamento deste projeto vou passar aqui a solução que me ajudou a continuar:



Faça 2 modificações no arquivo build.gradle como a ilustração abaixo:

Na sessão de plugins substitua a versão de springframework.boot pela seguinte linha abaixo

```shell script
id 'org.springframework.boot' version '2.2.6.RELEASE'
```

E na sessão de depencencies altere a versão da dependency spring-boot-starter-data-elasticsearch:

```shell script
implementation 'org.springframework.boot:spring-boot-starter-data-elasticsearch:2.4.0'
```



Crédito Total ao **Sr.Kokado** por essa solução!

Segue link do artigo dele: https://digitalinnovation.one/artigos/nao-encontra-entitymapper-no-arquivo-elasticsearchconfigjava-do-modulo-product-catalog-de-microservico



#### Trilha de aprendizado:

<p style="background-color: rgba(255, 119, 0, 1); border-radius: 3px;">
<strong>COMMIT INICIAL</strong><br><br>
<strong>Parte 1:</strong><br>
Introdução a microserviços, a divisão de um sistema em multiplas aplicações independente uma das outras.<br>
<br><strong>Parte 2:</strong><br>
Aprendi um pouco mais sobre o conceito de spring, um framework que controla as instâncias de um sistema.<br>
<br></p>


<p style="background-color: rgba(187, 187, 19, 1); border-radius: 3px;">
<strong>SEGUNDO COMMIT -> Configuração do projeto</strong><br><br>
<strong>Parte 3:</strong><br>
Aprendi sobre a função health do api Actuator que verifica o status do sistema. Instalamos a imagem virtual do elasticSearch no docker.<br>
<br></p>


<p style="background-color: rgba(255, 154, 203, 1); border-radius: 3px;">
<strong>TERCEIRO COMMIT -> Colocando entidade + repositório + funcionalidades</strong><br><br>
<strong>Parte 4:</strong><br>
Foi criado a classe Product, um repositório, um controller, um método POST e um método GET. Foi nesta parte que coloquei o swagger para realizar a validação dos métodos.<br>
<br></p>


<p style="background-color: rgb(240, 240, 240); border-radius: 3px;">
<strong>QUARTO COMMIT -> Adicionando um serviço adicional</strong><br><br>
<strong>Parte 5:</strong><br>
Aprendi que microsserviços podem estar connectados a bancos de dados distintos dependendo do negócio. Foi implementado uma aplicalçao adicional ao projeto, o shopping-cart, com funcionalidades, entidades e banco de dados proprios<br>
<br></p>


<p style="background-color: rgb(60, 179, 113); border-radius: 3px;">
<strong>QUINTO COMMIT ->Adicionando o config-server ao projeto</strong><br><br>
<strong>Parte 6:</strong><br>
Testando as funcionalidade do Shopping-cart. Introdução ao conceito de Config server, um servidor que controla todas as configurações de cada microsserviço. Criado a aplicação config-server.<br>
<br></p>


<p style="background-color: #faebd7; border-radius: 3px;">
<strong>SEXTO COMMIT ->Reconfigurando product-catalog e shopping-cart</strong><br><br>
<strong>Parte 7:</strong><br>
Testando o config-server, reconfigurando product-catalog e shopping-cart.<br>
<br></p>


<p style="background-color: #c0c0c0; border-radius: 3px;">
<strong>SETIMO COMMIT ->Incorporando o service discovery</strong><br><br>
<strong>Parte 8:</strong><br>
Incorporando o service discovery, um intermediário dos requerimentos entre microsserviços. Configurando o service discovery.<br>
<br></p>

