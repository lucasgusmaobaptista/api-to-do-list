<h1 align="center">
  TODO List
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Linkedin&message=devlucasgusmao&color=1921E1&labelColor=000000" alt="devlucasgusmao" />
</p>

API para gerenciar tarefas (CRUD), que faz parte de um [desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para a vaga de desenvolvedor backend júnior na Simplify.

## Tecnologias Utilizadas
 
- [Java](https://docs.oracle.com/en/java/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [MySql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

Acessando a API utilizando o Local Host: [localhost:8080](http://localhost:8080)

Acessando a API utilizando o Swagger (dependência inclusa no projeto): [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Endpoints da API

As requisições HTTP foram feitas através do [Insomnia](https://insomnia.rest/), mas você pode usar uma ferramente de sua preferência.

- Criar Tarefa 
```
[POST] http://localhost:8080/todos

  {
		"nome": "Comer",
		"descricao": "comer",
		"realizado": false,
		"prioridade": 10
  }
```

- Listar Tarefas
```
[GET] http://localhost:8080/todos

  {
    "id": 1,
		"nome": "Comer",
		"descricao": "comer",
		"realizado": false,
		"prioridade": 10
  }
```

- Atualizar Tarefa
```
[PUT] http://localhost:8080/todos/1

  {
		"nome": "Comer",
		"descricao": "comer",
		"realizado": true,
		"prioridade": 10
  }
```

- Remover Tarefa
```
[DELETE] http://localhost:8080/todos/1
```
