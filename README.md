# Spring Boot Backend Project

Este projeto foi gerado utilizando o [Spring Boot](https://spring.io/projects/spring-boot). O objetivo do projeto é **estudo de Angular e Spring Boot (Java)**, criando um sistema completo com **Frontend e Backend separados**, **utilizando MySQL como banco de dados**.

O sistema inclui as seguintes funcionalidades principais:

* **Sistema de Login** de usuários/administradores.
* **Listagem de funcionários** com integração completa com o banco.
* **Cadastro de novos funcionários**.
* **Atualização e remoção de funcionários**.
* **Suporte a Tema e Idioma**, permitindo personalização de aparência e idioma do sistema pelo usuário.

---

## 🚀 Configuração e Execução do Projeto

Para rodar o backend localmente:

1. Certifique-se de ter o **MySQL** instalado e rodando.
2. Crie um banco de dados, por exemplo: `backend_db`.
3. Configure as credenciais de acesso no arquivo `application.properties` ou `application.yml`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/backend_db
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

4. Build do projeto:

```bash
mvn clean install
```

5. Rodar o servidor de desenvolvimento:

```bash
mvn spring-boot:run
```

O backend estará disponível em:

```
http://localhost:8080/
```

---

## 🏗️ Estrutura do Projeto

```
backend/
 ├─ .mvn/
 ├─ src/
 │   ├─ main/
 │   │   ├─ java/
 │   │   │   └─ com/pieralini/backend/
 │   │   │       ├─ config/           # Configurações gerais do sistema, DB, CORS, segurança
 │   │   │       ├─ controllers/      # Controladores REST para endpoints
 │   │   │       ├─ models/           # Classes de modelo/entidade (Funcionario, Usuario, etc.)
 │   │   │       ├─ queries/          # Queries SQL customizadas
 │   │   │       ├─ repositories/     # Repositórios Spring Data JPA
 │   │   │       ├─ services/         # Serviços de negócio
 │   │   │       ├─ utils/            # Classes utilitárias (SQL Runner, Helpers)
 │   │   │       └─ BackendApplication.java
 │   │   └─ resources/
 │   │       ├─ database/             # Scripts de banco (opcional)
 │   │       ├─ application.properties
 │   │       └─ application.yml
 │   └─ test/
 ├─ target/
 └─ pom.xml
```

Essa organização separa claramente **configuração, controladores, modelos, queries, repositórios, serviços e utilitários**, facilitando manutenção e escalabilidade.

---

## 💻 Funcionalidades Detalhadas

### Funcionários

* **Listagem**: endpoints para recuperar todos os funcionários do banco.
* **Adicionar funcionário**: integração com formulários do Angular para criar registros.

### Personalização

* **Tema**: o sistema suporta mudança de tema, que é persistida no Frontend (Angular).
* **Idioma**: o sistema suporta múltiplos idiomas, com carregamento do idioma salvo no Frontend.

---

## 🔧 Rodando com Git

```bash
# Clonar o repositório
git clone https://github.com/igorpieralini/Project-Backend.git

# Entrar na pasta do projeto
cd Project-Backend

# Build e instalar dependências
mvn clean install
```

---

Desenvolvedor: **Igor Pieralini**
