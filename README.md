
# 📓 Journal Application

A full-stack **Spring Boot** web application that allows users to securely register, log in, and manage personal journal entries. Built with a focus on RESTful API development, security, and clean architecture, this project showcases core backend development concepts using Java and Spring ecosystem.

## 🧰 Tech Stack

- **Backend Framework**: Spring Boot
- **Security**: Spring Security (JWT Authentication)
- **Database**: MongoDB
- **Data Access**: Spring Data MongoDB
- **API Testing**: Postman
- **Tools & IDEs**: IntelliJ IDEA, Postman
- **Build Tool**: Maven

---

## 📌 Features

- 🔐 **User Authentication**: Secure registration and login using JWT tokens.
- 📝 **Journal Entry Management**:
  - Create new journal entries.
  - View all journal entries by user.
  - Edit and delete entries.
- 🔍 **RESTful API Endpoints**: Modular and testable with Swagger/Postman.
- 🛡️ **Role-Based Authorization**: Access control for different endpoints (Admin/User).

---

## 📂 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.dipakinfotech.journalApp
│   │       ├── controller       # REST controllers
│   │       ├── entity           # Entity classes (User, JournalEntry)
│   │       ├── repository       # MongoDB repositories
│   │       ├── service          # Service layer
│   │       └── config           # Security configuration
│   └── resources
│       ├── application.properties
│       └── static/templates     # If using JSP/HTML
└── test                         # Unit/integration tests
```

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- MongoDB running locally or remotely
- Maven installed
- IDE (e.g., IntelliJ IDEA)

### Installation

```bash
git clone https://github.com/dipakborkhatariya24/Journal-Application.git
cd Journal-Application
mvn clean install
```

### Run the application

```bash
# Start MongoDB locally (if not already running)
# Then run:
mvn spring-boot:run
```

---

## 📫 API Endpoints

| Method | Endpoint                | Description                         | Access       |
|--------|-------------------------|-------------------------------------|--------------|
| POST   | `/auth/register`        | Register a new user                 | Public       |
| POST   | `/auth/login`           | Authenticate user & receive JWT     | Public       |
| GET    | `/api/entries`          | Get all entries for logged-in user | Authenticated |
| POST   | `/api/entries`          | Create a new journal entry          | Authenticated |
| PUT    | `/api/entries/{id}`     | Update an entry by ID               | Authenticated |
| DELETE | `/api/entries/{id}`     | Delete an entry by ID               | Authenticated |

---

## 🔐 Security

- JWT token-based authentication
- Password hashing using BCrypt
- Role-based access using Spring Security

---


## 🧪 Testing

You can use **Postman** to test the APIs. Make sure to include the JWT token in the `Authorization` header as follows:

```
Authorization: Bearer <your-token-here>
```

---

## 📁 Sample `.application.properties`

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/journaldb
spring.data.mongodb.database=journaldb

spring.security.jwt.secret=yourSecretKey
spring.security.jwt.expirationMs=86400000
```

---

## ✍️ Author

**Dipak Borkhatariya**  
GitHub: [@dipakborkhatariya24](https://github.com/dipakborkhatariya24)
LinkedIN: [dipak borkhatariya](https://www.linkedin.com/in/dipak-borkhatariya-ab4104274)

---

## 📄 License

This project is open-source and free to use for educational purposes.
