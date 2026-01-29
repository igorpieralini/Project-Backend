# Backend Spring Boot - Project

Backend developed with **Spring Boot 3.5** and **Java 17** for studying Angular integration. Uses **MySQL** as database.

## 🚀 Features

- ✅ Authentication system (Login)
- ✅ Employee CRUD
- ✅ REST API
- ✅ MySQL integration
- ✅ Spring Security

---

## 📋 Prerequisites

- Java 17+
- Maven 3.9+
- MySQL 8.0+

---

## ⚙️ Setup

### 1. Clone the repository

```bash
git clone https://github.com/igorpieralini/Project-Backend.git
cd Project-Backend
```

### 2. Configure the database

Create the database in MySQL:

```sql
CREATE DATABASE backend_db;
```

### 3. Configure credentials

Copy the example file and set your credentials:

```bash
cp src/main/resources/application.properties.example src/main/resources/application.properties
```

Edit the `application.properties` file with your credentials:

```properties
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

---

## ▶️ Running the Project

### With Maven installed:

```bash
mvn spring-boot:run
```

### With Maven Wrapper:

```bash
./mvnw spring-boot:run
```

Server will start at: **http://localhost:8080**

---

## 📁 Project Structure

```
Project-Backend/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/pieralini/backend/
│       │       ├── config/          # Configurations (CORS, Security, DB)
│       │       ├── controllers/     # REST Controllers
│       │       ├── models/          # Entities/Models
│       │       ├── queries/         # SQL Queries
│       │       ├── repositories/    # Repositories
│       │       └── utils/           # Utilities
│       └── resources/
│           └── application.properties.example
├── pom.xml
└── README.md
```

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/login` | User authentication |
| GET | `/api/funcionarios` | List all employees |
| POST | `/api/funcionarios` | Add new employee |
| PUT | `/api/funcionarios/{id}` | Update employee |
| DELETE | `/api/funcionarios/{id}` | Delete employee |

---

## 🔗 Frontend

The corresponding Angular frontend is available at:
[Project-FrontEnd](https://github.com/igorpieralini/Project-FrontEnd)

---

## 👨‍💻 Developer

**Igor Pieralini**

- GitHub: [@igorpieralini](https://github.com/igorpieralini)
