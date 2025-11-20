# Spring Boot Backend Project

Este projeto foi gerado utilizando o [Spring Boot](https://spring.io/projects/spring-boot). O objetivo do projeto é **estudo de Angular e Spring Boot (Java)**, criando um sistema simples de integração com Frontend e Backend separados, **utilizando MySQL como banco de dados**.

O sistema inclui:

* Sistema de Login
* Sistema de consulta de funcionários
* Sistema de adicionar funcionários
* Sistema de remoção de funcionários

---

## 🚀 Iniciando o Servidor de Desenvolvimento / Build do Projeto

Para rodar o projeto localmente e acompanhar as alterações em tempo real:

```bash
# Build do projeto
mvn clean install
```

O backend por padrão estará disponível em:

```
http://localhost:8080/
```

---

## 🏗️ Estrutura do Projeto

Segue a estrutura principal do backend:

```
backend/
 ├─ .mvn/
 ├─ src/
 │   ├─ main/
 │   │   ├─ java/
 │   │   │   └─ com/pieralini/backend/
 │   │   │       ├─ config/
 │   │   │       ├─ controllers/
 │   │   │       ├─ dto/
 │   │   │       ├─ models/
 │   │   │       ├─ queries/
 │   │   │       ├─ repositories/
 │   │   │       ├─ services/
 │   │   │       ├─ utils/
 │   │   │       └─ BackendApplication.java
 │   │   └─ resources/
 │   │       ├─ database/
 │   │       ├─ application.properties
 │   │       └─ application.yml
 │   └─ test/
 ├─ target/
 └─ pom.xml
```

Essa organização permite separar claramente configuração (`config`), controladores (`controllers`), DTOs, modelos (`models`), consultas (`queries`), repositórios (`repositories`), serviços (`services`) e utilitários (`utils`).

---

## 💻 Rodando o Projeto com Git

Para clonar e executar este backend, utilize os comandos abaixo:

```bash
# Clonar o repositório
git clone https://github.com/igorpieralini/Project-Backend.git

# Entrar na pasta do projeto
cd Project-Backend

# Build e instalar dependências
mvn clean install

# Rodar o servidor de desenvolvimento
mvn spring-boot:run
```

Desenvolvedor: **Igor Pieralini**
