
# 📝 Journal Application

A full-stack **Spring Boot** and **MongoDB**-based journal management application that allows users to register, log in, and maintain their personal journal entries securely. This project follows a clean layered architecture, ensuring modularity, scalability, and maintainability.

---

## 📌 Features

- 🔐 **User Authentication**
  - Secure registration and login with role-based access
- 📘 **Journal Management**
  - Add, update, delete, and view personal journal entries
  - Filter entries from the past 7 days
- 📅 **Entry Filtering**
  - View journal entries based on date range (last 7 days)
- 🧾 **CRUD Functionality**
  - Seamless entry creation and editing
- 📦 **MongoDB Integration**
  - Efficient NoSQL document storage
- 🧩 **Modular Code Architecture**
  - Service, Repository, Controller, Entity separation

---

## 🛠️ Tech Stack

| Layer      | Technology       |
|------------|------------------|
| Backend    | Spring Boot      |
| Database   | MongoDB          |
| Security   | Spring Security  |
| Build Tool | Maven            |
| Language   | Java             |

---

## 📁 Project Structure

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

## 🔐 Authentication & Security

- Users must register and log in.
- Passwords are encrypted using `BCryptPasswordEncoder`.
- Only authenticated users can access or manage their journal data.

---

## 🧪 API Endpoints

| Endpoint                     | Method | Description                        | Auth Required |
|-----------------------------|--------|------------------------------------|----------------|
| `/api/auth/register`        | POST   | Register a new user                | ❌             |
| `/api/auth/login`           | POST   | Authenticate user & get JWT token  | ❌             |
| `/api/journal/create`       | POST   | Create a new journal entry         | ✅             |
| `/api/journal/all`          | GET    | Get all user journal entries       | ✅             |
| `/api/journal/last7days`    | GET    | Get entries from last 7 days       | ✅             |
| `/api/journal/{id}`         | DELETE | Delete specific journal entry      | ✅             |

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- MongoDB running locally or on cloud (e.g., Atlas)

### Setup Instructions

```bash
# Clone the repository
git clone https://github.com/dipakborkhatariya24/Journal-Application.git

# Navigate to the project directory
cd Journal-Application

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

### MongoDB Configuration

Update the MongoDB URI in `src/main/resources/application.properties`:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/journal_db
```

---

## 🧠 How It Works

- On login, the user receives a JWT token.
- All journal endpoints require this token in the `Authorization` header.
- Entries are stored as documents in MongoDB with references to the user ID.

---

## 📦 Future Enhancements

- ✨ Add user profile management
- 📂 Export journal entries (PDF, DOC)
- 📊 Dashboard with analytics
- 🔔 Email reminders for journaling

---

## 📃 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).

---


## 🤝 Contact

**Dipak Borkhatariya**  
📧 dipakborkhatariya24@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/dipak-borkhatariya/)  
🔗 [GitHub](https://github.com/dipakborkhatariya24)

---

⭐ If you like this project, give it a star and share it!

