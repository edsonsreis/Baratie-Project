<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="120" height="205"/><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-plain-wordmark.svg" width="120" height="205"/> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg" width="120" height="205" />             <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/tomcat/tomcat-original.svg" width="120" height="205" />             <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/heroku/heroku-original.svg" width="120" height="205" />
          
          

# Project ER Baratie Restaurant Oficial

>  Construindo uma API REST com banco de dados usando Java e Spring Boot para o projeto final do módulo.

### Tecnologias

- Lógica de programação (Java)
- Programação orientada a objetos (Java)
- Banco de Dados (Postegree)
- Ferramentas
  - Spring Tool Suite (STS)
  - Insomnia



# Tema

------

Esta aplicação é um back-end de um restaurante chamado Baratie. 



### Visão geral do sistema

Vamos construir um pequeno sistema (API REST) de usuários e departamentos, com os seguintes casos de uso:

- Buscar todos usuários
- Buscar um usuário pelo seu id
- Inserir um novo usuário

![domain-model](https://github.com/edsonsreis/Baratie-Restaurant-Project-SpringBoot3-JPA/assets/83223751/da864a48-5d5c-4243-9fd0-00cc0004b6f3 "Domain Model")

![domain-instance](https://github.com/edsonsreis/Baratie-Restaurant-Project-SpringBoot3-JPA/assets/83223751/846d3a6c-8fc9-43d3-9de1-f5b434b1452a)



![logical-layers](https://github.com/edsonsreis/Baratie-Restaurant-Project-SpringBoot3-JPA/assets/83223751/a2ea4e0d-0a71-4675-9276-305685f7e946 "Logical Layers")



### Passos do Projeto

- Criar o projeto Spring Boot Java 
-  Implementar modelo de domínio 
- Estruturar camadas lógicas: resource, service, repository 
- Configurar banco de dados de teste (H2) 
- Povoar o banco de dados  CRUD - Create, Retrieve, Update, Delete 
- Tratamento de exceções 
- Falta: 
  - Migrations
  - Deploy corretamente no RailWay




#### Configurações do banco de dados

```
# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração para mostrar o SQL no console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

#### Script SQL

```sql
INSERT INTO tb_department(name) VALUES ('Gestão');
INSERT INTO tb_department(name) VALUES ('Informática');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');
```
#### Collection Insomnia

https://github.com/edsonsreis/DepPersonal-Project/blob/main/userdept/Insomnia_2023-10-07.json

### **Swagger**

http://localhost:8080/swagger-ui/index.html



